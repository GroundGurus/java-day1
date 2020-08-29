package com.groundgurus.day1;

public class Variables {

  public static void main(String[] args) {
    // 8 bits/1 byte
    // -1^7 to 1^7-1
    // -128 to 127
    byte x = (byte) 129; // casting from int to byte
    double y = 20; // int (32), double (64)
    char z = '\u0098';
//    System.out.println(y);
//    System.out.println(z);

    System.out.println(x == y);

    String name = "The big red fox jumps over a lazy dog";
    System.out.println(name.indexOf('r'));
    System.out.println(name.lastIndexOf('r'));
    System.out.println(name.length());

//    String celebrity1 = "Jessy"; // create String object in the String pool sa memory
//    String celebrity2 = new String("Jessy"); // do not do this!
//    System.out.println(celebrity1.equals(celebrity2));
//
//    System.out.println(celebrity1 == celebrity2); // do not do this as well!

    System.out.println(100 + 212.12);
    // String pool, how many object are created?
    // "Jessy"
    // "x"
    // "Lucky"
    // "Jessyx"
    // "JessyxLucky"
    // "The sum is"
    // "The sum is 10"
    // The sum is 1020"

    String completeName = "Jessy" + "x" + "Lucky"; // concatenation
    System.out.println(completeName);

    // operator precedence
    // + L to R

    String result = "The sum is " + (10 + 20 + 30 + 40 + 50);
    System.out.println(result);

    // a++ is equal to a = a + 1
    // a = 12
    // b = 12
    // c = 23
    int a = 10;
    int b = ++a;
    int c = a++ + ++b;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
