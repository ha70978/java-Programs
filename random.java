import java.util.Arrays;
import java.util.Random;

class random {
    public static void main(String[] args) {

        Random r = new Random();

        int a = r.nextInt(6);
        System.out.println("Int: " + a);

        boolean b = r.nextBoolean();
        System.out.println("Boolean: " + b);

        double d = r.nextDouble();
        System.out.println("Double: " + d);

        double g = r.nextGaussian();
        System.out.println("Gaussian: " + g);

        byte[] arr = new byte[5];
        System.out.println(Arrays.toString(bt));
        r.nextBytes(bt);
        System.out.println(Arrays.toString(bt));


    }
}