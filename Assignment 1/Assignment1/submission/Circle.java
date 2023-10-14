/**
 * This class is used to model circle. 
 * It is the subclass of Shape
 * 
 * @author Chau Tim Lok 
 */
public class Circle extends Shape {

    /** 
     * Set the local coordinates of the local coordinates of the upper left and lower right vertices. 
     * The result will store to xLocal and yLocal array 
     * Overrides the method in the Shape class. 
     * @param d the radius of the circle
     */
    public void setVertices(double d){
        this.xLocal = new double[] {-d,d};
        this.yLocal = new double[] {-d,d};
    }

    /**
     * Retrieve the x-coordinates of the upper left and lower right vertices of 
     * an axis-aligned bounding box of the circle in the canvas coordinate system 
     * (rounded to nearest integers). 
     * Overrides the method in the Shape class.
     * @return an array contains the x-coordinates (rounded to nearest integers) of the vertices of 
     * the shape in canvas coordinate system
     *  
     */
    public int[] getX(){
        int[] ReturnXLocalArray = new int[2];
        ReturnXLocalArray[0] = Math.round((float)(this.xLocal[0] + this.xc)); 
        ReturnXLocalArray[1] = Math.round((float)(this.xLocal[1] + this.xc)); 

        return ReturnXLocalArray;
    } 

    /**
     * Retrieve the y-coordinates of the upper left and lower right vertices of 
     * an axis-aligned bounding box of the circle in the canvas coordinate system 
     * (rounded to nearest integers). 
     * Overrides the method in the Shape class.
     * @return an array contains the y-coordinates (rounded to nearest integers) of the vertices of 
     * the shape in canvas coordinate system
     */
    public int[] getY(){
        int[] ReturnYLocalArray = new int[2];
        ReturnYLocalArray[0] = Math.round((float)(this.yLocal[0] + this.yc)); 
        ReturnYLocalArray[1] = Math.round((float)(this.yLocal[1] + this.yc)); 
        return ReturnYLocalArray; 
    } 

}
