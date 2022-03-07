package ru.pcs;

import java.util.List;

public interface ProductsRepository {

    void save(Product product);

    List<Product> findAll();

    List<Product> findAllByPrice(double price);

    List<Product> findAllByOrdersCount(int ordersCount);
}
