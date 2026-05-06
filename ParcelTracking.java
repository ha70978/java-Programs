public class ParcelTracking {
    public static void main(String[] args) {

    
        int[] parcels = {101, 102, 103, 104};

    
        parcels[2] = 999;   

        
        System.out.println("Parcel Numbers:");
        for (int i = 0; i < parcels.length; i++) {
            System.out.println(parcels[i]);
        }
    }
}