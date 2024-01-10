package JavaBs_Part1.src.ch01;

class Address {

    private String country;

    private String city;

    private String town;

    private String zipcode;

    private String addr;

    public Address() {

    }

    public Address(String country, String city, String town, String zipcode, String addr) {
        this.country = country;
        this.city = city;
        this.town = town;
        this.zipcode = zipcode;
        this.addr = addr;
    }

    public String getInfo() {
        return "國家 : " + this.country + " , 城市 :" + this.city + "鄉鎮 : " + this.town + "郵編 : " + this.zipcode + "地址 : "
                + this.addr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}

/**
 * OOPAddress
 */
public class OOPAddress {

    public static  void main(String[] args){
            System.out.println(new Address("台灣" ,"苗栗" ,"公館" ,"00014",".......").getInfo());
    }
}