/**
 * 计算员工薪资增长类
 *
 * @auth zhangzan
 * @date 2018-12-07 10:13:15
 */

class Employee {
  private String name;
  private double salary;
  private double rate;

  public Employee () {}
  public Employee (String name, double salary, double rate) {
    this.name = name;
    this.salary = salary;
    this.rate = rate;
  }

  // 获取涨薪额度
  public double salaryIncValue () {
    return this.salary * this.rate;
  }

  public double salaryIncResult () {
    return this.salary * (1 + this.rate);
  }

  public void getInfo () {
    System.out.println("姓名: " + name + ", 工资: " + salary + "，工资增长率：" + rate);
  };
};

public class EmployeeDemo { // 主类
  public static void main (String args []) {
    Employee emp = new Employee("zhangzan", 8888.0, 0.3);

    emp.getInfo();
    System.out.println(emp.salaryIncValue());
    System.out.println(emp.salaryIncResult());
  }
}