package ru.pcs.web.repositories;

import ru.pcs.web.models.Product;

import java.util.List;

public interface ProductsRepository {

    void save(Product product);

    List<Product> findAll();

    List<Product> findAllByPrice(double price);

    List<Product> findAllByOrdersCount(int ordersCount);
}
