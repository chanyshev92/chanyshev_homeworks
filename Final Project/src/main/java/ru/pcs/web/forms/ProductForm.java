package ru.pcs.web.forms;

import lombok.Data;

@Data
public class ProductForm {
    private String description;
    private Integer price;
    private Integer amount;
}
