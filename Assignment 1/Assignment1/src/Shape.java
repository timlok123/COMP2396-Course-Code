import java.awt.Color;
/**
 * This class is used to model Shape. 
 * 
 * @author Chau Tim Lok 
 */
public class Shape {

    /**
     * Color object that state the color of the shape 
     */
    public Color color; 

    /**
     * The boolean value specified whether the shape is filled or not 
     */
    public boolean filled; 

    /**
     * The double value specifying the orientation (in radians) of the shape (with respect to its center) in the canvas coordinate system 
     */
    public double theta;

     /**
     * The double value specifying the x-coordinate of the centre of shape in canvas coordinate system 
     */
    public double xc;

    /**
     * The double value specifying the y-coordinate of the centre of shape in canvas coordinate system 
     */
    public double yc;

    /**
     * An array of double values specifying the x-coordinate of the vertices (in counter-clockwise order) of the shape in its local coordinate system 
     */
    public double[] xLocal; 

    /**
     * An array of double values specifying the y-coordinate of the vertices (in counter-clockwise order) of the shape in its local coordinate system 
     */
    public double[] yLocal; 

    /**
     * Set the local coordinates of the vertices of a shape (dummy). 
     *@param d Specify the dimension of shape (dummy value)
     */
     public void setVertices(double d){}

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
    int[] getX(){
        int[] ReturnXLocalArray = new int[this.xLocal.length];
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

    int[] getY(){
        int[] ReturnYLocalArray = new int[this.yLocal.length];
        for (int i=0;i<yLocal.length;i++){
            ReturnYLocalArray[i]  = Math.round((float) (this.xLocal[i]*Math.sin(this.theta) 
                                                + this.yLocal[i]*Math.cos(this.theta)
                                                 + this.yc)); 
        } 
        return ReturnYLocalArray; 
    }
    
}
