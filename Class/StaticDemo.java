/**
 * static demo
 * 范例：
 *  编写一个程序类，这个类可以实现实例化对象个数的统计, 每一次创建新的实例化对象都可以实现一个统计操作。
 *  此时可以单独创建一个 static 属性， 因为所有的对象都共享一个 static 属性
 *  在构造方法中可以实现数据的统计处理
 *
 * @auth zhangzan
 * @date 2018-12-06 17:00:45
 */

class Book {
  String title;
  static int count;

  public Book () {
    this("NO-TITLE");
  }

  public Book (String title) {
    count++;
    this.title = title;
  }

  public String getTitle () {
    System.out.println("This is No:" + count);
    return this.title;
  }
};

public class StaticDemo { // 主类
  public static void main (String args []) {
    System.out.println(new Book("java").getTitle());
    System.out.println(new Book("c").getTitle());
    System.out.println(new Book().getTitle());
    System.out.println(new Book().getTitle());
    System.out.println(new Book().getTitle());
  }
}