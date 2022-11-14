import java.util.*;

// interface Comparable<Rational>
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce an option: ");

        String option = scanner.nextLine();
        Menu command = Menu.valueOf(option);
        // conversão de um enum para uma string;
        System.out.println(option);

        /*
        Menu start = Menu.START;
        System.out.println(start);
        Menu loadGame = Menu.LOADGAME;
        System.out.println(loadGame);
        Menu save = Menu.SAVEGAME;
        System.out.println(save);
        Menu highScore = Menu.HIGHSCORES;
        System.out.println(highScore);
        Menu quit = Menu.QUIT;
        System.out.println(quit);
        */

            if  (command == command.START)
                System.out.println("The game has started ");
            else if (command == command.LOADGAME)
                System.out.println("The game has been saved ");
            else if (command == command.SAVEGAME)
                System.out.println("The game has been loaded ");
            else if (command == command.HIGHSCORES)
                System.out.println("The game has been highscores ");
            else if (command == command.QUIT)
                System.out.println("The game has been exited ");
            else
                System.out.println("option not found");

            switch (command){
                case START -> System.out.println("The game has started ");
                case LOADGAME -> System.out.println("The game has been loaded");
                case HIGHSCORES -> System.out.println("The game has a highScore");
                case SAVEGAME -> System.out.println("The game as been saved");
                case QUIT -> System.out.println("You have quit");
            }


            Rational rational1 = new Rational();
            Rational rational2 = new Rational(2,2);
        Rational rational5 = new Rational(1,2);
        Rational rational3 = new Rational(5,2);
        Rational rational4 = new Rational(7,2);

        List<Rational> rationalList = new ArrayList<Rational>();
        rationalList.add(rational1);
        rationalList.add(rational2);
        rationalList.add(rational3);
        rationalList.add(rational4);
        rationalList.add(rational5);

        System.out.println(rationalList);

        Collections.sort(rationalList);

        System.out.println(rationalList);

        
    }


}