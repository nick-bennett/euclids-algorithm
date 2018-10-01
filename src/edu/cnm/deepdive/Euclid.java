package edu.cnm.deepdive;

public class Euclid {

  public static int gcd(int a, int b) {
    return (int) gcd((long) a, b);
  }

  public static long gcd(long a, long b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (a != 0) {
      if (b > a) {
        b %= a;
      } else if (b != 0) {
        a %= b;
      } else {
        b = a;
        a = 0;
      }
    }
    return b;
  }

}
