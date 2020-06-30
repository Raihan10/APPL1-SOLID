/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checking;
import Interfaces.IRequestKeyCard;

/**
 *
 * @author Raihan Ibrahim
 */
public class KeyCardCheck extends SecurityCheck implements IRequestKeyCard{
    
    private IRequestKeyCard requestKeyCard;
    
    public KeyCardCheck(IRequestKeyCard requestKeyCard)
    {
        this.requestKeyCard = requestKeyCard;
    }
    
    public boolean isValid(String code)
    {
        return true;
    }
    
    @Override
    public boolean validateUser() {
        String code = requestKeyCard.RequestKeyCard();
        if(isValid(code))
        {
            return true;
        }
        
        return false;
    }
    
}
