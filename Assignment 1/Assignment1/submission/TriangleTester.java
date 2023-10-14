import java.awt.Color;
/**
 * This class is used to test the Triangle class 
 * 
 * @author Chau Tim Lok 
 */

public class TriangleTester {

    /**
     * A method to print all the instance and use all the methods 
     * @param args Unused parameter 
     */
    public static void main(String[] args){
        System.out.println("This is the tester class for Triangle");
        Shape TestTriangle = new Triangle();

        // Assign the values to theinstance of newly created objects
        TestTriangle.color = new Color(255, 178, 102); //Randomly pick an orange color 
        TestTriangle.xc = 5;
        TestTriangle.yc = 4;
        TestTriangle.theta = Math.PI/2;
        TestTriangle.filled = true;

        // Test the color and filled value 
        System.out.print("The color is " + TestTriangle.color +"\n");
        System.out.print("The filled(boolean) is " + TestTriangle.filled + "\n");

        // Test the translate() methods 
        // 1. Print the xc,yc before translation 
        // 2. Print the xc,yc after translation 
        System.out.println("xc before translation is " + TestTriangle.xc); 
        System.out.println("yc before translation is " + TestTriangle.yc); 

        double Testdx = 4.1; 
        double Testdy = -3.9; 
        TestTriangle.translate(Testdx, Testdy);

        System.out.println("xc after translation is " + TestTriangle.xc); 
        System.out.println("yc after translation is " + TestTriangle.yc);
        TestTriangle.translate(-Testdx, -Testdy); // translate back 

        // Test the rotate() methods
        System.out.println("theta before rotation is " + TestTriangle.theta); 

        double TestThetadt = 0.5; 
        TestTriangle.rotate(TestThetadt);

        System.out.println("theta after rotation is " + TestTriangle.theta);
        TestTriangle.rotate(-TestThetadt); // rotate back

        // Test the setVertices(double d) methods 
        // 1. Set the vertices with setVertices(double d) methods
        // 2. Print out the array 
        TestTriangle.setVertices(1.5);

        System.out.println("The values in TestTriangle.xLocal are, ");
        for (int i=0;i<TestTriangle.xLocal.length;i++){
            System.out.println(TestTriangle.xLocal[i]);

        }

        System.out.println("The values in TestTriangle.yLocal are, ");
        for (int i=0;i<TestTriangle.yLocal.length;i++){
            System.out.println(TestTriangle.yLocal[i]);
        }

        // Test the getX(), getY() methods, xLocal and yLocal methods
        int TestXLocalArray[] = new int[TestTriangle.xLocal.length];
        int TestYLocalArray[] = new int[TestTriangle.yLocal.length];
        TestXLocalArray = TestTriangle.getX();
        TestYLocalArray = TestTriangle.getY();

        // Print the values 
        System.out.println("The values in TestXLocalArray are, ");
        for (int i=0 ;i<TestTriangle.xLocal.length; ++i) {
            System.out.println(TestXLocalArray[i]);
        }

        System.out.println("The values in TestYLocalArray are, ");
        for (int i=0 ;i<TestTriangle.yLocal.length; ++i) {
            System.out.println(TestYLocalArray[i]); 
        }

    }
    
}
