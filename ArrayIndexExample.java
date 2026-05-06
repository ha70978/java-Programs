class ArrayIndexExample {
    public static void main(String[] args) {
        try {
            int marks[] = {85, 90, 78};
            System.out.println("Marks: " + marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed");
        }
    }
}