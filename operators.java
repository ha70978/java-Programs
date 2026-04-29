class Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        
        System.out.println("Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

    
        System.out.println("\nRelational:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        
        System.out.println("\nLogical:");
 
 
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        
        System.out.println("\nAssignment:");
        int c = 10;
        c += 5;
        System.out.println("c += 5 -> " + c);
        c -= 3;
        System.out.println("c -= 3 -> " + c);

        
        System.out.println("\nUnary:");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));
        System.out.println("d++ = " + (d++));
        System.out.println("--d = " + (--d));
        System.out.println("d-- = " + (d--));

      System.out.println("\nBitwise:");
        System.out.println("a &  b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));

        
        System.out.println("\nTernary:");
        int max = (a > b) ? a : b;
        System.out.println("Max = " + max);

       
    }
}