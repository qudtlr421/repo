/*
 * Class: CMSC203 
 * Instructor: professor Ahmed Tarek
              * Description:create PatientDriverApp.
 * Due: 10/01/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Giran Park
*/

import java.util.Scanner;

/**
 * PatientDriverApp class to display gathered patient and his procedure information 
*/
public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt and Get Patient data
        System.out.println("Enter information: ");
        System.out.print("First Name:");
        String firstName = keyboard.nextLine();
        System.out.print("Middle Name: ");
        String middleName = keyboard.nextLine();
        System.out.print("Last Name: ");
        String lastName = keyboard.nextLine();
        System.out.print("Street Address: ");
        String streetAddress = keyboard.nextLine();
        System.out.print("City: ");
        String city = keyboard.nextLine();
        System.out.print("State: ");
        String state = keyboard.nextLine();
        System.out.print("Zip Code: ");
        String zipCode = keyboard.nextLine();
        System.out.print("Phone Number: ");
        String phoneNum = keyboard.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyName = keyboard.nextLine();
        System.out.print("Emergency Contact Number: ");
        String emergencyNumber = keyboard.nextLine();

        // make instance of patinet
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNum, emergencyName, emergencyNumber);
        
        // Procedure 1: create procedure instances
        System.out.println("\nEnter Procedure 1 info: ");
        Procedure procedureOne = new Procedure();
        System.out.print("the name of Procedure: ");
        procedureOne.setProcedureName(keyboard.nextLine());
        System.out.print("the date of Procedure: ");
        procedureOne.setProcedureDate(keyboard.nextLine());
        System.out.print("the name of practitioner: ");
        procedureOne.setPractitionerName(keyboard.nextLine());
        System.out.print("Charges: ");
        procedureOne.setCharges(keyboard.nextDouble());
        keyboard.nextLine(); // clear buffer

        // Procedure 2: create procedure instances
        System.out.println("\nEnter Procedure 2 info: ");
        System.out.print("the name of Procedure: ");
        String procedureTwoName= keyboard.nextLine();
        System.out.print("the date of Procedure: ");
        String procedureTwoDate= keyboard.nextLine();
        Procedure procedureTwo = new Procedure(procedureTwoName, procedureTwoDate);
        System.out.print("the name of practitioner: ");
        procedureTwo.setPractitionerName(keyboard.nextLine());
        System.out.print("Charges: ");
        procedureTwo.setCharges(keyboard.nextDouble());
        keyboard.nextLine(); // clear buffer

        // Procedure 3: create procedure instances
        System.out.println("\nEnter Procedure 3 info: ");
        System.out.print("the name of Procedure: ");
        String procedureThreeName= keyboard.nextLine();
        System.out.print("the date of Procedure: ");             
        String procedureThreeDate = keyboard.nextLine();
        System.out.print("the name of practitioner: ");
        String procedureThreePractitionerName= keyboard.nextLine();
        System.out.print("Charges: ");
        double procedureThreeCharge=keyboard.nextDouble();
        keyboard.nextLine(); // clear buffer
        Procedure procedureThree = new Procedure(procedureThreeName, procedureThreeDate, procedureThreePractitionerName, procedureThreeCharge);

        // Display all gathered information
        System.out.println(patient.toString());
        System.out.println();
        displayProcedure(procedureOne);
        displayProcedure(procedureTwo);
        displayProcedure(procedureThree);
        System.out.printf("\nTotal Charges: $%,.2f", calculateTotalCharges(procedureOne, procedureTwo, procedureThree));
        
        System.out.print("\n\nStudent Name: Giran Park\nMC#: M20862807\nDue Date: 10/01/2025");

        keyboard.close();
    }
        //method to display patient info
        public static void displayPatient(Patient patient){        
        System.out.println(patient.toString());
        }

        //method to display procedure
        public static void displayProcedure(Procedure procedure){        
        System.out.println(procedure.toString());
        }
        
        // Method to calculate total charges of three procedures
        public static double calculateTotalCharges(Procedure procedureOne, Procedure procedureTwo,Procedure procedureThree) { return procedureOne.getCharges() + procedureTwo.getCharges() + procedureThree.getCharges(); }
}
      



/**
* Patient class with patient information, address and number. 
*/
class Patient 
{
    // Fields for Patient information variables  
    private String firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNum, emergencyName, emergencyNumber;
    
    // No-arg constructor
    public Patient(){
    this.firstName = "";
    this.middleName= "";
    this.lastName= "";
    this.streetAddress="";
    this.city="";
    this.state= "";
    this.zipCode ="";
    this.phoneNum="";
    this.emergencyName ="";
    this.emergencyNumber="";
    }
    
    /** 
       Constructor 
       @param firstName the first name 
       @param middleName the middle name 
       @param lastName the last name
    */

    public Patient(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName= middleName;
    this.lastName= lastName;
    this.streetAddress="";
    this.city="";
    this.state= "";
    this.zipCode ="";
    this.phoneNum="";
    this.emergencyName ="";
    this.emergencyNumber="";
    }
    
    // Constructor with all attributes
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNum, String emergencyName, String emergencyNumber) {
    this.firstName = firstName;
    this.middleName= middleName;
    this.lastName= lastName;
    this.streetAddress= streetAddress;
    this.city= city;
    this.state= state;
    this.zipCode = zipCode;
    this.phoneNum= phoneNum;
    this.emergencyName = emergencyName;
    this.emergencyNumber= emergencyNumber;
    }
    // Accessors (Getters)
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() {return zipCode; }
    public String getPhoneNumber() { return phoneNum; }
    public String getEmergencyName() { return emergencyName; }
    public String getEmergencyNumber() { return emergencyNumber; }

    
    // Mutators
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName= middleName; }
    public void setLastName(String lastName) { this.lastName= lastName; }
    public void setStreetAddress(String streetAddress) { this.streetAddress= streetAddress; }
    public void setCity (String city) { this.city= city; }
    public void setState (String state) { this.state= state; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    public void setPhoneNumber(String phoneNum) { this.phoneNum= phoneNum; }
    public void setEmergencyName(String emergencyName) { this.emergencyName = emergencyName; }
    public void setEmergencyNumber(String emergencyNum) { this.emergencyNumber= emergencyNumber; }
    
    /*
     * the buildFullName method 
     * @return the full name includes first, middle and last name
    */
    public String buildFullName()
    {
        return firstName+ " " + middleName + " " + lastName; 
    }
    
    /**
     * the buildAddress method 
     * @return the full address includes street, city, state and zipCode
    */
    public String buildAddress() {

        return streetAddress+ " " + city + " " + state+ " " + zipCode; 
    }
    
    /**
     *the buildEmergencyContact method 
     * @return the Name and phone number of emergency contact
    */
    public String buildEmergencyContact(){
        return emergencyName+ " " + emergencyNumber;
    }
    
    /**
     *the toString method 
     * @return all given patient informaion 
    */
    public String toString() {
        return "\nPatient Info: \n" + "  Name: " + buildFullName() + "\n  Address: " + buildAddress() + "\n  Emergency Contact: " + buildEmergencyContact() +"\n";
    }
    
}


class Procedure {
    
    // Fields
    private String procedureName, procedureDate, practitionerName;
    private double charges;
    
    // No-arg constructor    
    public Procedure() {
        this.procedureName="";
        this.procedureDate="";
        this.practitionerName="";
        this.charges= 0.0;
    }
    
    // Constructor that initialize procedure name and date to the given values
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName= procedureName;
        this.procedureDate= procedureDate;
        this.practitionerName="";
        this.charges= 0.0;
    }
    
    // Constructor that initialize procedure name and date to the given values
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName= procedureName;
        this.procedureDate= procedureDate;
        this.practitionerName=practitionerName;
        this.charges= charges;
    }
    
    // Accessors
    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitionerName() { return practitionerName; }
    public double getCharges() { return charges; }

    // Mutators
    public void setProcedureName(String procedureName) { this.procedureName= procedureName; }
    public void setProcedureDate(String procedureDate) { this.procedureDate= procedureDate; }
    public void setPractitionerName(String practitionerName) { this.practitionerName=practitionerName; }
    public void setCharges(double charges) { this.charges= charges; }
    
    //toString method
    public String toString() {
        return "\t\tProcedure: " + procedureName + "\n\t\t" + "ProcedureDate=" + procedureDate +"\n\t\tPractitioner=" + practitionerName + "\n\t\tCharge=" + String.format("$%,.2f", charges)+ "\n";
    }
}


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


