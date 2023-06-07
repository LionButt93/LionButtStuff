package com.revature.daos;

import com.revature.models.Dog;

import java.util.ArrayList;

public interface DogDAOInterface
{
    ArrayList<Dog> getAllDogs();

    boolean updateDogName(String dog_name, int id);

    Dog insertDog(Dog dg);

    boolean deleteDog(int id);


}
