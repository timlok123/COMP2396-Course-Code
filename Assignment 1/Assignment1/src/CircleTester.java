import java.awt.Color;
/**
 * This class is used to test the Shape class 
 * 
 * @author Chau Tim Lok 
 */

public class CircleTester {

     /**
     * A method to print all the instance and use all the methods 
     * @param args Unused parameter 
     */
    public static void main(String[] args){
        System.out.println("This is the tester class for circle"); 

        Shape TestCircle = new Circle();

        // Assign the values to theinstance of newly created objects
        TestCircle.color = new Color(255, 178, 102); //Randomly pick an orange color 
        TestCircle.xc = 5;
        TestCircle.yc = 4;
        TestCircle.theta = Math.PI/2;
        TestCircle.filled = true;

        // Test the color and filled value 
        System.out.print("The color is " + TestCircle.color +"\n");
        System.out.print("The filled(boolean) is " + TestCircle.filled + "\n");

        // Test the translate() methods 
        // 1. Print the xc,yc before translation 
        // 2. Print the xc,yc after translation 
        System.out.println("xc before translation is " + TestCircle.xc); 
        System.out.println("yc before translation is " + TestCircle.yc); 

        double Testdx = 4.1; 
        double Testdy = -3.9; 
        TestCircle.translate(Testdx, Testdy);

        System.out.println("xc after translation is " + TestCircle.xc); 
        System.out.println("yc after translation is " + TestCircle.yc);
        TestCircle.translate(-Testdx, -Testdy); // translate back 

        // Test the rotate() methods
        System.out.println("theta before rotation is " + TestCircle.theta); 

        double TestThetadt = 0.5; 
        TestCircle.rotate(TestThetadt);

        System.out.println("theta after rotation is " + TestCircle.theta);
        TestCircle.rotate(-TestThetadt); // rotate back

        // Test the setVertices(double d) methods 
        // 1. Set the vertices with setVertices(double d) methods
        // 2. Print out the array 
        TestCircle.setVertices(1.5);

        System.out.println("The values in TestCircle.xLocal are, ");
        for (int i=0;i<TestCircle.xLocal.length;i++){
            System.out.println(TestCircle.xLocal[i]);

        }

        System.out.println("The values in TestCircle.yLocal are, ");
        for (int i=0;i<TestCircle.yLocal.length;i++){
            System.out.println(TestCircle.yLocal[i]);
        }

        // Test the getX(), getY() methods, xLocal and yLocal methods
        int TestXLocalArray[] = new int[TestCircle.xLocal.length];
        int TestYLocalArray[] = new int[TestCircle.yLocal.length];
        TestXLocalArray = TestCircle.getX();
        TestYLocalArray = TestCircle.getY();

        // Print the values 
        System.out.println("The values in TestXLocalArray are, ");
        for (int i=0 ;i<TestCircle.xLocal.length; ++i) {
            System.out.println(TestXLocalArray[i]);
        }

        System.out.println("The values in TestYLocalArray are, ");
        for (int i=0 ;i<TestCircle.yLocal.length; ++i) {
            System.out.println(TestYLocalArray[i]); 
        }




    }
    
}
