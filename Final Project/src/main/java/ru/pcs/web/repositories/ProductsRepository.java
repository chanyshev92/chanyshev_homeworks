package ru.pcs.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pcs.web.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
