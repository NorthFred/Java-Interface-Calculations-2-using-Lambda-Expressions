
public class MainLambdaTest {

    public static void main(String[] args) {
        
        // Create object from Calculator
        Calculator calc = new Calculator();
        
        // Create the lambda expressions.
        CalculatorInterface sum = (int a, int b, int c) -> (a + b + c);
        CalculatorInterface prod = (int a, int b, int c) -> (a * b * c);
        // There is no real need to give the type of the parameters!
        CalculatorInterface functionA = (a, b, c) -> (2 * a) + (b * (c + 3));
        
        int a = 10;
        int b = 20;
        int c = 30;
        
        int sumresult = calc.execute(a, b, c, sum);
                
        System.out.println("SUM of " + a + ", " + b + ", " + c + " = " + sumresult);
    }
}
