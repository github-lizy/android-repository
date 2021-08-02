public class GraphicUtil {
  // 根据color的int值，计算得出a,r,g,b的int值。
  public static void printRGBA(int color) {
      int alpha = color >>> 24;
      int r = ( color & 0xff0000 ) >> 16;
      int g = ( color & 0xff00 ) >> 8;
      int b = color & 0xff;
      System.out.println("int color is " + color + "  ARGB = " + alpha + ", " + r + ", " + g + ", " + b);
      printInt(alpha, r, g, b);
  }

  //根据a,r,g,b的int值，计算得出color的int值。
  public static void printInt(int alpha, int r, int g, int b) {
      int color = (alpha << 24) | (r << 16) | (g << 8) | b;
      System.out.println("color = "+color);
  }
}
