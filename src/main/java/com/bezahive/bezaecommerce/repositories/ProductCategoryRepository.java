package com.bezahive.bezaecommerce.repositories;

import com.bezahive.bezaecommerce.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//add cross-origin support
@CrossOrigin("http://localhost:4200")

// add RepositoryRestResource annotation
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
