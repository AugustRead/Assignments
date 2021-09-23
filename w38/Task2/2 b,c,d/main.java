/*
2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
2.b Write a function that receives to integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
*/

class main{

public static String orc = "zug zug";
public static String peon = "job's done";

  public static void main(String[] args){

sumOfTwoIntegers(25,50);
toUpperCase();
isFirstLetterUpperCase();

  }

  public static int sumOfTwoIntegers(int a, int b){
    int sum;
    sum = a + b;
    System.out.println("The sum is " +sum);
    return sum;
  }


  public static void toUpperCase(){
    System.out.println(orc.toUpperCase());
  }

  public static void isFirstLetterUpperCase() {
  boolean b;
  char firstLetter = peon.charAt(0);

  b = Character.isUpperCase(firstLetter);

  if (b == true) {
    System.out.println("First letter is uppercase");
    } else {
    System.out.println("First letter is not uppercase");
  }
}
}
