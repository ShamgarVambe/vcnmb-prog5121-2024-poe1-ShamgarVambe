package com.mycompany.poe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class TaskTest {
    Task task = new Task();
    
    public TaskTest() {
    }
     @Test
    public void testCheckTaskDescription() { 
        assertTrue(task.checkTaskDescription("Task successfully captured"));
       
    }
    
          @Test
           public void testFalseCheckTaskDescription() {
               assertFalse(task.checkTaskDescription("Please enter a task description of less than 50 characters"));
    }
           


  @Test
    public void testGenerateTaskId() {
        String taskName = "Login feature";
        String taskDeveloperDetails = "Robyn Harrison";
        int taskNum = 123;

        String expectedTaskId = "LO:123:SON";
        String actualTaskId = task.createTaskId(taskName, taskDeveloperDetails, taskNum);

        assertEquals(expectedTaskId, actualTaskId);
    }
    
    
    
}
