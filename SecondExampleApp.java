public class SecondExampleApp {

    public static void main(String[] args) {
        Circle bigCircle = new Circle(11, 0, -100);
        Circle smallCircle = new Circle(0,-10, 10);

               bigCircle.print();
               bigCircle.calculateArea();

               smallCircle.print();
               smallCircle.calculateArea();
    }
}

class Circle {

    int cx;
    int cy;
    int radius;
    boolean valid;

    Circle(int pcx, int pcy, int pr) {
        cx = pcx;
        cy = pcy;
        if (pr >= 0) {
            radius = pr;
            valid = true;
        } else {
            System.out.println("NEGATIVE RADIUS VALUE !!!");
            valid = false;
        }
    }

    void print() {
        if (valid) {
            System.out.println(
                    "\n########## CIRCLE ##########\n"  +
                    "RADIUS: " + radius + "\n"        +
                    "Center: " + cx + "," + cy + "\n" +
                    "###############################"
                );
        } else {
            System.out.println(
                    "\n######## CIRCLE (BROKEN!!!) ########"
            );
        }

    }

    void calculateArea() {
        final float pi = 3.1415f;
        float area;

        if (valid) {
            area = pi * radius * radius;
            System.out.println("AREA = " + area + "\n"          +
                               "###############################"
            );
        } else {
            System.out.println("AREA = -1 \n" + "###############################");
        }

    }

}
