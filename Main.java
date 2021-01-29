
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("what is your name?");
    String name = scan.next();
    System.out.println("what year is it");
    int currentYear = scan.nextInt();
    System.out.println("what is your birth year");
    int birthYear = scan.nextInt();
    System.out.println("how long do you think you will live for");
    int soulYear = scan.nextInt();
    System.out.println();
    System.out.println(greeting(name));
  
    int age = getAge(birthYear, currentYear);
    System.out.println("your age is " + age);
  }

//getAge method calculates getAge
static int getAge(int birthYear, int currentYear)
 {
int age = currentYear - birthYear;
return age;
 }

 //greeting method returns a personalized greeting
 static String greeting(String name)
 {
  String hello = "hello. welcome back, " + name;
  return hello;
 }
}