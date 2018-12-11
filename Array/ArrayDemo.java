/**
 * Array demo
 *
 * @auth zhangzan
 * @date 2018-12-07 10:52:55
 */

public class ArrayDemo { // 主类
  public static void main (String args []) {
    // 动态初始化
    int data1 [] = new int [3];
    data1 [0] = 1;
    data1 [1] = 2;
    data1 [2] = 3;

    System.out.println("动态初始化");
    for (int i = 0; i < data1.length; i++) {
      System.out.print(data1[i] + ",");
    }
    System.out.println("");

    // 静态初始化
    int data2 [] = new int [] { 4, 5, 6 };

    System.out.println("静态初始化");
    for (int i = 0; i < data2.length; i++) {
      System.out.print(data2[i] + ",");
    }
    System.out.println("");

    // foreach
    System.out.println("foreach");
    for (int v : data1) {
      System.out.print(v+",");
    }
    System.out.println("");
  }
}