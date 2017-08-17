package com.lambton.project.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lambton.project.domain.Item;

/**
 * Created by Mohammad Ihsan
 */
public interface ItemRepository extends CrudRepository<Item, Long> {
}
