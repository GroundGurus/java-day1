package com.groundgurus.day1;

public class Variables2 {

  public static void main(String[] args) {
    // unary operators ~ (tilde), ! (bang)

    // 0 0 0 0  1 0 1 0 = 10
    //          8 4 2 1

    //  0 0 0 0  1 0 1 0 = 10
    // ~
    // ----------------------
    //  1 1 1 1  0 1 0 1 = -11

    int x = 10;
    int y = 20;
    int z = ~x;
    System.out.println(z);

    System.out.println(!true);

    // * / %
    // + -

    // & (and)    | (pipe, or)
    System.out.println(true & false);
    System.out.println(true | true);

    // && (short circuit and)    || (short circuit or)
    System.out.println(false && true);
    System.out.println(false || true);

    //   0 0 0 0  1 0 1 0 = 10
    // & 0 0 0 1  0 1 1 0 = 22
    // -----------------------
    //   0 0 0 0  0 0 1 0 = 2
    System.out.println(10 & 22); // result 2

    //   0 0 0 0  1 0 1 0 = 10
    // | 0 0 0 1  0 1 1 0 = 22
    // -----------------------
    //   0 0 0 1  1 1 1 0 = 30
    System.out.println(10 | 22); // result 30

    // ^ (xor)
    //   0 0 0 0  1 0 1 0 = 10
    // ^ 0 0 0 1  0 1 1 0 = 22
    // -----------------------
    //   0 0 0 1  1 1 0 0 = 28
    System.out.println(10 ^ 22); // result 28

    // << (left shift), >> (right shift), >>> (unsigned right shift)
    //     10
    //  <<  2
    // ------

    //   0 0 1 0  1 0 0 0 = 32 + 8
    System.out.println(10 << 2);

    int a = 10;
    int b = 20;
    //a = a + b;
    a += b;
    System.out.println("a = " + a);
  }
}
