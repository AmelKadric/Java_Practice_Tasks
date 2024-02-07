package jd06_practice;

public class  MaximumAndMinimum {

    public static void main(String[] args) {

        double n = max(56.6, 67.6);
        System.out.println(n);
        int m = min(45, 67);
        System.out.println(m);

    }


  public static int max(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
  }

  public static double max(double num1, double num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
  }

  public static int min(int num1, int num2){
        if (num1 < num2){
           return num1;
        }else {
            return num2;
        }
  }

  public static double min(double num1, double num2){
        if (num1 < num2){
            return num1;
        }else {
            return num2;
        }
  }

}

