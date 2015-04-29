/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectenglecreator;

/**
 * A representation of a rectangle
 * @author class
 */
public class Rectangle {
    /**
     * The length of this rectangle
     */
    private double length;
    /**
     * The width of this rectangle
     */
    private double width;

    /**
     * return the length of this rectangle
     * @return the length to get
     */
    public double getLength() {
        return length;
    }

    /**
     * sets the length of rectangle
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * return the width of this rectangle
     * @return the width to get
     */
    public double getWidth() {
        return width;
    }

    /**
     * sets the width of rectangle
     * @param width the width to set
     */
    public void setWidth(double width) {
        if(width >=0) 
        this.width = width;
    }
    /**
     * 
     * @return the calculated area
     */
    public double getArea(){
        return this.length * this.width;
        
        
    }
}
