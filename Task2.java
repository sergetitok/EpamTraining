import java.lang.management.ManagementFactory;

public class Task2 {

    public static void main(String[] args) {
        int ax=1;
        int ay=1;

        int bx=1;
        int by=6;

        int cx=6;
        int cy=0;
        triangleVerif(ax,ay,bx,by,cx,cy);

    }

    public static void triangleVerif(int ax, int ay, int bx, int by, int cx, int cy) {

        double ab = Math.sqrt(Math.abs(Math.pow((ax - bx), 2) + Math.pow((ay - by), 2)));
        double bc = Math.sqrt(Math.abs(Math.pow((bx - cx), 2) + Math.pow((by - cy), 2)));
        double ac = Math.sqrt(Math.abs(Math.pow((cx - ax), 2) + Math.pow((cy - by), 2)));

        if (ab < (bc + ac) && (ac < (ab + bc)) && (bc < (ac + ab))) {
            if (ab == Math.sqrt(Math.abs(Math.pow(ac, 2) + Math.pow(bc, 2)))
                    || bc == Math.sqrt(Math.abs(Math.pow(ac, 2) + Math.pow(ab, 2)))
                    || ac == Math.sqrt(Math.abs(Math.pow(ab, 2) + Math.pow(bc, 2))))
            System.out.println("The points are vertex of the triangle. The triangle is right");
                 else System.out.println("The points are vertex of the triangle");

}
        else System.out.println("The points are not vertex of the triangle");}}




