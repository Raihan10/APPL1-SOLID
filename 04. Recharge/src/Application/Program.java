/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Models.Employee;
import Models.RechargeStation;
import Models.Robot;
import Models.Worker;

/**
 *
 * @author Raihan Ibrahim
 */
public class Program {

    public static void main(String[] args) {
        Worker employee = new Employee("181524029");
        Worker robot = new Robot("181524040", 100);
        RechargeStation rechargeStation = new RechargeStation();
        
        employee.setWorkingHours(10);
        robot.setWorkingHours(50);
        
        System.out.println("Employee id =  " + employee.getId());
        System.out.println("Employee is working for " + employee.getWorkingHours() + " hours");
        employee.sleep();
        
        System.out.println("");
        
        System.out.println("Robot id = " + robot.getId());
        System.out.println("Robot is working for " + robot.getWorkingHours() + " hours");
        System.out.println("Robot is charging ...");
        rechargeStation.recharge(robot);
    }
    
}
