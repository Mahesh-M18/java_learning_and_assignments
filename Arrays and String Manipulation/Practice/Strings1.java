import java.util.Locale;

public class Strings1 {
    public static void main(String[] args) {

        String name = "Mahesh M";
        System.out.println(name);

        String firstname = "Mahesh";
        String lastname = "M";

        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        System.out.println(fullname.length()); //includes spaces also .length() is a method is strings
        // but .length in arrays is a property

        char first = fullname.charAt(0); //Accessing individual characters, indexing starts from 0
        System.out.println(first);

        System.out.println(fullname.toLowerCase());
        System.out.println(fullname.toUpperCase());


        System.out.println(name==fullname); //checks whether two variables are pointing to the same string object in memory
        System.out.println(name.equals(fullname)); //Compares content of the strings so output is true
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