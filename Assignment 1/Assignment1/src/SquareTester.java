import java.awt.Color;
/**
 * This class is used to test the Shape class 
 * 
 * @author Chau Tim Lok 
 */

public class SquareTester {

     /**
     * A method to print all the instance and use all the methods 
     * @param args Unused parameter 
     */
    public static void main(String[] args){
        System.out.println("This is the tester class for square"); 

        Shape TestSquare = new Square();

        // Assign the values to theinstance of newly created objects
        TestSquare.color = new Color(255, 178, 102); //Randomly pick an orange color 
        TestSquare.xc = 5;
        TestSquare.yc = 4;
        TestSquare.theta = Math.PI/3;
        TestSquare.filled = true;

        // Test the color and filled value 
        System.out.print("The color is " + TestSquare.color +"\n");
        System.out.print("The filled(boolean) is " + TestSquare.filled + "\n");

        // Test the translate() methods 
        // 1. Print the xc,yc before translation 
        // 2. Print the xc,yc after translation 
        System.out.println("xc before translation is " + TestSquare.xc); 
        System.out.println("yc before translation is " + TestSquare.yc); 

        double Testdx = 4.1; 
        double Testdy = -3.9; 
        TestSquare.translate(Testdx, Testdy);

        System.out.println("xc after translation is " + TestSquare.xc); 
        System.out.println("yc after translation is " + TestSquare.yc);
        TestSquare.translate(-Testdx, -Testdy); // translate back 

        // Test the rotate() methods
        System.out.println("theta before rotation is " + TestSquare.theta); 

        double TestThetadt = 0.5; 
        TestSquare.rotate(TestThetadt);

        System.out.println("theta after rotation is " + TestSquare.theta);
        TestSquare.rotate(-TestThetadt); // rotate back

        // Test the setVertices(double d) methods 
        // 1. Set the vertices with setVertices(double d) methods
        // 2. Print out the array 
        TestSquare.setVertices(1.5);

        System.out.println("The values in TestSquare.xLocal are, ");
        for (int i=0;i<4;i++){
            System.out.println(TestSquare.xLocal[i]);

        }

        System.out.println("The values in TestSquare.yLocal are, ");
        for (int i=0;i<4;i++){
            System.out.println(TestSquare.yLocal[i]);
        }

        // Test the getX(), getY() methods, xLocal and yLocal methods
        int TestXLocalArray[] = new int[TestSquare.xLocal.length];
        int TestYLocalArray[] = new int[TestSquare.yLocal.length];
        TestXLocalArray = TestSquare.getX();
        TestYLocalArray = TestSquare.getY();

        // Print the values 
        System.out.println("The values in TestXLocalArray are, ");
        for (int i=0 ;i<TestSquare.xLocal.length; ++i) {
            System.out.println(TestXLocalArray[i]);
        }

        System.out.println("The values in TestYLocalArray are, ");
        for (int i=0 ;i<TestSquare.yLocal.length; ++i) {
            System.out.println(TestYLocalArray[i]); 
        }

    }
    
}
