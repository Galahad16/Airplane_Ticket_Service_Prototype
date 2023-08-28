package com.example.ticketservice.dao;

import com.example.ticketservice.model.Cancellation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancellationRepository extends CrudRepository<Cancellation, Long> {

}
