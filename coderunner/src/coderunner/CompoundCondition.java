package coderunner;

public class CompoundCondition {
    public static void main(String[] args) {

        // Pre-declared variables (as specified)
        double x = 5.0;
        double z = 3.0;
        double a = 8.0;
        double b = 2.0;

        // Intermediate variables (declare any you need)
        double leftSide  = x * z;       // example intermediate
        double rightSide = a - b;       // example intermediate

        // Boolean result of the compound condition
        // Replace this with your actual condition
        boolean answer = (leftSide > rightSide) && (a != 0) || (x < b);

        System.out.println("Result: " + answer);
    }
}
	
	