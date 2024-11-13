package zonetech.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zonetech.farmacia.enity.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}