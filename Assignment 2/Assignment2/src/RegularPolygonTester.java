import java.awt.Color;
/**
 * This class is used to test the Shape class 
 * 
 * @author Chau Tim Lok 
 */

public class RegularPolygonTester {
    /**
     * A method to print all the instance and use all the methods 
     * in shape RegularPolygon
     * @param args Unused parameter 
     */
    public static void main(String[] args){

        System.out.println("This the tester class of RegularPolygon, ");

        // 1. Create the Shape object & test the constructors
        RegularPolygon TestRegularPolygonP1 = new RegularPolygon(); 
        RegularPolygon TestRegularPolygonP2 = new RegularPolygon(3);
        RegularPolygon TestRegularPolygonP3 = new RegularPolygon(1);
        RegularPolygon TestRegularPolygonP4 = new RegularPolygon(3,2.3);
        RegularPolygon TestRegularPolygonP5 = new RegularPolygon(2,-9);    

        System.out.println("Testing the constructors, ");
        System.out.println("The num of sides of P1 is " + TestRegularPolygonP1.getNumOfSides());
        System.out.println("The radius of P1 is " + TestRegularPolygonP1.getRadius());
        System.out.println("The num of sides of P2 is " + TestRegularPolygonP2.getNumOfSides());
        System.out.println("The radius of P2 is " + TestRegularPolygonP2.getRadius());
        System.out.println("The num of sides of P3 is " + TestRegularPolygonP3.getNumOfSides());
        System.out.println("The radius of P3 is " + TestRegularPolygonP3.getRadius());
        System.out.println("The num of sides of P4 is " + TestRegularPolygonP4.getNumOfSides());
        System.out.println("The radius of P4 is " + TestRegularPolygonP4.getRadius());
        System.out.println("The num of sides of P5 is " + TestRegularPolygonP5.getNumOfSides());
        System.out.println("The radius of P5 is " + TestRegularPolygonP5.getRadius());

        // 2. Test the getter and setters of the object 
        System.out.println("Testing the getters and setters of RegularPolygon, ");

        RegularPolygon TestRegularPolygonP6 = new RegularPolygon();

        // a. initialize the values and use setter to set the value 
        Color testcolor = new Color(255, 178, 102);
        Boolean testfilled = true; 
        double testxc = 5.6;
        double testyc = 4.5;
        double testtheta = Math.PI/3;
        double[] testxLocal = new double[] {4,2.4};     //Randomly assign some values to xLocal
        double[] testyLocal = new double[] {3.3,10.15};     //Randomly assign some values to yLocal
        // for the RegularPolygon class 
        int testnumOfSides = 5;                        
        double testRadius = 1.5; 

        // b. print the values first 
        System.out.print("The color is " + testcolor +"\n");
        System.out.print("The filled(boolean) is " + testfilled + "\n");
        System.out.print("The xc is " + testxc + "\n");
        System.out.print("The yc is " + testyc + "\n");
        System.out.print("The theta is " + testtheta + "\n");

        System.out.println("The values in testxLocal are, ");
         for (int i=0 ;i<testxLocal.length; ++i) {
            System.out.println(testxLocal[i]);
        }
        System.out.println("The values in testyLocal are, ");
         for (int i=0 ;i<testyLocal.length; ++i) {
            System.out.println(testyLocal[i]);
        }

        System.out.print("The numOfSides is " + testnumOfSides + "\n");
        System.out.print("The testRadius is " + testRadius + "\n");

        // c. use the setter to set all the values 
        TestRegularPolygonP6.setColor(testcolor);
        TestRegularPolygonP6.setFilled(testfilled);
        TestRegularPolygonP6.setTheta(testtheta);
        TestRegularPolygonP6.setXc(testxc);
        TestRegularPolygonP6.setYc(testyc);
        TestRegularPolygonP6.setXLocal(testxLocal);
        TestRegularPolygonP6.setYLocal(testyLocal);
        // for RegularPolygon class 
        TestRegularPolygonP6.setNumOfSides(testnumOfSides);
        TestRegularPolygonP6.setRadius(testRadius);

        // d. Use the getter to get all the values & print them out 
        System.out.println("");
        System.out.println("The below are the values returned by the getter function");
        System.out.println("The return color is " + TestRegularPolygonP6.getColor());
        System.out.println("The return filled value is " + TestRegularPolygonP6.getFilled());
        System.out.println("The return theta is " + TestRegularPolygonP6.getTheta());
        System.out.println("The return Xc is " + TestRegularPolygonP6.getXc());
        System.out.println("The return Yc is " + TestRegularPolygonP6.getYc());
        // for RegularPolygon class 
        System.out.println("The return numOfSides is " + TestRegularPolygonP6.getNumOfSides());
        System.out.println("The return radius is " + TestRegularPolygonP6.getRadius());

        System.out.println("The below are the values of the returned X array");
        for (int i=0;i<TestRegularPolygonP6.getXLocal().length;i++){
            System.out.println(TestRegularPolygonP6.getXLocal()[i]);
        }

        System.out.println("The below are the values of the returned Y array");
        for (int i=0;i<TestRegularPolygonP6.getYLocal().length;i++){
            System.out.println(TestRegularPolygonP6.getYLocal()[i]);
        }

        // 3. Test the methods contain() 
        System.out.print("Testing the contain() methods, ");
        RegularPolygon TestRegularTriangle = new RegularPolygon(3,1.0);

        // a. outside case 
        double[] OutsideXArray = new double[] {0.5,-0.4,-0.4};
        double[] OutsideYArray = new double[] {0.5,0.865,-1};

        // b. inside case 
        double[] InsideXArray = new double[] {0.5,0,-0.44};
        double[] InsideYArray = new double[] {0.25,-0.565,-0.77};

        // Use the for loop and print out the boolean value 
        System.out.println("Below are the false case, ");
        for (int i=0;i<3;i++){
            boolean isInside = TestRegularTriangle.contains(OutsideXArray[i],OutsideYArray[i]); 
            System.out.println(isInside); 

        }

        System.out.println("Below are the true case, ");
        for (int i=0;i<3;i++){
            boolean isInside = TestRegularTriangle.contains(InsideXArray[i],InsideYArray[i]); 
            System.out.println(isInside); 

        }

        //4. Test the setVertices methods
        TestsetVertices(TestRegularPolygonP1); 
        TestsetVertices(TestRegularPolygonP2);
        TestsetVertices(TestRegularPolygonP3);
        TestsetVertices(TestRegularPolygonP4);
        TestsetVertices(TestRegularPolygonP5);
        TestsetVertices(new RegularPolygon(6, 3.7));
        TestsetVertices(new RegularPolygon(10, 2.1));

    }

    /**
     * A method used to test setVertices in RegularPolygon class. 
     * Since it is a private methods, it cannot be accessed from outside. Therefore,
     * I just copy the code of the methods setVertice() and run it in this function. 
     * It will print out the vertices of the input RegularPolygon object. 
     * @param testP the RegularPolygon object put into the test function 
     */
    public static void TestsetVertices(RegularPolygon testP){
        //System.out.println("This is " + testP);
        int n = testP.getNumOfSides(); 
        double r = testP.getRadius(); 

        // a. set the value of alpha and theta 
        double alpha;
        double theta=2*Math.PI/n; 
        
        if (n%2==0){alpha = Math.PI/n;}
        else{alpha=0;}

        double[] XVerticesArray = new double[n];
        double[] YVerticesArray = new double[n];

        // b. calculate the x,y coordinates of the vertices and 
        //    set it in the array 
        for (int i=0;i<testP.numOfSides;i++){
            XVerticesArray[i] = r*Math.cos(alpha - i*theta);
            YVerticesArray[i] = r*Math.sin(alpha - i*theta);
        }

        //2. Set the x,y coordinates to the class instance with 
        //   setXLocal and setYLocal function 
        testP.setXLocal(XVerticesArray);
        testP.setYLocal(YVerticesArray);

        // 3.Use the getter function and use for-loop to print it 
        double [] getXLocalArray = testP.getXLocal();
        double [] getYLocalArray = testP.getYLocal(); 

        System.out.println("Below are the x coodinates of the vertices, ");
        for (int i=0;i<getXLocalArray.length;i++){
            System.out.println(getXLocalArray[i]);
        }

        System.out.println("Below are the y coodinates of the vertices, ");
        for (int i=0;i<getYLocalArray.length;i++){
            System.out.println(getYLocalArray[i]);
        }

    }
    
    
}
