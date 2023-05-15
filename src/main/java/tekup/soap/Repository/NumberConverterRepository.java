package tekup.soap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tekup.soap.Models.NumberConverter;

public interface NumberConverterRepository extends JpaRepository<NumberConverter,Long> {
}
