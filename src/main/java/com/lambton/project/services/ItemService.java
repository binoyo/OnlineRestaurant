package com.lambton.project.services;

import java.util.List;

import com.lambton.project.commands.ItemForm;
import com.lambton.project.domain.Item;

/**
 * Created by Muhammad Ihsan
 */
public interface ItemService {

    List<Item> listAll();

    Item getById(Long id);

    Item saveOrUpdate(Item item);

    void delete(Long id);

    Item saveOrUpdateItemForm(ItemForm itemForm);
}
