import java.util.*;

public class Thanos {

    public static void main(String[] args) {
    	
    	
    	// Create instances of the class Hero
    	Hero blackWidow = new Hero("Black Widow", 34);
    	Hero captainAmerica = new Hero("Captain America", 100);
    	Hero vision = new Hero("Vision", 3);
    	Hero ironMan = new Hero("Iron Man", 48);
    	Hero scarletWitch = new Hero("Scarlet Witch", 29);
    	Hero thor = new Hero("Thor", 1500);
    	Hero hulk = new Hero("Hulk", 49);
    	Hero doctorStrange = new Hero("Doctor Strange", 42);

        // Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<>();

        // Add heroes to the ArrayList heroes	
    	heroes.add(blackWidow);
    	heroes.add(captainAmerica);
    	heroes.add(vision);
    	heroes.add(ironMan);
    	heroes.add(scarletWitch);
    	heroes.add(thor);
    	heroes.add(hulk);
    	heroes.add(doctorStrange);
    	
        // Set Thor's age to 1501    	
    	thor.setAge(1501);
    	
    	// Shuffle heroes list
    	Collections.shuffle(heroes);
    	
        // Keep only half of the list
    	int listCut = heroes.size() / 2;
    	ArrayList<Hero> subListHeroes = new ArrayList<> (heroes.subList(0, listCut));
    
        // Loop throught subListHeroes and display the name of the remaining heroes	
    	for (int i = 0; i < subListHeroes.size(); i ++) {
    		System.out.println(subListHeroes.get(i).getName());
    	}
    }
}
