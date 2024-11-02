public class Strings {
    public static void main(String[] args) {
        String name = new String("Nitin");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.substring(1, 4));
        System.out.println(name.toLowerCase());
        System.out.println(name.hashCode());
        System.out.println(name.endsWith("n"));
        System.out.println(name.equals("Nitin"));

    }
}