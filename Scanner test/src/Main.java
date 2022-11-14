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

        Student newStudent1 = new Student(2140521, "Jucelio");
        Student newStudent2 = new Student(2140621, "Luizildo");
        Student newStudent3 = new Student(2140821,"Edjailson");

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(newStudent1);
        studentList.add(newStudent2);
        studentList.add(newStudent3);

        Collections.sort(studentList);
        System.out.println(studentList);
        // natural ordering
        Collections.sort(studentList, new StudentsComparatorByName());
        System.out.println(studentList);
        Collections.sort(studentList, new StudentsComparatorByNumber());
        System.out.println(studentList);

        // Map<Interger (tipo primitivo),Course(Valor)>
        //Map<Integer, String> subjects = new HashMap<>();

        Course course1 = new Course(01,"Arquitetura",60,2019);
        Course course2 = new Course(02, "SGBD", 50, 2021);
        Course course3 = new Course(03,"Sistemas Digitais",60,2020);
        Course course4 = new Course(04,"ACE", 50,2021);

        Map<Integer, Course> subjects = new HashMap<>();

        subjects.put(course1.getCode(),course1);
        subjects.put(course2.getCode(),course2);
        subjects.put(course3.getCode(),course3);
        subjects.put(course4.getCode(),course4);
        System.out.println(subjects.keySet());
        System.out.println(subjects.values());
        System.out.println(subjects);

        List<Integer> yearList = new ArrayList<Integer>();

        for (Course course: subjects.values()) {
            if (!yearList.contains(course.getAno()))
                yearList.add(course.getAno());
        }
        System.out.println(yearList.toString());

        Collections.sort(yearList);

        //List<List<String>> stringList = new ArrayList<Student>()
        ArrayList<ArrayList<Course>> courseByYear = new ArrayList<ArrayList<Course>>();
        for (int year: yearList) {
            ArrayList<Course> list = new ArrayList<Course>();
            for (Course course: subjects.values()) {
                if(year == course.getAno()){
                    list.add(course);
                }
            }
            courseByYear.add(list);
        }

        for (ArrayList<Course> list: courseByYear) {
            for (Course course: list) {
                System.out.println(course);
            }
        }
    }


}