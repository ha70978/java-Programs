import java.util.Scanner;

class loops {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int i = s.nextInt();

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;   
        } while (i >= 0);

    
    }
}

    