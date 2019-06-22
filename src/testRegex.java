/*
// A Simple Java program to demonstrate working of
// Pattern.matches() in Java
import java.util.regex.Pattern;

class testRegex
{
    public static void main(String args[])
    {
        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern "geeksforge*ks"
        System.out.println (Pattern.matches("geeksforge*ks",
                "geeksforgeeeeeks"));

        // Following line prints "false" because the whole
        // text "geeksfor" doesn't match pattern "g*geeks*"
        System.out.println (Pattern.matches("g*geeks*",
                "geeksfor"));
    }
}

 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class testRegex
{
    public static void main(String args[])
    {
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("geeks");

        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforgeeks.org");

        // Print starting and ending indexes of the pattern
        // in text
        while (m.find())
            System.out.println("Pattern found from " + m.start() +
    }
}