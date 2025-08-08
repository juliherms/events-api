package com.github.juliherms.events.repositories;

import com.github.juliherms.events.models.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

    Optional<Ticket> findByEventIdAndCustomerId(Long id, Long customerId);
}
