/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesofinterestdesktop;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Michael Brown
 */
public class VehiclesOfInterestController {

    private Connection conn;

    public VehiclesOfInterestController() /*
            Description:  This constructor will create a database connection used
            throughout the life of the object;
     */ {
        try {
            // get connection object from driver 
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/VehiclesOfInterest", "VehiclesOfInterest", "voi");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    protected void finalize() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public String[][] getAllReasonsForInterest() /*
            Description:  This method returns all of the reasons for interest
            from the database and create a 2D array in the following format
            [row][col].  The first column is the reason and the second column
            is the description.
     */ {
        // create empty arry list
        ArrayList<ArrayList<String>> reasonOfInterestList = new ArrayList<ArrayList<String>>();
        ArrayList<String> tempRow;
        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select * from reason_for_interest breed order by reason");

            // loop through result set
            while (rs.next()) {
                // create empty reason of interest object
                tempRow = new ArrayList<String>();

                // load data into product object from result set
                tempRow.add(rs.getString("reason"));
                tempRow.add(rs.getString("description"));

                // put breed object on array list
                reasonOfInterestList.add(tempRow);
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[][] allReasonOfInteresttArr = new String[reasonOfInterestList.size()][2];
        for (int x = 0; x < reasonOfInterestList.size(); x++) {
            ArrayList<String> tempList = reasonOfInterestList.get(x);
            for (int y = 0; y < 2; y++) {
                String tempValue = tempList.get(y);
                allReasonOfInteresttArr[x][y] = tempValue;
            }
        }


        // return array         
        return allReasonOfInteresttArr;
    }

    public String[] allVehicleMake() /*
            Description:  This method returns all of data on make of vehicles
            and create aa array of the makes.
     */ {
        // create empty arry list
        ArrayList<String> makeList = new ArrayList<String>();

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select * from vehicle_make order by make");

            // loop through result set
            while (rs.next()) {
                // load data into make object from result set
                makeList.add(rs.getString("make"));
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[] allMakeListArr = new String[makeList.size()];

        allMakeListArr = makeList.toArray(allMakeListArr);

        // return array 
        return allMakeListArr;
    }

    public String[][] allVehicleModel() /*
            Description:  This method returns all of the vehicle models
            as a 2D array.  It is in the form of [row][column].  The first 
            column is the model, second make.
     */ {
        // create empty arry list
        ArrayList<ArrayList<String>> modelList = new ArrayList<ArrayList<String>>();
        ArrayList<String> tempRow;

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select * from vehicle_model order by model, make");

            // loop through result set
            while (rs.next()) {
                // create empty sales object
                tempRow = new ArrayList<String>();

                // load data into sales object from result set
                tempRow.add(rs.getString("model"));
                tempRow.add(rs.getString("make"));

                // put sales object on array list
                modelList.add(tempRow);
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[][] allModelListArr = new String[modelList.size()][2];

        for (int x = 0; x < modelList.size(); x++) {
            ArrayList<String> tempList = modelList.get(x);
            for (int y = 0; y < 2; y++) {
                String tempValue = tempList.get(y);
                allModelListArr[x][y] = tempValue;
            }
        }

        // return array 
        return allModelListArr;
    }

    public String[][] allVehicleOfInterest() /*
            Description:  This method returns all of the vehicle of interest
            as a 2D array.  It is in the form of [row][column].  The first 
            column is the license plate, second reason, followed by make, model
            veh_year, color, owners_name and owners_phone.
     */ {
        // create empty arry list
        ArrayList<ArrayList<String>> vehicleOfInterestList = new ArrayList<ArrayList<String>>();
        ArrayList<String> tempRow;

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select * from vehicle_of_interest  order by license_plate");

            // loop through result set
            while (rs.next()) {
                // create empty sales object
                tempRow = new ArrayList<String>();

                // load data into sales object from result set
                tempRow.add(rs.getString("license_plate"));
                tempRow.add(rs.getString("reason"));
                tempRow.add(rs.getString("make"));
                tempRow.add(rs.getString("model"));
                tempRow.add(rs.getString("veh_year"));
                tempRow.add(rs.getString("color"));
                tempRow.add(rs.getString("owners_name"));
                tempRow.add(rs.getString("owners_phone"));

                // put sales object on array list
                vehicleOfInterestList.add(tempRow);
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[][] allVehicleOfInterestListArr = new String[vehicleOfInterestList.size()][5];

        for (int x = 0; x < vehicleOfInterestList.size(); x++) {
            ArrayList<String> tempList = vehicleOfInterestList.get(x);
            for (int y = 0; y < 5; y++) {
                String tempValue = tempList.get(y);
                allVehicleOfInterestListArr[x][y] = tempValue;
            }
        }

        // return array 
        return allVehicleOfInterestListArr;
    }

    public String[] allReasonsForInterestKey() /*
            Description:  This method will return an array of all 
            key values of the reasonffor interest.
     */ {
        // create empty breed object
        ArrayList<String> reasonsForInterestList = new ArrayList<String>();

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select reason from reason_for_interest order by reason");

            // loop through result set
            while (rs.next()) {
                // load data into product object from result set
                reasonsForInterestList.add(rs.getString("reason"));
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[] reasonsForInterestListArr = new String[reasonsForInterestList.size()];

        reasonsForInterestListArr = reasonsForInterestList.toArray(reasonsForInterestListArr);

        // return array list
        return reasonsForInterestListArr;
    }

    public String[] allVehicleMakeKey() /*
            Description:  This method will return an array of all of the key
            values of make of vehicle.
     */ {
        // create empty breed object
        ArrayList<String> vehicleMakeList = new ArrayList<String>();

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select make from vehicle_make order by make");

            // loop through result set
            while (rs.next()) {
                // load data into vehicle make object from result set
                vehicleMakeList.add(rs.getString("make"));
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[] vehicleMakeListArr = new String[vehicleMakeList.size()];

        vehicleMakeListArr = vehicleMakeList.toArray(vehicleMakeListArr);

        // return array
        return vehicleMakeListArr;
    }

    public String[] allVehicleModelKey() /*
            Description:  This method will return an array of all of the key
            values of make of vehicle.
     */ {
        // create empty breed object
        ArrayList<String> vehicleModelList = new ArrayList<String>();

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select model from vehicle_model order by model");

            // loop through result set
            while (rs.next()) {
                // load data into vehicle model object from result set
                vehicleModelList.add(rs.getString("model"));
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[] vehicleModelListArr = new String[vehicleModelList.size()];

        vehicleModelListArr = vehicleModelList.toArray(vehicleModelListArr);

        // return array
        return vehicleModelListArr;
    }

    public String[] allVehicleOfInterestKey() /*
            Description:  This method will return an array of all of the 
            license plates for vehicles of interest
     */ {
        ArrayList<String> vehicleOfInterestlList = new ArrayList<String>();

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // get all product in result set
            ResultSet rs = stmt.executeQuery("Select license_plate from vehicle_of_interest order by license_plate");

            // loop through result set
            while (rs.next()) {
                // load data into license plate object from result set
                vehicleOfInterestlList.add(rs.getString("license_plate"));
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[] vehicleOfInterestListArr = new String[vehicleOfInterestlList.size()];

        vehicleOfInterestListArr = vehicleOfInterestlList.toArray(vehicleOfInterestListArr);

        // return array
        return vehicleOfInterestListArr;
    }

    public String[] getVehicleOfInterestByLicenase(String licensePlate) /*
            Description:  This method will return all of the fields for a 
            vehicle of interest given a license plate.
     */ {
        ArrayList<String> vehicleOfInterestl = new ArrayList<String>();

        try {
            // create database statement from connection
            Statement stmt = conn.createStatement();

            // all fields for vehicle of interest record
            PreparedStatement pstmt = conn.prepareStatement("Select * from vehicle_of_interest where license_plate = ?");
            pstmt.setString(1, licensePlate);

            ResultSet rs = pstmt.executeQuery();

            // loop through result set
            while (rs.next()) {
                // load data into license plate object from result set
                vehicleOfInterestl.add(rs.getString("license_plate"));
                vehicleOfInterestl.add(rs.getString("reason"));
                vehicleOfInterestl.add(rs.getString("make"));
                vehicleOfInterestl.add(rs.getString("model"));
                vehicleOfInterestl.add(rs.getString("veh_year"));
                vehicleOfInterestl.add(rs.getString("color"));
                vehicleOfInterestl.add(rs.getString("owners_Name"));
                vehicleOfInterestl.add(rs.getString("owners_phone"));
            }

            // close statement
            stmt.close();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        String[] vehicleOfInteresttArr = new String[vehicleOfInterestl.size()];

        vehicleOfInteresttArr = vehicleOfInterestl.toArray(vehicleOfInteresttArr);

        // return array
        return vehicleOfInteresttArr;
    }

    public void deleteReasonForInterestBreed(String reason) /*
            Description:  This will delete a reason of interest record.  Pass in the reason
            as a paramter and it will detele the record for that breed.
            
            NOTE: If the reason you are trying to delete is used in a vehicle of interest 
            record you will get an error.  That is expected.  
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("delete from reason_for_interest where reason = ?");
            pstmt.setString(1, reason);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void deleteVehicleMake(String make) /*
            Description:  This will delete a vehicle make record.  Pass in the make
            as a paramter and it will detele the record.
            
            NOTE: If the make you are trying to delete is used in a vehicle of interest
            record you will get an error.  That is expected.  
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("delete from vehicle_make where make = ?");
            pstmt.setString(1, make);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void deleteVehicleModel(String model) /*
            Description:  This will delete a vehilce model record.  Pass in the model
            as a paramter and it will detele the record.       
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("delete from vehicle_model where model = ?");
            pstmt.setString(1, model);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void deleteVehicleOfInterest(String licensePlate) /*
            Description:  This will delete a vehilce of interest record.  Pass in the license plate
            as a paramter and it will detele the record.       
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("delete from vehicle_of_interest where license_plate = ?");
            pstmt.setString(1, licensePlate);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void createReasonOfInterest(String reason, String description) /*
            Description:  This metohd will create a new reason of interest record.            
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("insert into reason_for_interest (reason, description) values (?, ?)");
            pstmt.setString(1, reason);
            pstmt.setString(2, description);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void createVehicleMake(String make) /*
            Description:  This metohd will create a new vechile make record.
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("insert into vehicle_make (make) values (?)");
            pstmt.setString(1, make);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void createVechileModel(String model, String make) /*
            Description:  This metohd will create a new vechile model make record.
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("insert into vehicle_model (model, make) values (?, ?)");
            pstmt.setString(1, model);
            pstmt.setString(2, make);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void createVehicleOfInterest(String licensePlate, String reason, String make,
            String model, String veh_year, String color, String ownersName, String ownersPhone) /*
            Description:  This metohd will create a new vehicle of interest record.
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("insert into vehicle_of_interest (license_plate, reason, make, model, veh_year, color, owners_name, owners_phone) values (?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, licensePlate);
            pstmt.setString(2, reason);
            pstmt.setString(3, make);
            pstmt.setString(4, model);
            pstmt.setString(5, veh_year);
            pstmt.setString(6, color);
            pstmt.setString(7, ownersName);
            pstmt.setString(8, ownersPhone);

            // execute create statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void updateReasonForInterest(String reason, String description) /*
            Description:  This metohd will update an existing reason for interest record.
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("update reason_for_interest set description =? where reason = ?");
            pstmt.setString(1, description);
            pstmt.setString(2, reason);

            // execute delete statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void updateVehicleOfInterest(String licensePlate, String reason, String make,
            String model, String veh_year, String color, String ownersName, String ownersPhone) /*
            Description:  This metohd will update an existing markey record.
            
            NOTE:  You cannot change the market of the record because it is a key.
            If you wanted to change the market of the record do a delate and create.
     */ {
        try {
            PreparedStatement pstmt = conn.prepareStatement("update vehicle_of_interest set reason = ?, "
                    + "make = ?, model = ?, veh_year = ?, color = ?, "
                    + "owners_name = ?, owners_phone = ? where license_plate =?");
            pstmt.setString(1, reason);
            pstmt.setString(2, make);
            pstmt.setString(3, model);
            pstmt.setString(4, veh_year);
            pstmt.setString(5, color);
            pstmt.setString(6, ownersName);
            pstmt.setString(7, ownersPhone);
            pstmt.setString(8, licensePlate);

            // execute create statement
            pstmt.execute();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
