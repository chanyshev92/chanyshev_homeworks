package ru.pcs.web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.pcs.web.forms.ProductForm;
import ru.pcs.web.models.Booking;
import ru.pcs.web.models.Product;
import ru.pcs.web.repositories.BookingsRepository;
import ru.pcs.web.repositories.ProductsRepository;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ProductServiceImpl implements ProductService {

    private final ProductsRepository productsRepository;

    private final BookingsRepository bookingsRepository;


    @Override
    public void addProduct(ProductForm form) {
        Product product = Product.builder()
                .description(form.getDescription())
                .price(form.getPrice())
                .amount(form.getAmount())
                .build();

        productsRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public void deleteProduct(Integer productId) {

        productsRepository.deleteById(productId);

    }

    @Override
    public Product getProduct(Integer productId) {

        return productsRepository.getById(productId);
    }

    @Override
    public void updateProduct(ProductForm form, Integer productId) {

        Product product = Product.builder()
                .id(productId)
                .description(form.getDescription())
                .price(form.getPrice())
                .amount(form.getAmount())
                .build();
        productsRepository.save(product);
    }

    @Override
    public List<Booking> getBookingsByProduct(Integer productId) {
        return bookingsRepository.findAllByProduct_Id(productId);
    }

    @Override
    public List<Booking> getBookingsWithoutProduct() {
        return bookingsRepository.findAllByProductIsNull();
    }
}
