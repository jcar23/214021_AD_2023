package pt.uma.tpsi.arqd.shapes;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        //ordenar de forma crescente;
        // return  (int) ((o1.getX() - o2.getY()));
        //ordenar de forma decrescente;
       return  (int) ((o2.getY() - o1.getX()));
    }
}
