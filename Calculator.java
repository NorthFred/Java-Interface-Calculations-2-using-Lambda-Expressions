// This class does not need the "implement" statement,
// since the interface is called in the method
public class Calculator {

    // Overrides the method from the interface
    // Takes the interface as a parameter, to create a lambda expression.
    public int execute(int a, int b, int c, CalculatorInterface ci) {
        // Return the calculate method from the interface.
        // Here, the class "overrides" the abstract interface method.
        return (ci.calculate(a, b, c));
    }
}
