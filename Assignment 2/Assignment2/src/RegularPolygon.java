/**
 * This class is used to model regular n-sides polygon  
 * 
 * @author Chau Tim Lok 
 */

public class RegularPolygon extends Shape{

    //Private instance variables & methods 
    int numOfSides; 
    double radius; 

    //Constructors 
    /**
     * Build a regular n-sided polygon with a radius of r.
     * If number of sides n is less than 3, the number of sides 
     * will be set to 3.
     * If the radius r is less than 0, the radius will be set to 0.   
     * This function would also set the vertices. 
     * @param n number of sides 
     * @param r radius of the polygon 
     */
    public RegularPolygon(int n, double r){
        if(n<3){this.numOfSides = 3;}
        else{this.numOfSides = n;}

        if(r<0){this.radius = 0;}
        else{this.radius =r;}

        this.setVertices();

    }

    /**
     * Build a regular n-sided polygon with a radius 1.0.
     * If number of sides n is less than 3, the number of sides 
     * will be set to 3.
     * This function would also set the vertices. 
     * @param n number of sides of polygon 
     */
    public RegularPolygon(int n){
        if(n<3){this.numOfSides = 3;}
        else{this.numOfSides = n;}

        this.radius = 1.0; 

        this.setVertices();
    }

    /**
     * Build a regular 3-sided polygon with a radius 1.0 
     * This function would also set the vertices. 
     */
    public RegularPolygon(){
        this.numOfSides=3;
        this.radius=1.0;
        this.setVertices();
    }

    // private methods
    /**
    * Setting the local coordinates of the vertices of the 
    * regular n-sided polygon based on its number of sides and radius. 
    */
    private void setVertices(){
        //1. Calculate the x,y coordinates of the polygon first 
        // n = this.numOfSides 
        // r = this.radius 

        int n = this.getNumOfSides(); 
        double r = this.getRadius(); 

        // a. set the value of alpha and theta 
        double alpha;
        double theta=2*Math.PI/n; 
        
        if (n%2==0){alpha = Math.PI/n;}
        else{alpha=0;}

        double[] XVerticesArray = new double[n];
        double[] YVerticesArray = new double[n];
        // b. calculate the x,y coordinates of the vertices and 
        //    set it in the array 
        for (int i=0;i<this.numOfSides;i++){
            XVerticesArray[i] = r*Math.cos(alpha - i*theta);
            YVerticesArray[i] = r*Math.sin(alpha - i*theta);
        }

        //2. Set the x,y coordinates to the class instance with 
        //   setXLocal and setYLocal function 
        this.setXLocal(XVerticesArray);
        this.setYLocal(YVerticesArray);

    }

    //Public methods

    /**
     * Retrieve the number of sides of the regular polygon 
     * @return the number of sides of polygon 
     */
    public int getNumOfSides(){
        return this.numOfSides;  
    }

    /**
     * Retrieve the radius of the regular polygon 
     * @return the radius of the polygon 
     */
    public double getRadius(){
        return this.radius; 
    }

    /**
     * Set the number of sides of the polygon. 
     * This method also reset the local coordinates 
     * of the vertices of the regular n-sided polygon. 
     * If the argument n is less than 3, the number
     * of sides will be set to 3. 
     * @param n the number of sides of polygon 
     */
    public void setNumOfSides(int n){
        if(n<3){this.numOfSides=3;}
        else{this.numOfSides=n;}

        this.setVertices(); 
        
    }

    /**
     * Set the radius of the regular n-sided polygon. 
     * This method also reset the local coordinates 
     * of the vertices of the regular n-sided polygon. 
     * If the argument r is less than 0, the radius will
     * be set to 0.
     * @param r the radius of the polygon 
     */
    public void setRadius(double r){
        if(r<0){this.radius=r;}
        else{this.radius=r;}

        this.setVertices();

    }

    /**
     * Determining if a point (x, y) in the canvas coordinate system 
     * is contained by the regular n-sided polygon. 
     * @param x x-coordinate of the point in canvas coordinate system 
     * @param y y-coordinate of the point in canvas coordinate system
     * @return the boolean value specify whether the point is contained by
     *         the polygon
     */
    public boolean contains(double x,double y){

        boolean flag = true;

        //1. Get the point x,y and array in local coordinates
        //   a. Get the floor(n/2) vertices in the array 
        //   b. convert the points to local coordinates 
        //2. for loop: 0th to number of sides of the polygon 
        //   a. check if the point lies on the left of vertical sides (smaller x)  
        //   b. if yes -> rotate the points and do the checking again   
        //      if no -> breaks the for loop and return false 


        int leftXCoordinateIndex = (int) Math.floor(this.getNumOfSides()/2); 
        double leftXCoordinate = this.getXLocal()[leftXCoordinateIndex]; 
        double theta = 2*Math.PI/this.getNumOfSides();

        double localXPt = (x - this.getXc())*Math.cos(-this.getTheta()) - 
                          (y-this.getYc())*Math.sin(-this.getTheta()); 
        double localYPt = (x - this.getXc())*Math.sin(-this.getTheta()) + 
                          (y- this.getYc())*Math.cos(-this.getTheta()); 
        
        for (int i = 0; i < this.getNumOfSides();i++){
            double u = localXPt*Math.cos(i*theta) - localYPt*Math.sin(i*theta);
            if(u < leftXCoordinate){
                flag = false; 
                break;}
        }
        
        return flag;
    }

}
