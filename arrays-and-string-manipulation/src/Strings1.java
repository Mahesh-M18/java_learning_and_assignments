import java.util.Locale;

public class Strings1 {
    public static void main(String[] args) {

        String name = "Mahesh M";
        System.out.println(name);

        String firstName = "Mahesh";
        String lastName = "M";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(fullName.length()); //includes spaces also .length() is a method is strings
        // but .length in arrays is a property

        char first = fullName.charAt(0); //Accessing individual characters, indexing starts from 0
        System.out.println(first);

        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());


        System.out.println(name==fullName); //checks whether two variables are pointing to the same string object in memory
        System.out.println(name.equals(fullName)); //Compares content of the strings so output is true
    }
}

/*
String is immutable
 */

/*
for primitive values
int a=10,b=10;
a==b
 */

/*
for String content
name1.equals(name2)
 */