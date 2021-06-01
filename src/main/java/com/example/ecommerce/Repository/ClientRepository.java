package com.example.ecommerce.Repository;
import com.example.ecommerce.Entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
