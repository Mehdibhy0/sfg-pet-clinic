package mehdi.springframework.sfgpetclinic.repositories;

import mehdi.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
