import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stadium stadium1 = new Stadium("Alvalade", "Portugal", 600000);
        Team team1 = new Team("Sporting", 1, 1, stadium1);

        Stadium stadium2 = new Stadium("Luz", "Portugal", 600000);
        Team team2 = new Team("Benfica", 2, 2, stadium2);

        ArrayList<Team> teamArrayList = new ArrayList<Team>();
        teamArrayList.add(team1);
        teamArrayList.add(team2);
        System.out.println(teamArrayList.toString());


        Vector<Stadium> stadiumVector = new Vector<Stadium>();
        stadiumVector.add(stadium1);
        stadiumVector.add(stadium2);
        System.out.println(stadiumVector.toString());

        Stadium firstStadium = stadiumVector.get(0); // no index 0;
        System.out.println("\nfirst stadium: " + firstStadium);


        // comparation;
        boolean contains = stadiumVector.contains(stadium1);
        System.out.println(contains);

        // stack
        Stack<Team> teamStack = new Stack<Team>();
        teamStack.push(team1);
        teamStack.push(team2);

        Team peekTeam = teamStack.peek();
        Team popTeam = teamStack.pop();
        System.out.println(peekTeam);
        System.out.println(popTeam);

        // enquanto n estiver vazio vai eliminar todos os times
        while (!teamStack.empty()){
            teamStack.pop();
        }

        List<Stadium> stadiumList = new LinkedList<Stadium>();
        stadiumList.addAll(stadiumVector);
        stadiumList.add(stadium1);
        stadiumList.add(stadium2);

        List<Team> teamList = new LinkedList<Team>();
        teamList.add(team1);
        teamList.add(team2);


        // iterador ############ importante
        System.out.println("Iterador");
        Iterator<Stadium> iterator = stadiumList.iterator();
        while (iterator.hasNext()){
            Stadium next = iterator.next();
            System.out.println(next.toString());
        }

        Iterator<Team> iterator2 = teamList.iterator();
        while (iterator.hasNext()){
            Team next2 = iterator2.next();
            System.out.println(next2.getStadium());
            if (next2.getStadium().getCapacity() < 1000000){
                iterator2.remove();
            };
        }

        for (Team team: teamList) {
            System.out.println(team.toString());
        }

        for (Stadium stadium : stadiumVector){
            System.out.println(stadium.toString());
        }
        //Collections.addAll();

        Map<String,Stadium> stadiumMap = new HashMap<String, Stadium>();
        stadiumMap.put(stadium1.getName(), stadium1);
        stadiumMap.put(stadium2.getName(), stadium2);


        if (stadiumMap.containsKey("Alvalade")){
            Stadium ss = stadiumMap.get("Alvalade");
        }

        // keySet() lista de todas as chaves;
        Set<String> keys = stadiumMap.keySet();
        for (String key:keys){
            System.out.println(key);
        }


        /*Set<Stadium> stadiumSet*/

    }
}