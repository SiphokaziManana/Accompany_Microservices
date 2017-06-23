package com.clientservice.repository;

import com.clientservice.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findById(String id);
    Client findByClientEmail(String email);
}