package com.revature;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.revature.controllers.OwnerController;
import com.revature.daos.DogDao;
import com.revature.daos.OwnerDAO;
import com.revature.utils.ConnectionUtil;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.json.JsonMapper;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;

public class Launcher
{
    public static void hello (Context ctx)
    {
        ctx.result("Hello World");
    }
    public static void main(String[] args)
    {
        Gson gson = new GsonBuilder().create();
        JsonMapper gsonMapper = new JsonMapper() {
            @Override
            public String toJsonString(@NotNull Object obj, @NotNull Type type) {
                return gson.toJson(obj, type);
            }

            @Override
            public <T> T fromJsonString(@NotNull String json, @NotNull Type targetType) {
                return gson.fromJson(json, targetType);
            }
        };
        Javalin app = Javalin.create(config -> config.jsonMapper(gsonMapper));
        app.get("/owners", OwnerController::getAllOwners);
        app.get("/owner/{id}", OwnerController::getOwnerById);
        app.put("/owner/{id}",OwnerController::updateOwner);
        app.delete("/owner/{id}",OwnerController::deleteOwner);
        app.post("/owner",OwnerController::insertOwner);
        app.start(8080);
    }



}
