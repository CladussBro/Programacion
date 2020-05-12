package U9.T1;

import java.sql.*;

public class principal {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery("SELECT * FROM customers WHERE state IS NULL");

            System.out.println("Listado de los customers que no tienen state (el campo state es nulo): ");
            int contador=0, contador2=0, contador3=0;
            while (rs.next()) {
                System.out.print("name = " + rs.getString("customerName"));
                System.out.println(" || id= " + rs.getString("CustomerNumber"));
                contador++;
            }
            System.out.println(contador + " campos");

            ResultSet rs2 = statement.executeQuery("SELECT payments.amount, customers.CustomerName " +
                                            "FROM payments INNER JOIN customers ON payments.CustomerNumber=customers.CustomerNumber " +
                                            "WHERE amount>30000");

            System.out.println("Listado de los payments cuyo amount sea mayor de 30.000.");

            while (rs2.next()) {
                System.out.print("Amount = " + rs.getString("amount"));
                System.out.println(" || Nombre= " + rs.getString("CustomerName"));
                contador2++;
            }
            System.out.println(contador2 + " campos");

            ResultSet rs3 = statement.executeQuery("SELECT firstName, lastName " +
                                                        "FROM employees " +
                                                        "WHERE reportsTo=1143");

            System.out.println(
                    "Listado de los employees que dan cuenta (reportsTo) al empleado con Id = 1143");

            while (rs3.next()) {
                System.out.print("Nombre = " + rs.getString("firstName"));
                System.out.println(" " + rs.getString("lastName"));
                contador3++;
            }
            System.out.println(contador3 + " campos");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
