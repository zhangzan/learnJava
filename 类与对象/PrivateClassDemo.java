import com.oracle.webservices.internal.api.EnvelopeStyle.Style;

/**
 * 成员属性封装
 *
 * @auth zhangzan
 * @date 2018-12-06 10:20:45
 */

class Person2 {
  private String name;
  private int age;

  // 构造方法和类名相同
  public Person2 () {
    System.out.println("hahahhahaha1");
  }

  public Person2 (String name, int age) {
    this();
    this.setName(name);
    this.age = age;
  }
  public void setName (String s) {
    name = s;
  }

  public void setAge (int n) {
    age = n;
  }

  public int getAge () {
    return age;
  }

  public String getName () {
    return name;
  }

  public void say () {
    System.out.print("name: " + name + ", age: " + this.getAge());
  }
};

public class PrivateClassDemo { // 主类
  public static void main (String args []) {
    // Person2 zan = new Person2();
    // zan.setName("zane");
    // zan.setAge(30);

    Person2 zan = new Person2("zan", 30);
    zan.say();
  }
}