package com.assignment2;

//Custom exception for invalid age
class AgeNotWithinRangeException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Custom exception for invalid name
class NameNotValidException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public NameNotValidException(String message) {
     super(message);
 }
}

//Student class with attributes
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     // Validate age
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
     }
     // Validate name (should not contain digits or special characters)
     if (!name.matches("[a-zA-Z\\s]+")) {
         throw new NameNotValidException("Name contains invalid characters (numbers or special symbols).");
     }

     // If both validations pass, initialize the attributes
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 // Display student details
 public void displayStudentInfo() {
     System.out.println("Student Info:");
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

 class StudentDemo {
 public static void main(String[] args) {
     try {
         // Create a student object with valid/invalid data
         Student student = new Student(101, "John Doe", 20, "Computer Science");
         student.displayStudentInfo();
     } catch (AgeNotWithinRangeException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     try {
         // Another example with invalid name
         Student student = new Student(102, "John123", 18, "Electronics");
         student.displayStudentInfo();
     } catch (AgeNotWithinRangeException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     try {
         // Another example with invalid age
         Student student = new Student(103, "Jane Smith", 22, "Mechanical");
         student.displayStudentInfo();
     } catch (AgeNotWithinRangeException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
