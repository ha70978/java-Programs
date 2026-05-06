public class Profilebio {
    public static void main(String[] args) {

        String firstName = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";

        StringBuilder bio = new StringBuilder();

        
        bio.append(firstName)
           .append(" FROM ")
           .append(city)
           .append(" LOVES ")
           .append(hobby);

    
        String result = bio.toString().toUpperCase();

        System.out.println(result);
    }
}