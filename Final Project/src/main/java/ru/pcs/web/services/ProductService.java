package ru.pcs.web.services;

import ru.pcs.web.forms.ProductForm;
import ru.pcs.web.models.Booking;
import ru.pcs.web.models.Product;

import java.util.List;

public interface ProductService {
    void addProduct(ProductForm form);
    List<Product> getAllProducts();

    void deleteProduct(Integer productId);

    Product getProduct(Integer productId);

    void updateProduct( ProductForm form,Integer productId);

    List<Booking> getBookingsByProduct(Integer productId);

    List<Booking> getBookingsWithoutProduct();

}
