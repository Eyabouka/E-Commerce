package org.sid.springbootecommerce.service;

import javassist.NotFoundException;
import org.sid.springbootecommerce.Repository.ProductCategoryRepository;
import org.sid.springbootecommerce.Repository.ProductRepository;
import org.sid.springbootecommerce.entities.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {
    @Autowired
     private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> loadList(){ return productCategoryRepository.findAll(); }

     public ProductCategory loadById(long id) throws NotFoundException {

        return productCategoryRepository.findById(id)
                .orElseThrow(()->{return new NotFoundException("ProductCategory  not found with id: "+id);});
    }
}

