/**
 * This class is used to model Square.
 * It is the subclass of Shape 
 * 
 * @author Chau Tim Lok 
 */
public class Square extends Shape {

    /** 
     * Set the local coordinates of the 4 vertices of a standard square.
     * The result will store to xLocal and yLocal array.
     * It will store the coordinates starting from lower right corner of the square. 
     * Overrides the method in the Shape class. 
     * @param d half the length of a side of the square 
     */
    public void setVertices(double d){
        this.xLocal = new double[] {d,d,-d,-d};
        this.yLocal = new double[] {d,-d,-d,d};
    }
}
