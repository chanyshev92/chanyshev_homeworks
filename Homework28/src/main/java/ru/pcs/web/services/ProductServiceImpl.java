package ru.pcs.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.pcs.web.forms.ProductForm;
import ru.pcs.web.models.Product;
import ru.pcs.web.repositories.ProductsRepository;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private final ProductsRepository productsRepository;

    public ProductServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

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
    public void deleteProduct(Long productId) {

        productsRepository.delete(productId);

    }

    @Override
    public Product getProduct(Long productId) {

        return productsRepository.findByInProduct(productId);
    }
}
