/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import Interfaces.IRechargeable;
import Interfaces.ISleeper;

/**
 *
 * @author Raihan Ibrahim
 */
public abstract class Worker implements IRechargeable, ISleeper{
    private String id;
    private int workingHours;
    
    public Worker(String id)
    {
        this.id = id;
    }
    
    public void work(int hours)
    {
        this.setWorkingHours(this.getWorkingHours() + hours);
    }

    @Override
    public void recharge() {
        
    }

    @Override
    public void sleep() {
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the workingHours
     */
    public int getWorkingHours() {
        return workingHours;
    }

    /**
     * @param workingHours the workingHours to set
     */
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
