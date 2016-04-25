package bugreports.slowcompare.client;


public class Objects {
  /**
   * This method is added to replace com.google.common.base.Objects.equal(). The latter sometimes performs about 100 ms
   * on two equal 80K strings in Chrome 49.0.2623.87
   */
  public static boolean equal(Object o1, Object o2) {
    if (o1 == null) return o2 == null;
    if (o2 == null) return false;

    if (o1 instanceof String && o2 instanceof String) {
      String s1 = (String) o1;
      String s2 = (String) o2;
      if (s1.length() != s2.length()) return false;
      for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
          return false;
        }
      }
      return true;
    }

    return o1.equals(o2);
  }
}

