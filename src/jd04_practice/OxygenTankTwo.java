package jd04_practice;

public class OxygenTankTwo {

    public static void main(String[] args) {

        int num = 76;

        if (num > 90){
            System.out.println("tank is full");
        } else if (num > 80) {
            System.out.println("still ok");
        } else if (num > 70) {
            System.out.println("dont go to far");
        } else if (num > 60) {
            System.out.println("start to head back");
        } else if (num > 50) {
            System.out.println("be careful, almost out");
        }else {
            System.out.println("invalid entry");
        }

        System.out.println("oxygen tank is at " + num);
    }
}
