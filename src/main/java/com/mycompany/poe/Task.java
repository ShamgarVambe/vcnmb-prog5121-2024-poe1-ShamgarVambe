package com.mycompany.poe;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Task {
    public static boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;//This method checks if the length of the task description is less than or equal to 50 characters.
    }

     public static String createTaskId(String taskName, String taskDeveloperDetails,int taskNum) {//It takes the first two characters of the task name in uppercase, concatenates them with the task number and the last three characters of the developer details in uppercase.
        return taskName.substring(0, Math.min(taskName.length(), 2)).toUpperCase() +":"+ taskNum +":"+taskDeveloperDetails.substring(Math.max(taskDeveloperDetails.length() - 3, 0)).toUpperCase();//Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
    }
     
    public static String printTaskDetails(String taskStatus, String taskDeveloperDetails, String taskName, int taskNum, String taskDescription, String taskId, String taskDuration) {//This method constructs a string containing all task details including status, developer details, task name, task number, description, task ID, and duration.
        String taskDetails = "\nStatus: " + taskStatus + "\nDeveloper Details: " + taskDeveloperDetails + "\nTask Name: " + taskName + "\nTask number: " + taskNum + "\nDescription: " + taskDescription + "\nTask ID: " + taskId + "\nDuration: " + taskDuration ;
        JOptionPane.showMessageDialog(null, taskDetails);
        return taskDetails;
        
    }
}
//Reference
    //docs.oracle.com. (2024). Java Platform, Standard Edition Java API Reference. [online] Available at: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html#substring(int). [Accessed 22 May 2024]

//Farrell,J.2023.JAVA PROGRAMMING.10th ED.Boston:Cengage