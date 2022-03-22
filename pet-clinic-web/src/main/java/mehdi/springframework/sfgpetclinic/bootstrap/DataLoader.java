package mehdi.springframework.sfgpetclinic.bootstrap;

import mehdi.springframework.sfgpetclinic.model.Owner;
import mehdi.springframework.sfgpetclinic.model.Pet;
import mehdi.springframework.sfgpetclinic.model.PetType;
import mehdi.springframework.sfgpetclinic.model.Speciality;
import mehdi.springframework.sfgpetclinic.model.Vet;
import mehdi.springframework.sfgpetclinic.model.Visit;
import mehdi.springframework.sfgpetclinic.services.OwnerService;
import mehdi.springframework.sfgpetclinic.services.PetTypeService;
import mehdi.springframework.sfgpetclinic.services.SpecialityService;
import mehdi.springframework.sfgpetclinic.services.VetService;
import mehdi.springframework.sfgpetclinic.services.VisitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialitiesService;
    private final VisitService visitService;


    //adding bootstrap for dat

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialitiesService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count == 0){
            loadData();
        }


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology =specialitiesService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery =specialitiesService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry =specialitiesService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123");

        Pet mikesPet =new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("123123123");

        Pet FionasPet =new Pet();
        FionasPet.setPetType(savedCatType);
        FionasPet.setOwner(owner2);
        FionasPet.setBirthDate(LocalDate.now());
        FionasPet.setName("Cat");
        owner2.getPets().add(FionasPet);
        ownerService.save(owner2);

        Visit catVisit =  new Visit();
        catVisit.setPet(FionasPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy cat");

        visitService.save(catVisit);

        Set<Owner> checkowners= ownerService.findAll();
        System.out.println("number of owners is : "+checkowners.stream().count());

        Vet vet1 =new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("jason");
        vet2.setLastName("derulo");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets .............");
    }
}
