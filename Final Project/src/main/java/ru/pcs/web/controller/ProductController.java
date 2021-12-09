package ru.pcs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.pcs.web.forms.ProductForm;
import ru.pcs.web.models.Booking;
import ru.pcs.web.models.Product;
import ru.pcs.web.services.ProductService;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getProductPage(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products",products);
        return "products";
    }

    @GetMapping("/products/{product-id}")
    public String getProductPage(Model model, @PathVariable("product-id") Integer productId){
        Product product = productService.getProduct(productId);
        model.addAttribute("product",product);
        return "product";
    }

    @GetMapping("/products/{product-id}/bookings")
    public String getBookingsByProduct(Model model,@PathVariable("product-id") Integer productId){
        List<Booking> bookings =productService.getBookingsByProduct(productId);
        List<Booking> bookingsWithoutProduct=productService.getBookingsWithoutProduct();
        model.addAttribute("bookings",bookings);
        model.addAttribute("bookingsWithoutProduct",bookingsWithoutProduct);
        return "bookings_of_product";
    }


    @PostMapping("/products")
    public String addProduct(ProductForm form){
        productService.addProduct(form);
        return "redirect:/products";
    }

    @PostMapping("/products/{product-id}/delete")
    public String deleteProduct(@PathVariable("product-id") Integer productId){
        productService.deleteProduct(productId);
        return "redirect:/products";
    }
    @PostMapping("/products/{product-id}/update")
    public String updateProduct(ProductForm form, @PathVariable("product-id") Integer productId){
        productService.updateProduct(form, productId);
        return String.format("redirect:/products/%s",productId);
    }
}
