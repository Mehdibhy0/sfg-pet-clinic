package mehdi.springframework.sfgpetclinic.repositories;

import mehdi.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
