# PetsApi

All URIs are relative to *http://petstore.swagger.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPets**](PetsApi.md#createPets) | **POST** pets | Create a pet
[**listPets**](PetsApi.md#listPets) | **GET** pets | List all pets
[**showPetById**](PetsApi.md#showPetById) | **GET** pets/{petId} | Info for a specific pet

<a name="createPets"></a>
# **createPets**
> Void createPets()

Create a pet

### Example
```java
// Import classes:
//import petstore.ApiException;
//import petstore.api.PetsApi;


PetsApi apiInstance = new PetsApi();
try {
    Void result = apiInstance.createPets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetsApi#createPets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPets"></a>
# **listPets**
> Pets listPets(limit)

List all pets

### Example
```java
// Import classes:
//import petstore.ApiException;
//import petstore.api.PetsApi;


PetsApi apiInstance = new PetsApi();
Integer limit = 56; // Integer | How many items to return at one time (max 100)
try {
    Pets result = apiInstance.listPets(limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetsApi#listPets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many items to return at one time (max 100) | [optional]

### Return type

[**Pets**](Pets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showPetById"></a>
# **showPetById**
> Pet showPetById(petId)

Info for a specific pet

### Example
```java
// Import classes:
//import petstore.ApiException;
//import petstore.api.PetsApi;


PetsApi apiInstance = new PetsApi();
String petId = "petId_example"; // String | The id of the pet to retrieve
try {
    Pet result = apiInstance.showPetById(petId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PetsApi#showPetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **String**| The id of the pet to retrieve |

### Return type

[**Pet**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

