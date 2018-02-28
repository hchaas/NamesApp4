package week4.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameService {

    private List<Name> nameList = Arrays.asList(
            new Name("1", "Fred", "Jones", new Address("2841 Dakota St.", "Janesville", "WI", "53243")),
            new Name("2", "Joe", "Smith", new Address("232 Jimminy Blvd.", "Cooksville", "WI", "33442")),
            new Name("3", "Suzy", "Baldwin", new Address("34232 Blue Ave.", "There", "VA", "34322")));

    public Name getName(String id) {
        Name theName = null;

        for (Name name : nameList) {
            if (name.getId().equals(id)) {
                theName = name;
            }

        }
        return theName;
    }

    public List<Name> getAllNames() {
        return nameList;
    }

    public List<Name> findNames(String search) {
        List<Name> returnItem = new ArrayList<Name>();
        for (Name name : nameList) {
            if (name.getFirstName().startsWith(search)
                    || name.getLastName().startsWith(search)) {
                returnItem.add(name);
            }
        }
        return returnItem;
    }
    
    

}
