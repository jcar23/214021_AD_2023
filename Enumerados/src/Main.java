import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
       /*
         // == compara referencia, equals compara valores;
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if(command.equals("SAVE")){

        }
        if (command.equals("LOAD")){

        };

        ("EXIT")
        */

        //ArrayList<Integer> arrayList é null pq ainda n esta inicialisada;
         ArrayList<Integer> arrayList = new ArrayList<Integer>();
         arrayList.add(1);
         arrayList.add(12);
         arrayList.add(15);
         arrayList.add(19);

        int element = arrayList.get(2);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(0);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(new Integer(15));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }

        ArrayList<Point> arrayList1 = new ArrayList<Point>();

        Point p1 = new Point();

        arrayList1.add(p1);
        arrayList1.add(new Point());
        arrayList1.add(new Point(1,4));
        arrayList1.add(new Point(6,8));
        arrayList1.add(new Point(10,10));

        Point element1 = arrayList1.get(2);

        arrayList1.remove(new Point(10,10));

        boolean removed = arrayList1.remove(new Point());

        arrayList1.remove(p1);

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        String str = stack.pop();
                                            // construtor por homissão do hasmap
        HashMap<String ,Point> map = new HashMap<String, Point>();

        map.put("Point1", new Point());
        map.put("Point2", new Point(10,10));

        Point pm = map.get("Point2"); // buscar o valor pela chave;


    }

}