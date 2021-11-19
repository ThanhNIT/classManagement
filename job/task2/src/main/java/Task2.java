import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

  public static void main(String[] args) throws IOException {
    int[] dimensions = {};
    dimensions = enterDimensions();
    while (dimensions.length!=0){
      System.out.print("The area of room is "+ calculateArea(dimensions[0],dimensions[1]) +"\n");
      dimensions = enterDimensions();
    }
  }

  static int[] enterDimensions() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean trueValue = false;
    int length =0;
    int width =0;
    while (!trueValue) {

      System.out.print("Enter the length of the room: ");
      String input = br.readLine();

      try {
        length = new Integer(input);
        if (length==0) {
          return new int[]{};
        }
        trueValue=true;
      } catch (Exception e) {
        trueValue = false;
      }
    }
    trueValue=false;

    while (!trueValue) {

      System.out.print("Enter the width of the room: ");
      String input = br.readLine();

      try {
        width = new Integer(input);
        trueValue=true;
      } catch (Exception e) {
        trueValue = false;
      }
    }
    return new int[]{length,width};
  }



  static int calculateArea(int length, int width) {

    if (width == 0) {
      return length * length;

    }
    return length * width;
  }
}

