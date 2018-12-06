/**
 * 类与对象的定义及使用
 *
 * 堆内存是地址 栈内存是具体值
 *
 * @auth zhangzan
 * @date 2018-12-06 10:20:45
 */

class Person {
  String name;
  int age;

  public void say () {
    System.out.print("name: " + name + ", age: " + age);
  };
};

public class ClassDemo { // 主类
  public static void main (String args []) {
    Person zan = new Person();
    zan.name = "zane";
    zan.age = 30;
    zan.say();
    // age 30

    Person zan2 = zan; // 引用传递
    zan2.age = 50;

    zan.say();
    // age 50
  }
}