package ru.pcs.web.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pcs.web.forms.ProductForm;
import ru.pcs.web.models.Product;
import ru.pcs.web.repositories.ProductsRepository;
import ru.pcs.web.services.ProductService;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String getProductPage(Model model){
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("product",productList);
        return "product";
    }

    @GetMapping("/product/{product-id}")
    public String getOneProductPage(Model model,@PathVariable("product-id") Long productId){
        Product product = productService.getProduct(productId);
        model.addAttribute("one_product",product);
        return "one_product";
    }


    @PostMapping("/product")
    public String addProduct(ProductForm form){
        productService.addProduct(form);
        return "redirect:/product";
    }

    @PostMapping("/product/{product-id}/delete")
    public String deleteProduct(@PathVariable("product-id") Long productId){
        productService.deleteProduct(productId);
        return "redirect:/product";
    }
    @PostMapping("/product/{product-id}/update")
    public String updateProduct(@PathVariable("product-id") Long productId){

        return "redirect:/one_product";
    }
}
