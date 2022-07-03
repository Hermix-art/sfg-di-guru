package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
//@Profile("cat")  <----- moving set up to java configuration
//@Service
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
