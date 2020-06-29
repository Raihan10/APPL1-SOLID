/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import Interfaces.IShape;

/**
 *
 * @author Raihan Ibrahim
 */
public class Circle implements IShape{

    @Override
    public String drow() {
        return "I'm Circle";
    }
    
}
