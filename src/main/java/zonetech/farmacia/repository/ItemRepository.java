package zonetech.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zonetech.farmacia.enity.Item;

@Repository

public interface ItemRepository extends JpaRepository<Item, Long> {
}
