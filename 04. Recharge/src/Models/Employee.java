/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interfaces.IRechargeable;

/**
 *
 * @author Raihan Ibrahim
 */
public class Employee extends Worker implements IRechargeable {
    public Employee(String id)
    {
       super(id); 
    }
    
    @Override
    public void sleep()
    {
        System.out.println("Employee is sleeping ...");
    }
}
