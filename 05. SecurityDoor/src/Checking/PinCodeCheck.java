/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checking;
import Interfaces.IRequestPinCode;

/**
 *
 * @author Raihan Ibrahim
 */
public class PinCodeCheck extends SecurityCheck implements IRequestPinCode{
    private IRequestPinCode requestPinCode;
    
    public PinCodeCheck(IRequestPinCode requestPinCode)
    {
        this.requestPinCode = requestPinCode;
    }
    
    private boolean isValid(int pin)
    {
        return true;
    }

    @Override
    public boolean validateUser() {
        int pin = requestPinCode.requestPinCode();
        if(isValid(pin))
        {
            return true;
        }
        
        return false;
    }
    
    
}
