/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;
import Interfaces.ISecurityUI;
import java.util.Scanner;

/**
 *
 * @author Raihan Ibrahim
 */
public class ScannerUI implements ISecurityUI
{

    @Override
    public String RequestKeyCard() {
        Scanner scanKeyCard = new Scanner(System.in);
        
        System.out.println("Slide your key card");
        String keyCard = scanKeyCard.nextLine();
        
        return keyCard;
    }

    @Override
    public int requestPinCode() {
        Scanner scanPinCode = new Scanner(System.in);
        
        System.out.println("Enter your pin code : ");
        int pinCode = scanPinCode.nextInt();
        
        return pinCode;
    }
    
}
