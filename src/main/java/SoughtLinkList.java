import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SoughtLinkList {
    public static void main(String[] args) {
        ArrayList<String> listOfPhone = new ArrayList<String>();
        listOfPhone.add("iphone");
        listOfPhone.add("samsung");
        listOfPhone.add("infinix");
        listOfPhone.add("techno");
        listOfPhone.add("oppo");
    /// Transversing list through for each loop

        Collections.sort(listOfPhone);
        for (String phone:listOfPhone){
            System.out.println("Printing String " + phone);
        }
    }
}
