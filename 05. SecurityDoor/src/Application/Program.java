/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import Checking.KeyCardCheck;
import Checking.PinCodeCheck;
import Checking.SecurityCheck;
import Manager.SecurityManager;
import Scanner.ScannerUI;

/**
 *
 * @author Raihan Ibrahim
 */
public class Program {

    public static void main(String[] args) {
        ScannerUI scannerUI = new ScannerUI();
        SecurityCheck keyCardCheck = new KeyCardCheck(scannerUI);
        SecurityCheck pinCodeCheck = new PinCodeCheck(scannerUI);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.check();
    }
    
}
