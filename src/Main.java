public class Main extends Product {

  enum ItemType {
    Audio(4),
    Visual(3),
    AudioMobile(2),
    VisualMobile(1);
    public int type;

    ItemType(int type) {

      this.type = type;
    }

    public String type() {
      String sType;
      switch (type) {
        case 1:
          return "VM";
        case 2:
          return "AM";
        case 3:
          return "VI";
        case 4:
          return "AU";
        default:
          return "This is not supposed to happen";

      }

    }

  }

  public static void main(String[] args) {

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.type);
    }

  }

}

