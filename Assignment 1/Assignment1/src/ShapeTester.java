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
        System.out.println("This is the tester class for shape"); 

        Shape TestShape = new Shape();

        // Assign the values to theinstance of newly created objects
        TestShape.color = new Color(255, 178, 102); //Randomly pick an orange color 
        TestShape.xc = 5;
        TestShape.yc = 4;
        TestShape.theta = Math.PI/3;
        TestShape.xLocal = new double[] {1.7,2.6};        //Randomly assign some values to xLocal
        TestShape.yLocal = new double[] {3.3,4.4};        //Randomly assign some values to yLocal
        TestShape.filled = true; 
        
        // Test the color, filled value, xLocal, yLocal
        System.out.print("The color is " + TestShape.color +"\n");
        System.out.print("The filled(boolean) is " + TestShape.filled + "\n");
        System.out.println("The values in TestShape.xLocal are, ");
         for (int i=0 ;i<TestShape.xLocal.length; ++i) {
            System.out.println(TestShape.xLocal[i]);
        }
        System.out.println("The values in TestShape.yLocal are, ");
         for (int i=0 ;i<TestShape.yLocal.length; ++i) {
            System.out.println(TestShape.yLocal[i]);
        }

        // Test the getX(), getY() methods, xLocal and yLocal methods 
        int TestXLocalArray[] = new int[TestShape.xLocal.length];
        int TestYLocalArray[] = new int[TestShape.yLocal.length];
        TestXLocalArray = TestShape.getX();
        TestYLocalArray = TestShape.getY();

        // Print the values in TestXLocalArray and TestYLocalArray
        System.out.println("The values in TestXLocalArray are, ");
        for (int i=0 ;i<TestShape.xLocal.length; ++i) {
            System.out.println(TestXLocalArray[i]);
        }

        System.out.println("The values in TestYLocalArray are, ");
        for (int i=0 ;i<TestShape.yLocal.length; ++i) {
            System.out.println(TestYLocalArray[i]); 
        }

        // Test the translate() methods 
        // 1. Print the xc,yc before translation 
        // 2. Print the xc,yc after translation 
        System.out.println("xc before translation is " + TestShape.xc); 
        System.out.println("yc before translation is " + TestShape.yc); 

        double Testdx = 4.1; 
        double Testdy = -3.9; 
        TestShape.translate(Testdx, Testdy);

        System.out.println("xc after translation is " + TestShape.xc); 
        System.out.println("yc after translation is " + TestShape.yc);
        TestShape.translate(-Testdx, -Testdy); // translate back 

        // Test the rotate() methods
        System.out.println("theta before rotation is " + TestShape.theta); 

        double TestThetadt = 0.5; 
        TestShape.rotate(TestThetadt);

        System.out.println("theta after rotation is " + TestShape.theta);
        TestShape.rotate(-TestThetadt); // rotate back
    
    }
    
}
