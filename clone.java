

import java.util.Arrays;

class clone{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = new int[a.length];

        System.out.println("array");
        b = a.clone();

        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
        
        System.out.println("array2");

        System.arraycopy(a, 0, b, 0, 5);
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);

        System.out.println("array3");

        int c[] = Arrays.copyOf(a,3) ;
        for(int i=0;i<c.length;i++)
            System.out.println(c[i]);
        


        

    }
}
