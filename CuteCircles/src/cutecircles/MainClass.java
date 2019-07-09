package cutecircles;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        ListCircles lc = new ListCircles();
        lc.add100circles();
        lc.sort();
        for (int i = 0; i < 100; i++) {
            System.out.print(lc.getListCircles().get(i).getRadius() + " ");
        }
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            lc.find(scanner.nextDouble());
        }
    }
}
