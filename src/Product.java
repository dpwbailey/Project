/**
 * Programmer: Daniel Bailey Description: OOP Project Date: 9/29/2018
 */


import java.util.Date; //needed to get current time etc

public abstract class Product implements Item {

  int serialNumber;
  String manufacturer = "OraclProduction";
  Date manufacturedOn = new Date();
  String name = "default name";
  int currentProductionNumber;

  public void setProductionNumber(int num) {
    currentProductionNumber = num;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
  }

  public void setName(String name) {

    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getManufactureDate(String date) {
    //    manufacturedOn.getTime();
    return manufacturedOn.toString();
  }

  public int getSerialNumber(int serialNum) {
    return serialNumber;
  }

  String getTypeCode(ItemType itemType) {
    switch (itemType) {
      case Audio:
        return "AU";

      case Visual:
        return "VI";

      case AudioMobile:
        return "AM";

      case VisualMobile:
        return "VM";

      default:
        return "This should not appear";

    }

  }

  //prints info
  public String toString() {
    System.out.println("Manufacturer  : " + manufacturer);
    System.out.println("Serial Number : " + serialNumber);
    System.out.println("Date          : " + manufacturedOn);
    System.out.println("Name          : " + name);
    return "";
  }

  //default constructor
  public Product() {
    return;
  }

  //constructor
  public Product(String pName) {
    String name = pName;
    setName(name);
    setProductionNumber(currentProductionNumber);
    manufacturedOn.getTime();
    toString();

  }
}

