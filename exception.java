class exception {
    public static void main(String[] args) {

        try {
            int x = 5 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }

        try {            int[] s = new int[3];
            System.out.println(s[5]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
