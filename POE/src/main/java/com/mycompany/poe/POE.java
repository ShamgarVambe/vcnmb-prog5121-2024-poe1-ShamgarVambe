/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class POE {

    public static void main(String[] args) {
       
        /*Scanner scanner = new Scanner(System.in);

        String passPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

        System.out.println("Please enter your name:");//promps user to enter their name
        String name = scanner.nextLine();

        System.out.println("Please enter your surname:");//promps user to enter their surname
        String surname = scanner.nextLine();

        String username;
        do {
            System.out.println("Please enter your username (must be no longer than five characters and contain an underscore):");
            username = scanner.nextLine();
        } while (username.length() > 5 || !username.contains("_"));  // Username validation loop

        String password;
        do {
            System.out.println("Please enter your password (at least 8 characters, containing at least one lowercase, one uppercase, one digit, and one special character):");
            password = scanner.nextLine();
        } while (!password.matches(passPattern));  // Password validation loop using String.format

        Login login = new Login();  //Create a new instance of the Login class.
        if (login.checkUserName(name, surname, username))
        System.out.println("Username successfully captured.");{//Checks if the checkUserName method of the Login class returns true for the given name, surname, and username
            if (login.checkUserPasswordComplexity(password)) {//Checks if the checkUserPasswordComplexity method of the Login class returns true for the given password
                System.out.println("Password successfully captured.");
                if (login.LoginUser(scanner, username, password)) {
                System.out.println("Welcome, " + login.getName() + " " + login.getSurname()+" "+"Its great to see you again");//Print a welcome message that includes the user's name and surname
                } else {
                   System.out.println("Username or password incorrect please try again.");//Print an error message indicating that the username or password is incorrect.
                }
            }
        }*/
       Task task = new Task();        
    int OPTION = 0;
JOptionPane.showMessageDialog(null, "WELCOME TO EASY KANBAN"); //(Farrel.J.2023)
    while (OPTION != 3) {
         
        // Prompt the user for an option
        String input = JOptionPane.showInputDialog("Select an option:\n1 - Add tasks\n2 - Show Report\n3 - Quit");

        OPTION = Integer.parseInt(input);//(Farrel.J.2023)  I am referencing Ineger.parseInt()
        
        if(OPTION==2){
            JOptionPane.showMessageDialog(null, "COMING SOON");
        }

        if (OPTION == 1) {
            // Add tasks
            int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to add?"));//(Farrel.J.2023)

           for (int i = 1; i <= numTasks; i++) {
    // Prompt the user for task details
    String taskName = JOptionPane.showInputDialog("Enter task name " + i + ":");
    String taskDescription = JOptionPane.showInputDialog("Enter task description for Task " + i + ":");//(Farrel.J.2023) I am referencing JOptiobPane
    String taskDeveloperDetails = JOptionPane.showInputDialog(null, "Write the developer details for Task " + i + ":");
    String taskDuration = JOptionPane.showInputDialog(null, "Enter the task duration for Task " + i + ":");
    String taskStatus = JOptionPane.showInputDialog(null, "Enter the task status for Task" + i + ":" + " \nTO DO \nDONE \nDOING ");
    int taskNum = i - 1; //calculates the task number
    
     
     
    // Handle the task
    if (task.checkTaskDescription(taskDescription)) { //tests legth of task description
       
        String taskId = task.createTaskId(taskName, taskDeveloperDetails, taskNum);
        System.out.println("Task added: " + taskDescription);
        System.out.println("Task ID: " + taskId);
        task.printTaskDetails(taskStatus, taskDeveloperDetails, taskName, taskNum, taskDescription, taskId, taskDuration); //prints out the task details
    } else {
        // Task name exceeds the length limit
        JOptionPane.showMessageDialog(null, "Task description exceeds the length limit of 50 characters.");//error message if the task decription is more than 50 words
    }
}
        }
    }
    }
    }

