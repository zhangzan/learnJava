/**
 * 实现一个地址类
 *
 * @auth zhangzan
 * @date 2018-12-06 21:58:44
 */
class Address {
  private String country;
  private String province;
  private String city;

  public Address (String country, String province, String city ) {
    this.country = country;
    this.province = province;
    this.city = city;
  }

  public void setCountry (String country) {
    this.country = country;
  }
  public void setProvince (String province) {
    this.province = province;
  }
  public void setCity (String city) {
    this.city = city;
  }

  public String getCountry () {
    return this.country;
  }
  public String getProvince () {
    return this.province;
  }
  public String getCity () {
    return this.city;
  }

  public String getInfo () {
    return "国家：" + this.country + "，城市：" + this.province + "，区：" + this.city;
  }
}

public class AddressDemo {
  public static void main(String[] args) {
    Address ads = new Address("中国", "上海", "普陀");
    System.out.print(ads.getInfo());
  }
}