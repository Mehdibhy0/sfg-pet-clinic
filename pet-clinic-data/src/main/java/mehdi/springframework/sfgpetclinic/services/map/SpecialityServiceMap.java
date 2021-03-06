package mehdi.springframework.sfgpetclinic.services.map;

import mehdi.springframework.sfgpetclinic.model.*;
import mehdi.springframework.sfgpetclinic.services.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {

        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
