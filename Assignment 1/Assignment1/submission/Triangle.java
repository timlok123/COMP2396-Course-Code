/**
 * This class is used to model triangle
 * 
 * @author Chau Tim Lok 
 */
public class Triangle extends Shape {

     /** 
     * Set the local coordinates of the 3 vertices of a standard triangle.
     * The result will store to xLocal and yLocal array. 
     * It will store the coordinates starting from positive corner.
     * Overrides the method in the Shape class.  
     * @param d the distance from the centre to the vertices of triangle 
     */
    public void setVertices(double d){
        this.xLocal = new double[] {d,-d*Math.cos(Math.PI/3),-d*Math.cos(Math.PI/3)};
        this.yLocal = new double[] {0,-d*Math.sin(Math.PI/3),d*Math.sin(Math.PI/3)};
    }

}
