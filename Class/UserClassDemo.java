/**
 * 用户类 设置姓名 密码 自动计数
 *
 * @auth zhangzan
 * @date 2018-12-07 10:34:48
 */

class User {
  private String name;
  private int uid;
  private String password;
  private static int count;

  public User () {
    this("NOUID", "123456");
  }
  public User (String name) {
    this(name, "123456");
  }
  public User (String name, String password) {
    this.uid = count++;
    this.name = name;
    this.password = password;
  }

  public static int getCount () {
    return count;
  }

  public String getInfo () {
    return "uid: " + uid + ", 姓名: " + name + ", 密码: " + password;
  };
};

public class UserClassDemo { // 主类
  public static void main (String args []) {
    User user1 = new User();
    User user2 = new User("duoyi");
    User user3 = new User("hua", "hahahah");

    System.out.println(user1.getInfo());
    System.out.println(user2.getInfo());
    System.out.println(user3.getInfo());
    System.out.println(User.getCount());
  }
}