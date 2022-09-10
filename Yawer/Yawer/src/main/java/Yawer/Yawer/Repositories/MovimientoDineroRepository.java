package Yawer.Yawer.Repositories;

import Yawer.Yawer.Domains.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Long> {
}
