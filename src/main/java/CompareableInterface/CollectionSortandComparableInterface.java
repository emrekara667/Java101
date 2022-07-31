package CompareableInterface;

import EqualsHashcode.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionSortandComparableInterface {

    public static void main(String[] args) {

        ArrayList<String>  stringArrayList = new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("C++");
        stringArrayList.add("Python");
        stringArrayList.add("Php");
        stringArrayList.add("Go");

        stringArrayList.stream().forEach(x-> System.out.println(x));
        Collections.sort(stringArrayList);
        System.out.println("-----------After Order---------");
        stringArrayList.stream().forEach(x-> System.out.println(x));

        System.out.println("Player--------------------------------");

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player("murat", 5));
        playerList.add(new Player("emre", 1));
        playerList.add(new Player("oguz", 10));
        playerList.add(new Player("Yusuf", 4));


        playerList.stream().forEach(x-> System.out.println(x));
        Collections.sort(playerList);
        System.out.println("After Order-------------");
        playerList.stream().forEach(x-> System.out.println(x));


        System.out.println("TreeSet Order");
        TreeSet<Player>  playerTreeSet = new TreeSet<>();

        playerTreeSet.add(new Player("murat", 5));
        playerTreeSet.add(new Player("emre", 1));
        playerTreeSet.add(new Player("oguz", 10));
        playerTreeSet.add(new Player("Yusuf", 4));

        playerTreeSet.stream().forEach(x-> System.out.println(x));


    }

}
