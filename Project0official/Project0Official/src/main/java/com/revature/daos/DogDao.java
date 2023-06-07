package com.revature.daos;

import com.revature.models.Dog;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;

public class DogDao implements DogDAOInterface {
    @Override
    public ArrayList<Dog> getAllDogs() {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM dogs";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            ArrayList<Dog> dogsList = new ArrayList<>();

            while (rs.next()) {
                Dog dog = new Dog(
                        rs.getInt("dog_id"),
                        rs.getString("dog_name"),
                        rs.getString("date_born"),
                        rs.getString("dog_breed"),
                        rs.getString("dog_size"),
                        rs.getString("dog_color"),
                        rs.getString("dog_gender"),
                        rs.getBoolean("vaccinations"),
                        rs.getInt("owner_id_fk")

                );
                dogsList.add(dog);
            }
            return dogsList;
        } catch (SQLException e) {
            System.out.println("Failed to get all dogs");
            e.printStackTrace();
        }

        return null;
    }



    @Override
    public boolean updateDogName(String dog_name, int id) {
        try (Connection conn = ConnectionUtil.getConnection())
        {
            String sql = "UPDATE dogs SET dog_name = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dog_name);
            ps.setInt(2, id);

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Failed to update dog name ");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Dog insertDog(Dog dg) {
        try (Connection conn = ConnectionUtil.getConnection())
        {
            String sql = "INSERT INTO dogs (dog_name, date_born, dog_breed, dog_size, dog_color, dog_gender, vaccinations, owner_id_fk) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dg.getDog_name());
            ps.setString(2,dg.getDate_born());
            ps.setString(3,dg.getDog_breed());
            ps.setString(4,dg.getDog_size());
            ps.setString(5,dg.getDog_color());
            ps.setString(6,dg.getDog_gender());
            ps.setBoolean(7,dg.getVaccinations());
            ps.setInt(8,dg.getOwner_id_fk());

            ps.executeUpdate();

            return dg;
        }
        catch(SQLException e)
        {
            System.out.println("Failed to insert dog ");
            e.printStackTrace();}

        return null;
    }

    @Override
    public boolean deleteDog(int id) {
        try (Connection conn = ConnectionUtil.getConnection())
        {
            String sql = "DELETE FROM dogs WHERE dog_id = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Failed to update dog ");
            e.printStackTrace();
        }
        return false;
    }
}
