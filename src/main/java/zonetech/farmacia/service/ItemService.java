package zonetech.farmacia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zonetech.farmacia.enity.Item;
import zonetech.farmacia.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service

public class ItemService {

    @Autowired

    private ItemRepository itemRepository;


    public List<Item> getAllItems(){
        return itemRepository.findAll();


    }




    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }



    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item itemDatails ) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item não encontrado:"  + id));
        item.setName(itemDatails.getName());
        item.setDescription(itemDatails.getDescription());
        item.setQuantity(itemDatails.getQuantity());
        item.setPrice(itemDatails.getPrice());
        return itemRepository.save(item);

    }

    public void deleteItem(Long id) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item não encontrado"));
        itemRepository.delete(item);


    }

}
