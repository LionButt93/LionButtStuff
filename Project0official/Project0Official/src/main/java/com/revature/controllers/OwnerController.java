package com.revature.controllers;

import com.revature.models.Owner;
import com.revature.services.OwnerService;
import io.javalin.http.Context;
import io.javalin.http.HttpStatus;

public class OwnerController
{
    private final static OwnerService ownerService = new OwnerService();
    public static void getAllOwners (Context ctx) {
        ctx.json(ownerService.getAllOwners());
    }
    public static void getOwnerById (Context ctx) {
        int id = Integer.parseInt(ctx.pathParam("id"));
        ctx.json(ownerService.getOwnerById(id));
    }
    public static void  updateOwner(Context ctx) {
        Owner owner = ctx.bodyAsClass(Owner.class);
        owner.setOwners_id(Integer.parseInt(ctx.pathParam("id")));
        if (ownerService.updateOwner(owner)) {
            ctx.result("Successfully updated owner");
        } else {
            ctx.status(HttpStatus.BAD_REQUEST);
            ctx.result("Failed to update owner");
        }
    }
    public static void deleteOwner(Context ctx)
    {
        int id = Integer.parseInt(ctx.pathParam("id"));
       if (ownerService.deleteOwner(id)){
           ctx.result("Successfully deleted Owner");
       } else {
           ctx.status(HttpStatus.BAD_REQUEST);
           ctx.result("Failed to delete owner");
       }
    }
    public static void insertOwner(Context ctx){
        Owner owner = ctx.bodyAsClass(Owner.class);
        if (ownerService.insertOwner(owner)) {
            ctx.result("Successfully added a new owner");
        } else {
            ctx.status(HttpStatus.BAD_REQUEST);
            ctx.result("Failed to add new owner");
        }

    }

}
