package mehdi.springframework.sfgpetclinic.services;

import mehdi.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);



}
