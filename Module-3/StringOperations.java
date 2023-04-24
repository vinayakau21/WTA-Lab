// Write java program to demonstrate the following String functions
// a. length()
// b. isEmpty(), isBlank()
// c. charAt()
// d. equals(),equalsIgnoreCase()
// e. compareTo() and compareToIgnoreCase()
// f. startsWith() and endsWith()
// g. substring()
// h. concat()
// i. replace(), replaceFirst(), and replaceAll()
// j. contains()
// k. reverse();
// l. split()
// m. join()
// n. toLowerCase() and toUpperCase()
// o. trim( )

public class StringOperations {
    public static void main(String args[]) {
        String f = "Hello ";
        String s = "World";
        System.out.println("Length of first string is " + f.length());
        System.out.println("Length of second string is " + s.length());
        System.out.println("Is first string empty? " + s.isEmpty());
        System.out.println("Character at position 4 of first string " + s.charAt(4));
        System.out.println("Is first and second string equal? " + s.equals(f));
        String t = "world";
        System.out.println("Is second and third string equal(ignore case)?" + s.equalsIgnoreCase(t));
        System.out.println("Compare first and second string? " + s.compareTo(f));
        System.out.println("Compare second and third string(ignore case)?" + s.compareToIgnoreCase(t));
        System.out.println("Second string starts with H? " + s.startsWith("H"));
        System.out.println("First string ends with space? " + f.endsWith(" "));
        String res = f.concat(s);
        System.out.println("Concatenated string first and second is " + res);
        System.out.println("Substring of res " + res.substring(6));
        System.out.println("Replace of l with z " + res.replace("l", "z"));
        System.out.println("Replace of z with l " + res.replaceAll("z", "L"));
        System.out.println("Replace of z with l " + res.replaceFirst("l", "z"));
        System.out.println("HEl is in res " + res.contains("HEl"));
        StringBuilder input1 = new StringBuilder();
        input1.append(res);
        System.out.println(input1);
        System.out.println("Reverse of res is " + input1.reverse());
        System.out.println("Lowercase of res is " + res.toLowerCase());
        System.out.println("Uppercase of res is " + res.toUpperCase());
        String str = " Java Programming ";
        System.out.println("String is " + str);
        System.out.println("Trimmed string is " + str.trim());
    }
}