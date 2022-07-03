package com.springframework.pets;

/**
 * @author Herman Kulik
 */
// set up will be in java configuration
public class PetServiceFactory {

    public PetService getPetService(String type) {
        switch (type) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return null;
        }
    }
}
