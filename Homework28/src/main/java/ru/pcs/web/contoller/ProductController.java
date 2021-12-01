package ru.pcs.web.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pcs.web.models.Product;
import ru.pcs.web.repositories.ProductsRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductsRepository productsRepository;

    @PostMapping("/product")
    public String addProduct(@RequestParam("description") String description,@RequestParam("price") Integer price,@RequestParam("amount") Integer amount){
        System.out.printf("%s %d %d%n",description,price,amount);

        Product product = Product.builder()
                .description(description)
                .price(price)
                .amount(amount)
                .build();

        productsRepository.save(product);
        return "redirect:/products_add.html";
    }
}
