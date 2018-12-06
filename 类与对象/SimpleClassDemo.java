/**
 * 实现一个简单类
 *
 */

 class Lanmould {
   private long id;
   private String name;

   public Lanmould () {}
   public Lanmould (long id, String name) {
     this.id = id;
     this.name = name;
   }

   public String getInfo () {
     return "id: " + this.getId() + ", name:" + this.getName();
   }

   public void setId (long id) {
     this.id = id;
   }

   public void setName (long name) {
     this.name = name;
   }

   public long getId () {
     return this.id;
   }

   public String getName () {
     return this.name;
   }

 }

 public class SimpleClassDemo {
   public static void main(String args[]) {
     Lanmould lan = new Lanmould(1000L, "测试话术");
     System.out.println(lan.getInfo());
   }
 }