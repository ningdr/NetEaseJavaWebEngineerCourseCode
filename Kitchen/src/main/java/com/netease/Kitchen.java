package com.netease;

public class Kitchen {
  public static String makeNoodles(String vegetable){
    if ( vegetable == null){
      vegetable = "Tomato";
    }
    StringBuffer sb = new StringBuffer();
    sb.append("<html><body>\n")
      .append("<h1>Noodles with ")
      .append(vegetable)
      .append("</h1>\n")
      .append("</body></html>");
    return sb.toString();
  }
}
