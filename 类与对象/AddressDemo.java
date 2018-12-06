/**
 * 实现一个地址类
 *
 * @auth zhangzan
 * @date 2018-12-06 21:58:44
 */
import lombok.Data;

@Data
class Address {
  private String country;
  private String province;
  private String city;

  public Address (String country, String province, String city ) {
    this.country = country;
    this.province = province;
    this.city = city;
  }

  public String getInfo () {
    return "国家：" + this.getCountry() + "，城市：" + province + "，区：" + city;
  }
}

public class AddressDemo {
  public static void main(String[] args) {
    Address ads = new Address("中国", "上海", "普陀");
    System.out.print(ads.getInfo());
  }
}