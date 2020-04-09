package kg.megacom.repository;

import kg.megacom.models.entity.Customer;
import kg.megacom.models.entity.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
