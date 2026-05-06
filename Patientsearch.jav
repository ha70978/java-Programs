import java.util.Scanner;

public class Patientsearch {
    public static void main(String[] args) {

        int[] patientIDs = {201, 202, 203, 204};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID to search: ");
        int searchID = sc.nextInt();

        boolean found = false;

        for (int id : patientIDs) {
            if (id == searchID) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Patient ID Found");
        else
            System.out.println("Patient ID Not Found");
    }
}