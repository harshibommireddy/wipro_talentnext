package oops;
import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

public class oops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Width");
        double width = sc.nextDouble();

        System.out.println("Height");
        double height = sc.nextDouble();

        System.out.println("Length");
        double length = sc.nextDouble();

        Box obj = new Box(length, width, height);
        System.out.println("Volume: " + obj.volume());
    }
}
