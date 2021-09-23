/*
1.a Create a file and name it Main.java, include a main method.
1.b Write a function that prints an empty line and call it from main();
1.c Write a function that receives a string as a parameter and prints it. call this function from main()
1.d Write a function that receives a string called "name" and an integer called "age" and call it from main with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".
*/

class main {

public static String myName = "August";
public static int age = 23;

public static void main(String[] args){


  emptyLine();
  name();
  nameAndAge();


}
  public static void emptyLine(){
    System.out.println("");
  }
  public static void name() {
    System.out.println(myName);

  }
  public static void nameAndAge() {
    System.out.println("My name is "+myName+", I am "+age+" years old.");
  }
}
