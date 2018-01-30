package edu.cnm.deepdive;

public class Test {

  public static void main(String[] args) {
    int[] sizes = {6, 9, 20};
    Composable tester = new McNugget();

    for(int x = 1; x <= 100; x++) {
      //System.out.printf("%d %b%n", x, McNugget.test(x, sizes));
      System.out.printf("%d %s%n", x, tester.test(x, sizes) ? "McNugget" : "Eat");
    }
  }

}
