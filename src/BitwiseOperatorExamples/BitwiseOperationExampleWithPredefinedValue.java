package BitwiseOperatorExamples;

public class BitwiseOperationExampleWithPredefinedValue {
    public static void main(String[] args){
        // Declare and initialize the variables
        int a = 3;
        int b = 2;
        // bitwise and
        System.out.println("Result of "+a+"&"+b+" = " + (a & b));
        // bitwise or
        System.out.println("Result of "+a+"|"+b+" = " + (a | b));
        // bitwise xor
        System.out.println("Result of "+a+"^"+b+" = " + (a ^ b));
        System.out.println("Result of ~"+a+" = " + ~a);
        System.out.println("Result of "+a+" << "+b+" = " + (a << b));
        System.out.println("Result of "+a+" >> "+b+" = " + (a >> b));
        // When combined with assignment operator
        a &= b;
        System.out.println("Result after a&=b is a= " + a);

    }
}
