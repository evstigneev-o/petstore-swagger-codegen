package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Error;
import io.swagger.client.model.Pet;
import io.swagger.client.model.Pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PetsApi {
  /**
   * Create a pet
   * 
   * @return Call&lt;Void&gt;
   */
  @POST("pets")
  Call<Void> createPets();
    

  /**
   * List all pets
   * 
   * @param limit How many items to return at one time (max 100) (optional)
   * @return Call&lt;Pets&gt;
   */
  @GET("pets")
  Call<Pets> listPets(
    @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * Info for a specific pet
   * 
   * @param petId The id of the pet to retrieve (required)
   * @return Call&lt;Pet&gt;
   */
  @GET("pets/{petId}")
  Call<Pet> showPetById(
    @retrofit2.http.Path("petId") String petId
  );

}
