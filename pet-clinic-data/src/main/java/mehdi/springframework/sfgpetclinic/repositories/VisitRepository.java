package mehdi.springframework.sfgpetclinic.repositories;

import mehdi.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
