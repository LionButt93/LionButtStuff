package com.revature.daos;

import com.revature.models.Dog;
import com.revature.models.Owner;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;

public class OwnerDAO implements OwnerDAOInterface {

    @Override
    public Owner getOwnerById(int id) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM owners WHERE owners_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Owner owner = new Owner(
                        rs.getInt("owners_id"),
                        rs.getString("owner_first_name"),
                        rs.getString("owner_last_name"),
                        rs.getString("owner_address"),
                        rs.getInt("owner_zipcode"),
                        rs.getString("phone_number"),
                        rs.getString("email")
                );
                return owner;
            }

        } catch (SQLException e) {
            System.out.println("Failed to get owner");
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean updateOwner(Owner or) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "UPDATE owners SET owner_first_name = ?, owner_last_name = ?, owner_address = ?, owner_zipcode = ?, phone_number = ?, email = ? WHERE owners_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, or.getOwner_first_name());
            ps.setString(2, or.getOwner_last_name());
            ps.setString(3, or.getOwner_address());
            ps.setInt(4, or.getOwner_zipcode());
            ps.setString(5, or.getPhone_number());
            ps.setString(6, or.getEmail());
            ps.setInt(7, or.getOwners_id());


            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.println("Failed to update dog name ");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insertOwner(Owner or) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "INSERT INTO owners (owner_first_name, owner_last_name, owner_address, owner_zipcode, phone_number, email) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, or.getOwner_first_name());
            ps.setString(2, or.getOwner_last_name());
            ps.setString(3, or.getOwner_address());
            ps.setInt(4, or.getOwner_zipcode());
            ps.setString(5, or.getPhone_number());
            ps.setString(6, or.getEmail());

            ps.executeUpdate();

            return true;
        } catch
        (SQLException e) {
            System.out.println("Failed to insert Owner ");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteOwner(int id) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "DELETE FROM owners WHERE owners_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.out.println("Failed to update owner ");
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Owner> getAllOwners() {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM owners";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            ArrayList<Owner> ownersList = new ArrayList<>();

            while (rs.next()) {
                Owner or = new Owner(
                        rs.getInt("owners_id"),
                        rs.getString("owner_first_name"),
                        rs.getString("owner_last_name"),
                        rs.getString("owner_address"),
                        rs.getInt("owner_zipcode"),
                        rs.getString("phone_number"),
                        rs.getString("email")
                );
                ownersList.add(or);
            }
            return ownersList;
        } catch (SQLException e) {
            System.out.println("Failed to get all dogs");
            e.printStackTrace();
        }

        return null;

    }
}
