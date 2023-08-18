package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Error;
import io.swagger.client.model.Pet;
import io.swagger.client.model.Pets;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PetsApi
 */
public class PetsApiTest {

    private PetsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PetsApi.class);
    }


    /**
     * Create a pet
     *
     * 
     */
    @Test
    public void createPetsTest() {
        // Void response = api.createPets();

        // TODO: test validations
    }

    /**
     * List all pets
     *
     * 
     */
    @Test
    public void listPetsTest() {
        Integer limit = null;
        // Pets response = api.listPets(limit);

        // TODO: test validations
    }

    /**
     * Info for a specific pet
     *
     * 
     */
    @Test
    public void showPetByIdTest() {
        String petId = null;
        // Pet response = api.showPetById(petId);

        // TODO: test validations
    }
}
