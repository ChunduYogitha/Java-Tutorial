Java Arrays
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets:

String[] cars;
We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces:

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
To create an array of integers, you could write:

int[] myNum = {10, 20, 30, 40};
Access the Elements of an Array
You can access an array element by referring to the index number.

This statement accesses the value of the first element in cars:

Example
import java.io.*;
public class Main{
public static void main(String[] args){
String[] cars = {"Volvo","BMW","Ford","Benz"};
System.out.println(cars[1]);
}}
/*
    BMW
*/
Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
  
Change an Array Element
To change the value of a specific element, refer to the index number:

Example
cars[3] = "MG";
import java.io.*;
public class Main{
public static void main(String[] args){
String[] cars = {"Volvo","BMW","Ford","Benz"};
cars[3] = "MG";
System.out.println(cars[3]);
}}
/*
    MG
*/

Array Length
To find out how many elements an array has, use the length property:

Example
import java.io.*;
public class Main{
public static void main(String[] args){
String[] cars = {"Volvo","BMW","Ford","Benz"};
System.out.println(cars.length);
  /*
      4
  */
  
  
