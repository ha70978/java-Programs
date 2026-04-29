 class sample2 {

    public static void main(String[] args ){
         
        samp o = new samp();
        o.add();
        System.out.println(o.a);
    }
}

     class samp{
        int a = 20;

        void add()
        {
            int a = 10;
            System.out.println(a);
        }

     }// LOCAL VARIABLES CAANNOT BE ACCESSED WITHOUT INITILAZIED
     // LOCAL VARIABLES COONOT HAVE DEFAULT VALUES
     // STATIC FIELD CAN BE ACCESED BY NONSTATIC FIELD
     //NoN STATIC CANNOT BE ACCESSED BY NON STATIC FIELD
     // NON STATIC BELONGS TO OBJECT
     // STATIC FIELD BELONGS TO CLASS

    

