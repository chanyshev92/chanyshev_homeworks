package ru.pcs;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {

        DataSource dataSource =new DriverManagerDataSource("jdbc:postgresql://localhost:5432/pcs","postgres","qwertyui");

        ProductsRepository productsRepository = new ProductsRepositoryImplementation(dataSource);
        System.out.println(productsRepository.findAll());
        System.out.println(productsRepository.findAllByPrice(69));
        System.out.println(productsRepository.findAllByOrdersCount(1));
    }
}
