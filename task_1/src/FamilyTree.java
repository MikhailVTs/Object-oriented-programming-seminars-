import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<People> peopleList;

    public FamilyTree(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public void addPeople(People people) {
        peopleList.add(people);
    }

    public List<People> getPeopleLastName(String lastname) {
        List<People> res = new ArrayList<>();
        for (People people : peopleList) {
            if (people.getLastname() == lastname) {
                res.add(people);
            }
        }
        return res;
    }
}
