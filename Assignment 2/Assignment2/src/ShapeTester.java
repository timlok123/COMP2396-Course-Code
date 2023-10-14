import java.awt.Color;

/**
 * This class is used to test the Shape class 
 * 
 * @author Chau Tim Lok 
 */
public class ShapeTester {

    /**
     * A method to print all the instance and use all the methods 
     * @param args Unused parameter 
     */
    public static void main(String[] args){
        System.out.println("This the tester class of ShapeTester, ");

        // 1. Create the Shape object
        Shape TestShape1 = new Shape(); 

        // 2. Initialize the values and use setter to set the value 
        Color testcolor = new Color(255, 178, 102);
        Boolean testfilled = true; 
        double testxc = 5.6;
        double testyc = 4.5;
        double testtheta = Math.PI/3;
        double[] testxLocal = new double[] {4,2.4};     //Randomly assign some values to xLocal
        double[] testyLocal = new double[] {3.3,10.15};     //Randomly assign some values to yLocal

        //a. Print the values first 
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

        //b. use the setter to set all the values 
        TestShape1.setColor(testcolor);
        TestShape1.setFilled(testfilled);
        TestShape1.setTheta(testtheta);
        TestShape1.setXc(testxc);
        TestShape1.setYc(testyc);
        TestShape1.setXLocal(testxLocal);
        TestShape1.setYLocal(testyLocal);

        // 3. Use the getter to get all the values & print them out 
        System.out.println("");
        System.out.println("The below are the values returned by the getter function");
        System.out.println("The return color is " + TestShape1.getColor());
        System.out.println("The return filled value is " + TestShape1.getFilled());
        System.out.println("The return theta is " + TestShape1.getTheta());
        System.out.println("The return Xc is " + TestShape1.getXc());
        System.out.println("The return Yc is " + TestShape1.getYc());

        System.out.println("The below are the values of the returned X array");
        for (int i=0;i<TestShape1.getXLocal().length;i++){
            System.out.println(TestShape1.getXLocal()[i]);
        }

        System.out.println("The below are the values of the returned Y array");
        for (int i=0;i<TestShape1.getYLocal().length;i++){
            System.out.println(TestShape1.getYLocal()[i]);
        }

        // 4. Check the output of the translate(), rotate(), getX(), getY()
        // a. Print the xc,yc before translation 
        // b. Print the xc,yc after translation 
        System.out.println("xc before translation is " + TestShape1.getXc()); 
        System.out.println("yc before translation is " + TestShape1.getYc()); 

        double Testdx = 4.1; 
        double Testdy = -3.9; 
        TestShape1.translate(Testdx, Testdy);
        System.out.println("Testdx is " + Testdx); 
        System.out.println("Testdy is " + Testdy); 

        System.out.println("xc after translation is " + TestShape1.getXc()); 
        System.out.println("yc after translation is " + TestShape1.getYc());
        TestShape1.translate(-Testdx, -Testdy); // translate back 

        // Test the rotate() methods
        System.out.println("theta before rotation is " + TestShape1.getTheta()); 

        double TestThetadt = 0.5; 
        System.out.println("TestThetadt is " + TestThetadt); 
        TestShape1.rotate(TestThetadt);

        System.out.println("theta after rotation is " + TestShape1.getTheta());
        TestShape1.rotate(-TestThetadt); // rotate back

        // Test the getX() and getY() method
        // Test the getX(), getY() methods, xLocal and yLocal methods 
        int TestXLocalArray[] = new int[TestShape1.getXLocal().length];
        int TestYLocalArray[] = new int[TestShape1.getYLocal().length];
        TestXLocalArray = TestShape1.getX();
        TestYLocalArray = TestShape1.getY();

        // Print the values in TestXLocalArray and TestYLocalArray
        System.out.println("The values in TestXLocalArray are, ");
        for (int i=0 ;i<TestShape1.getXLocal().length; ++i) {
            System.out.println(TestXLocalArray[i]);
        }

        System.out.println("The values in TestYLocalArray are, ");
        for (int i=0 ;i<TestShape1.getYLocal().length; ++i) {
            System.out.println(TestYLocalArray[i]); 
        }


    }
    
}
