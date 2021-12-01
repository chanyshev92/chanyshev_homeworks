package ru.pcs.web.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.pcs.web.models.Product;

import javax.sql.DataSource;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class ProductsRepositoryImplementation implements ProductsRepository {
    //language=SQL
    private static final String SQL_INSERT = "insert into product(description, price, amount) values (?,?,?)";

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from product order by id";

    JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductsRepositoryImplementation(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final RowMapper<Product> productRowMapper = ((rs, rowNum) ->
            new Product(rs.getInt("id"), rs.getString("description"), rs.getInt("price"), rs.getInt("amount")));


    @Override
    public void save(Product product) {

        jdbcTemplate.update(SQL_INSERT, product.getDescription(), product.getPrice(), product.getAmount());
    }

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, productRowMapper);
    }

    @Override
    public List<Product> findAllByPrice(double price) {

        return findAll().stream().filter(product -> product.getPrice() == price).collect(Collectors.toList());
    }

    @Override
    public List<Product> findAllByOrdersCount(int ordersCount) {
        //language=SQL
        return jdbcTemplate.query("SELECT * FROM product WHERE id in (SELECT product_id FROM booking WHERE amount= ?)", productRowMapper, ordersCount);
    }
}