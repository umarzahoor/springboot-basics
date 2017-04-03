package demo.springboot.repository;

import demo.springboot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
