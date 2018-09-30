/**
 * Programmer: Daniel Bailey
 * Description: OOP Project
 * Date: 9/29/2018
 **/


public interface Item {

  String manufacturer = "OracleProduction";

  void setProductionNumber(int num);

  void setName(String name);

  String getName();

  String getManufactureDate(String Date);

  int getSerialNumber(int serialNum);

  enum ItemType {
    Audio,
    Visual,
    AudioMobile,
    VisualMobile
  }
  // the two methods below would be used for assigning information
  // to the enum values, but i am unsure how to do so.

  // void setTypeCode(Item item, ItemType desiredType);
  // String getTypeCode(ItemType itemType);


}