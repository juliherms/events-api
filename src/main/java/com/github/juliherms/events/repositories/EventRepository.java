package com.github.juliherms.events.repositories;

import com.github.juliherms.events.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

}
