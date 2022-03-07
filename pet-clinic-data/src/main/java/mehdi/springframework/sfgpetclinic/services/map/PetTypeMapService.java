package mehdi.springframework.sfgpetclinic.services.map;

import mehdi.springframework.sfgpetclinic.model.*;
import mehdi.springframework.sfgpetclinic.services.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
