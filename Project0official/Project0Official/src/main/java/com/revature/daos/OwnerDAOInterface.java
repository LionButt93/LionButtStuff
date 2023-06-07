package com.revature.daos;

import com.revature.models.Dog;
import com.revature.models.Owner;

import java.util.ArrayList;

public interface OwnerDAOInterface
{
    Owner getOwnerById(int id);

    ArrayList<Owner> getAllOwners();

    boolean updateOwner(Owner or);

    boolean insertOwner(Owner or);

    boolean deleteOwner(int id);




}
