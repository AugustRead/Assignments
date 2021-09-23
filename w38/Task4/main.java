/*
For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length.
4.a create arrays of the following type and assign it at least 3 different values:
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
*/
import java.util.*;
import java.util.stream.IntStream;
import java.util.Arrays;

class main {

public static String[] zugs = {"zug", "zug", "zug", "zug"};
public static int[] intArray = {14, 4, 25, 1};
public static boolean[] booleanArray = {true, true, false};

  public static void main(String[] args) {

printStrings();
sumOfArray();
avgOfArray();
sortedArray();

  }

  public static void printStrings() {
    for (int i = 0; i < zugs.length; i++) {
    System.out.println(zugs[i]);
    }
  }

  public static void sumOfArray() {
    int sum = IntStream.of(intArray).sum();
    System.out.println("The sum of the elements in the array is... " + sum);

  }

  public static void avgOfArray() {
    IntStream intStream = IntStream.of(intArray);
      OptionalDouble res = intStream.average();
      System.out.println("The mean of the elements in the array is... " + res.getAsDouble());
  }

  public static void sortedArray() {
    Arrays.sort(intArray);
    for (int i = 0; i < intArray.length; i++) {
    System.out.println(intArray[i]);
  }
}
}
