package cutecircles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListCircles {

    ArrayList<Circle> listCircles = new ArrayList<>();
    
    public ArrayList<Circle> getListCircles() {
        return listCircles;
    }

    public void add100circles() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            listCircles.add(new Circle(Math.abs(random.nextInt() % 100 + 1)));
        }
    }
    
    public void sort() {
        Collections.sort(listCircles);
    }
    
    public void find(double area) {
        int radius = (int) Math.round(Math.sqrt(area/3.14));
        int times = 0;
        for (int i = 0; i < listCircles.size(); i++) {
            if (listCircles.get(i).getRadius() == radius) {
                System.out.println(i + " " + listCircles.get(i).getRadius());
                ++times;
            }
        }
        if (times == 0) {
            System.out.println("No circles have this area");
        }
    }
   
}
