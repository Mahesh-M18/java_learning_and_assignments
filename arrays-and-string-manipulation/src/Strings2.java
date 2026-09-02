public class Strings2 {
    public static void main(String[] args) {
        String message = "Hello Mahesh";
        System.out.println(message.contains("Mahesh")); //searching inside a string
        System.out.println(message.contains("Java"));

        String email = "mahesh@gmail.com";
        System.out.println(email.startsWith("mahesh")); //checks the beginning
        System.out.println(email.endsWith(".com")); //checks the ending

        String name = "\u2003   Mahesh    M    \u2003"; // \u2003 is a unicode "Em Space"
        System.out.println(name.trim()); // removes spaces and is older version
        // and can't identify different types of spaces except tab spaces and nextline etc
        System.out.println(name.strip()); // removes spaces and is smart , newer version

        String fullName = "Mahesh M";
        String part = fullName.substring(0,4); //substring
        System.out.println(part);

        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        String text = " J a v a i s f u n ";
        System.out.println(text.replace(" ","")); // to replace text

    }
}
