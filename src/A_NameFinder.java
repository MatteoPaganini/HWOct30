import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/***
 * Problem: You are given an email address, and you need to extract the username
 * (everything before the @ symbol).
 * Write a method that returns the username from an email string.
 * Expected output: Username: kim_possible25
 */

public class A_NameFinder {

    public static void main(String[] args) {
        A_NameFinder a = new A_NameFinder();
    }

    public A_NameFinder() {
        String email = "kim_possible25@milton.edu";
        System.out.println("Username: " + findUsername(email)); // Output: Username: kim_possible25
    }

    public String findUsername(String email) {
        /* TODO: your code goes here */

        try {
            if ((email.contains("@milton.edu"))){

                int index = email.indexOf("@milton.edu"); //indexOf() returns the position of the given information

                return email.substring(0, index); //substring() returns a substring from the given String


                //String newEmail = email.substring(index);
            }

        } catch(Exception ex){
            System.out.println("Error" + ex);
        }

        return email;
    }

}