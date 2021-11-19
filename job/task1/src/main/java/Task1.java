import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int numStd = 10;
    double totalGrade = 0.0;
    int minGrade = 1000;
    int maxGrade = -1;
    for (int i = 1; i <= numStd; i++) {
      int grade = 0;
      boolean trueValue = false;
      System.out.print("Enter grade for student " + i + ": ");
      String input = br.readLine();
      try {
        grade = new Integer(input);
        if (grade >= 0 && grade <= 100) {
          trueValue = true;
        }
      } catch (Exception e) {
        trueValue = false;
      }


      while (!trueValue) {

        System.out.print("Invalid grade. Enter again: ");
        input = br.readLine();
        try {
          grade = new Integer(input);
          if (grade >= 0 && grade <= 100) {
            trueValue = true;
          }
        } catch (Exception e) {
          trueValue = false;
        }

      }

      if (minGrade > grade) minGrade = grade;
      if (maxGrade < grade) maxGrade = grade;

      totalGrade += grade;
    }

    System.out.print("The lowest grade is " + minGrade+"\n");
    System.out.print("The highest grade is " + maxGrade +"\n");
    System.out.print("The average grade is " + totalGrade / numStd +"\n");


  }
}

