package com.bah.data.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bah.domain.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
