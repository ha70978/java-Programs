public class AllStringMethods {
    public static void main(String[] args) {

        String s = "  Hello Java Programming  ";
        String s2 = "hello java programming";

        //  Inspection
        System.out.println("Length: " + s.length());
        System.out.println("isEmpty: " + s.isEmpty());
        System.out.println("isBlank: " + s.isBlank());

        //  Comparison
        System.out.println("equals: " + s.equals(s2));
        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase(s2));
        System.out.println("compareTo: " + s.compareTo(s2));
        System.out.println("contains 'Java': " + s.contains("Java"));

        //  Extraction
        System.out.println("charAt(2): " + s.charAt(2));
        System.out.println("substring(2, 7): " + s.substring(2, 7));
        System.out.println("indexOf 'a': " + s.indexOf('a'));
        System.out.println("lastIndexOf 'a': " + s.lastIndexOf('a'));

        //  Modification
        System.out.println("trim: " + s.trim());
        System.out.println("strip: " + s.strip());
        System.out.println("replace: " + s.replace("Java", "Python"));
        System.out.println("repeat(2): " + s.repeat(2));
        System.out.println("toUpperCase: " + s.toUpperCase());
    }
}