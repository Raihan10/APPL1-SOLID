/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;
import Checking.SecurityCheck;
import java.util.Scanner;


/**
 *
 * @author Raihan Ibrahim
 */
public class SecurityManager {
    private SecurityCheck keyCardCheck;
    private SecurityCheck pinCodeCheck;
    
    public SecurityManager(SecurityCheck keyCardCheck, SecurityCheck pinCodeCheck)
    {
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
    }
    
    public void check()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Choose option : 1 - KeyCard, 2 - PinCode : ");
        int option = scan.nextInt();
        switch(option)
        {
            case 1:
                System.out.println(this.keyCardCheck.validateUser());
                break;
            case 2:
                System.out.println(this.pinCodeCheck.validateUser());
                break;
        }
    }
}
