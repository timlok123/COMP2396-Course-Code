import java.awt.Color;

/**
 * This class is used to model general shape  
 * 
 * @author Chau Tim Lok 
 */
public class Shape {

    //Private instance variables 
    private Color color; 
    private boolean filled; 
    private double theta;
    private double xc;
    private double yc;
    private double[] xLocal; 
    private double[] yLocal; 

    //Public methods 

    /**
     *  Retrieve the color of the shape. 
     *  @return the color of the shape 
     */
    public Color getColor(){
        return this.color; 
    }

    /**
     * Retrieve the color of fill-type of the shape. 
     * @return the boolean value specify whether the shape is filled
     */
    public Boolean getFilled(){
        return this.filled;
    }

    /**
     * Retrieve the orientation (in radians) of the shape (with respect to its center) 
     * in the canvas coordinate system.
     * @return the orientation (in radians) of the shape in the canvas coordinate system
     */
    public double getTheta(){
        return this.theta;
    }

    /**
     * Retrieve the x-coordinate of the center of shape in canvas coordinate system. 
     * @return the x-coordinate of the center of shape in canvas coordinate system 
     */
    public double getXc(){
        return this.xc;
    }

    /**
     * Retrieve the y-coordinate of the center of shape in canvas coordinate system.  
     * @return the y-coordinate of the center of shape in canvas coordinate system 
     */
    public double getYc(){
        return this.yc;
    }

    /**
     * Retrieve the x-coordinates of the vertices (in counter-clockwise order) of the shape
     * in its local coordinate system. 
     * @return an array contains the x-coordinates of the vertices (in counter-clockwise
     *         order) of the shape in its local coordinate system
     */
    public double[] getXLocal(){
        return this.xLocal;
    }

    /**
    * Retrieve the Y-coordinates of the vertices (in counter-clockwise order) of 
    * the shape in its local coordinate system. 
    * @return an array contains the y-coordinates of the vertices (in counter-clockwise 
    *         order) of the shape Sin its local coordinate system
    */
    public double[] getYLocal(){
        return this.yLocal;
    }

    /**
     * Set the color of the shape. 
     * @param color the color of the shape 
     */
    public void setColor(Color color){
        this.color = color;
    }
    
    /**
     * Set the fill-type of the shape. 
     * @param filled - boolean value specified whether the shape is filled or not
     */

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    /**
     * Set the orientation of the shape. 
     * @param theta -  the orientation (in radians) of the shape (with respect to
     *                  its center) in the canvas coordinate system
     */
    public void setTheta(double theta){
        this.theta = theta;
    }

    /**
     * Set the x-coordinate of the center of the shape in the canvas coordinate 
     * system. 
     * @param xc the x-coordinate of the center of the shape in the canvas coordinate 
     *        system
     */
    public void setXc(double xc){
        this.xc = xc;
    }

    /**
    * Set the y-coordinate of the center of the shape in the canvas coordinate 
    * system. 
    * @param yc the y-coordinate of the center of the shape in the canvas coordinate 
    *        system
    */
    public void setYc(double yc){
        this.yc = yc;
    }

    /**
     * Set the x-coordinates of the vertices (in counter-clockwise order) of the 
     * shape in its local coordinate system. 
     * @param xLocal an array of double values specifying the x-coordinates of
     *               the vertices (in counter-clockwise order) of the shape in its local 
     *               coordinate system
     */

     public void setXLocal(double[] xLocal){
        this.xLocal = xLocal;
     }

    /**
     * Set the y-coordinates of the vertices (in counter-clockwise order) of the 
     * shape in its local coordinate system. 
     * @param yLocal an array of double values specifying the y-coordinates of
     *               the vertices (in counter-clockwise order) of the shape in its local 
     *               coordinate system
     */
     public void setYLocal(double[] yLocal){
        this.yLocal = yLocal;
     }

    /**
     * Translate the center of the shape (xc, yc) along the x and y directions 
     * by dx and dy of the canvas coordinate system respectively.  
     * @param dx amount translate along x-axis 
     * @param dy amount translate along y-axis
     */
     public void translate(double dx, double dy){
        this.xc = this.xc + dx; 
        this.yc = this.yc + dy; 
     }
    
    /**
     * Rotate the shape about its center by an angle dt. 
     * @param dt amount of rotation about the centre of the shape 
     */
    public void rotate(double dt){
        this.theta = this.theta + dt; 
    }

    /**
     * Retrieve the x-coordinates (rounded to nearest integers) of the vertices 
     * (in counterclockwise order) of the shape in the canvas coordinate system.
     * @return an array contains the x-coordinates (rounded to nearest integers) of the vertices of the shape in canvas coordinate system 
     */
    public int[] getX(){
        int[] ReturnXLocalArray = new int[this.getXLocal().length];
        for (int i=0;i<xLocal.length;i++){
            ReturnXLocalArray[i]  = Math.round((float) (this.xLocal[i]*Math.cos(this.theta) 
                                                - this.yLocal[i]*Math.sin(this.theta)
                                                 + this.xc)); 
        } 
        return ReturnXLocalArray; 

    }

    /**
     * Retrieve the y-coordinates (rounded to nearest integers) of the vertices 
     * (in counterclockwise order) of the shape in the canvas coordinate system. 
     * @return an array contains the y-coordinates (rounded to nearest integers) of the vertices of the shape in canvas coordinate system 
     */

    public int[] getY(){
        int[] ReturnYLocalArray = new int[this.getYLocal().length];
        for (int i=0;i<yLocal.length;i++){
            ReturnYLocalArray[i]  = Math.round((float) (this.xLocal[i]*Math.sin(this.theta) 
                                                + this.yLocal[i]*Math.cos(this.theta)
                                                 + this.yc)); 
        } 
        return ReturnYLocalArray; 
    }
    
}
