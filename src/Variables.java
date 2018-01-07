package com.company;/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {
    int n = 113;
    double f = 2.172818;
    String stuff = "Computer Science";

    System.out.println(" This is room #" + n);
    System.out.println("e is close to the value of " + f);
    System.out.println("I'm learning a bit about " + stuff);

    public int isOdd(int num){
        if (num%2 == 1){
            System.out.println(num + "is odd");
        }
        else{
            System.out.println(num + "is not odd");
        }
    }

    public String printHelloWorld(){
        System.out.println("Hello World!");
    }

    public int greatestCommonFactor(){

    }

  }
}
