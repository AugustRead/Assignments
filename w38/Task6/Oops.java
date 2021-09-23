
/*
*
* Hvis du kompilerer programmet får du 7 fejl.
* Kan du fixe programmet så det kan køre og
* outputtet bliver:
* "7 is the smallest!"
*
*
*/
public class Oops {

public static int smaller;

public static void main(String[] args) {
int a = 7, b = 42;
 minimum(a,b);
 if (smaller == a) {
   System.out.println("a is the smallest!");
 } else {
   System.out.println("b is the smallest!");
 }
}
  public static int minimum(int a, int b) {
    if (a < b) {
      smaller = a;
    } else {
      smaller = b;
    }
    return smaller;
  }
}
