package tekup.soap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tekup.soap.Models.Credit;

public interface CreditRepository extends JpaRepository<Credit,Long> {
}
