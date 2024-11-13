package zonetech.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zonetech.farmacia.enity.Item;
import zonetech.farmacia.enity.Produto;

@Repository


public interface ItemRepository extends JpaRepository<Item, Long> {

}