package org.sid.springbootecommerce.service;

import javassist.NotFoundException;
import org.sid.springbootecommerce.Repository.ProductRepository;
import org.sid.springbootecommerce.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> loadByCategoryId(long id) {
        return productRepository.findByCategoryId(id);
    }

    public Product loadById(long id) throws NotFoundException {
        return productRepository.findById(id)
                .orElseThrow(()->{return new NotFoundException("Product not found with id: "+id);});
    }
    public Product loadByName(String name)throws NotFoundException{
        return productRepository.findByNameContaining(name)
                .orElseThrow(()->{return new NotFoundException("Product not found with this name : "+name);});
    }
}
