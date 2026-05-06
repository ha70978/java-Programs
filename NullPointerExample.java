class NullPointerExample {
    public static void main(String[] args) {
        try {
            String studentName = null;
            System.out.println("Length: " + studentName.length());
        } catch (NullPointerException e) {
            System.out.println("Student name is not available");
        }
    }
}