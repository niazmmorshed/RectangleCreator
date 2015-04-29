/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectenglecreator;

/**
 *
 * @author class
 */
public class RectengleCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = rect1;
        
        rect2.setLength(5);
        rect1.setWidth(10);
        
        System.out.println(rect1.getLength());
        System.out.println(rect2.getWidth());
        System.out.println(rect1.getArea());
        
    }
    
}
