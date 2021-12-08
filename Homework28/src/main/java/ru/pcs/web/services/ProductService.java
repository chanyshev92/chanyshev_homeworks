package ru.pcs.web.services;

import ru.pcs.web.forms.ProductForm;
import ru.pcs.web.models.Product;

import java.util.List;

public interface ProductService {
    void addProduct(ProductForm form);
    List<Product> getAllProducts();

    void deleteProduct(Long productId);

    Product getProduct(Long productId);

    void updateProduct( ProductForm form,Long productId);
}
