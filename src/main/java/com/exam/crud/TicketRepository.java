package com.exam.crud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	
    @Query("FROM Ticket WHERE transportName = ?1")
    List<Ticket> findByTransportName(String transportName);
    
    @Query("FROM Ticket WHERE source = ?1 AND destination = ?2")
    List<Ticket> findBySourceAndDestination(String source,String destination);

}
