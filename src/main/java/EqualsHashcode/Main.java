package EqualsHashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        Set<Player> hashset = new HashSet<>();

        Player player1 = new Player("Emre", 1);
        Player player2 = new Player("mustafa", 2);
        Player player3 = new Player("mehmet", 3);
        Player player4 = new Player("Emre", 1);

        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);

        for(Player temp: hashset){
            System.out.println(temp);
        }




    }
}
