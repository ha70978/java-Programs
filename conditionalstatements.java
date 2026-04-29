class ConditionalStatements {
    public static void main(String[] args) {

        int marks = 75;

        if (marks > 90) {
            System.out.println("A grade");
        }
        else if (marks > 60) {
            System.out.println("B grade");
        }
        else if (marks >= 40) {
            System.out.println("C grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}