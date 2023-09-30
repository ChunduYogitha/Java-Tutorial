Strings - Special Characters
Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

String txt = "We are the so-called "Vikings" from the north.";
The solution to avoid this problem, is to use the backslash escape character.

The backslash (\) escape character turns special characters into string characters:

Escape character	            Result	              Description
  \'	                          '	                  Single quote
  \"	                          "	                  Double quote
  \\	                          \	                  Backslash

 
                  The sequence \"  inserts a double quote in a string:
public class Main {
public static void main(String[] args) {
String txt = "We are the so-called \"Vikings\" from the north.";
System.out.println(txt);
}
}
/*
    We are the so-called "Vikings" from the north.
*/

The sequence \'  inserts a single quote in a string:
public class Main {
public static void main(String[] args) {
String txt = "It\'s alright.";
System.out.println(txt);
}
}
/*
It's alright.
*/

The sequence \\  inserts a single backslash in a string:
public class Main {
public static void main(String[] args) {
String txt = "The character \\ is called backslash.";
System.out.println(txt);
}
}
/*
The character \ is called backslash.
*/

Other common escape sequences that are valid in Java are:

Code	          Result	
\n	            New Line	
\r	            Carriage Return	
\t	            Tab	
\b	            Backspace	
\f	            Form Feed

public class Main {
public static void main(String[] args) {
String txt = "Hello\nWorld!";
System.out.println(txt);
}
}
/*
    Hello
    World!
*/

public class Main {
public static void main(String[] args) {
String txt = "Hello\rWorld!";
System.out.println(txt);
}
}
/*
Hello
World!
*/

public class Main {
public static void main(String[] args) {
String txt = "Hello\tWorld!";
System.out.println(txt);
}
}
/*
    Hello  World!
*/

public class Main {
public static void main(String[] args) {
String txt = "Hel\bloWorld!";
System.out.println(txt);
}
}
/*
    Helo World!



