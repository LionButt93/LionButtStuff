package com.revature.services;

import com.revature.daos.OwnerDAO;
import com.revature.models.Owner;

import java.util.ArrayList;

public class OwnerService
{
    private final OwnerDAO ownerDAO = new OwnerDAO();

    public Owner getOwnerById(int id){
        return ownerDAO.getOwnerById(id);
    }
    public boolean updateOwner(Owner or){
        return ownerDAO.updateOwner(or);
    }
    public boolean insertOwner(Owner or){
        return ownerDAO.insertOwner(or);
    }
    public boolean deleteOwner(int id){
        return ownerDAO.deleteOwner(id);
    }
    public ArrayList<Owner> getAllOwners(){
        return ownerDAO.getAllOwners();
    }


}
