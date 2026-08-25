public class Strings3 {

    public static void main(String[] args) {

        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original: " + sb);

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace text
        sb.replace(6, 11, "Programming");
        System.out.println("After replace: " + sb);

        // Delete characters
        sb.delete(6, 17);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        String result = sb.toString(); //mutable sequence converted to standard immutable String
        System.out.println(result);
    }
}
//StringBuilder is a built-in class used to create mutable(modifiable) sequence of characters