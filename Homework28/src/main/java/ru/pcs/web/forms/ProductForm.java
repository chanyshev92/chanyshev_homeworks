package ru.pcs.web.forms;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;
@Data
public class ProductForm {
    private String description;
    private Integer price;
    private Integer amount;
}
