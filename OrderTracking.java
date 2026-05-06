public class OrderTracking {
    public static void main(String[] args) {

        StringBuffer status = new StringBuffer("Order Placed");

        // Append steps
        status.append(" -> Packed");
        status.append(" -> Shipped");
        status.append(" -> Delivered");

        System.out.println(status);
    }
}