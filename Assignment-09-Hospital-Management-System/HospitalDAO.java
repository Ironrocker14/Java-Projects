
import java.util.Scanner;
import java.sql.*;

public class HospitalDAO
{
    Connection con;
    Scanner sobj = new Scanner(System.in);

    public boolean createConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital_db",
                "root",
                "Password"
            );

            System.out.println("Database Connected Successfully!");
            return true;
        }
       
        catch(Exception e)
        {
            System.out.println("Database Connection Failed: " + e);
            return false;
        }
    }

    public void addPatient()
    {
        try
        {
            System.out.print("Enter Patient ID: ");
            int id = sobj.nextInt();
            sobj.nextLine();

            System.out.print("Enter Patient Name: ");
            String name = sobj.nextLine();

            System.out.print("Enter Patient Age: ");
            int age = sobj.nextInt();
            sobj.nextLine();

            System.out.print("Enter Patient Gender: ");
            String gender = sobj.nextLine();

            System.out.print("Enter Patient Disease: ");
            String disease = sobj.nextLine();

            System.out.print("Enter Patient Appointment: ");
            String appointment = sobj.nextLine();

            String sql = "INSERT INTO patient " +
                "(id, name, age, gender, disease, appointment) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, gender);
            ps.setString(5, disease);
            ps.setString(6, appointment);

            int rows = ps.executeUpdate();

            System.out.println(
                rows > 0 ? "Patient Added Successfully!"
                         : "Patient Not Added"
            );

            ps.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Adding Patient: " + e);
        }
    }

    public void viewPatient()
    {
        try
        {
            String sql = "SELECT * FROM patient";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n----- PATIENT RECORDS -----");

            while(rs.next())
            {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Age: " + rs.getInt("age") +
                    ", Gender: " + rs.getString("gender") +
                    ", Disease: " + rs.getString("disease") +
                    ", Appointment: " + rs.getString("appointment")
                );
            }

            rs.close();
            st.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Viewing Patients: " + e);
        }
    }

    public void updatePatient()
    {
        try
        {
            System.out.print("Enter Patient ID: ");
            int id = sobj.nextInt();
            sobj.nextLine();

            System.out.print("Enter New Patient Disease: ");
            String disease = sobj.nextLine();

            String sql =
                "UPDATE patient SET disease = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, disease);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            System.out.println(
                rows > 0 ? "Patient Updated Successfully!"
                         : "Patient Not Found"
            );

            ps.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Updating Patient: " + e);
        }
    }

    public void deletePatient()
    {
        try
        {
            System.out.print("Enter Patient ID: ");
            int id = sobj.nextInt();
            sobj.nextLine();

            String sql = "DELETE FROM patient WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            System.out.println(
                rows > 0 ? "Patient Deleted Successfully!"
                         : "Patient Not Found"
            );

            ps.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Deleting Patient: " + e);
        }
    }

    public void bookAppointment()
    {
        try
        {
            System.out.print("Enter Patient ID: ");
            int id = sobj.nextInt();
            sobj.nextLine();

            System.out.print("Enter Appointment Date: ");
            String date = sobj.nextLine();

            String sql =
                "UPDATE patient SET appointment = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, date);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            System.out.println(
                rows > 0 ? "Appointment Booked Successfully!"
                         : "Patient Not Found"
            );

            ps.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Booking Appointment: " + e);
        }
    }

    public void closeConnection()
    {
        try
        {
            if(con != null && !con.isClosed())
            {
                con.close();
                System.out.println("Database Connection Closed.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Closing Connection: " + e);
        }
    }
}
