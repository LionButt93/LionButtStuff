package com.revature.services;

import com.revature.daos.DogDao;
import com.revature.models.Dog;

import java.util.ArrayList;

public class DogService
{
    private final DogDao dogDao = new DogDao();

    public ArrayList<Dog> getAllDogs()
    {
        return dogDao.getAllDogs();
    }

    public boolean updateDogName(String dog_name, int id){
        return dogDao.updateDogName(dog_name, id);
    }
    public boolean deleteDog(int id){
        return dogDao.deleteDog(id);
    }
    public Dog insertDog(Dog dg){
        return dogDao.insertDog(dg);
    }




}
