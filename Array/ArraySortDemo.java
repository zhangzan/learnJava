/**
 * 数组排序
 *
 * @auth zhangzan
 * @date 2018-12-10 15:27:01
 */
class ArrayUtil {
  public static void sort(int data[]) {
    for (int x = 0; x < data.length; x++) {
      for (int y = 0; y < data.length - x - 1; y++) {
        if (data[y] > data[y + 1]) {
          int temp = data[y];
          data[y] = data[y + 1];
          data[y + 1] = temp;

        }
      }
    }
  }

  public static void printArray(int data[]) {
    for (int v : data) {
      System.out.print(v);
    }
  }
}

public class ArraySortDemo { // 主类
  public static void main (String args []) {
    // 动态初始化
    int data [] = new int [] { 8, 9, 0, 5, 4, 2 };

    // java.util.Arrays.sort(data);
    ArrayUtil.sort(data);
    ArrayUtil.printArray(data);
  }
}