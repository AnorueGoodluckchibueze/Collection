import java.util.HashSet;

public class HarshSett {
    public static void main(String[] args) {
        HashSet<String> harsher = new HashSet<>();
            harsher.add("voldka");
            harsher.add("fruit juice");
            harsher.add("Water");
            harsher.add("Spirit");
            harsher.add(null);
            harsher.add("voldka");
        //System.out.println(harsher);
//// Using advance for loop( meaning everything in the harsher, put it in rhe new variable and save it as a string )
        for (String harsh : harsher){
            System.out.println("Advance for loop "+ harsh);
        }

    //using forEach
    harsher.forEach(harkit -> System.out.println(harsher));







    }
}
