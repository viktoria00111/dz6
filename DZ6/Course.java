package DZ6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course implements Iterable<StudentGroure> {

    
    private List<StudentGroure> groups;

    public Course(){
        groups = new ArrayList<>();
    }

    public void addGroupe(StudentGroure groupe){
        groups.add(groupe);

    }

    @Override
    public Iterator<StudentGroure> iterator(){
        return groups.iterator();
    }
    public List<StudentGroure> getGroups(){
        return groups;
    }
  
}