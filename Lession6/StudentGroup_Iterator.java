package Lession6;

import java.util.Iterator;

public class StudentGroup_Iterator implements Iterator<Student> {

   private int count; //на какой итерацциии мы находимся

   private final List<Student> studentList;//список студентов

   public StudentGroup_Iterator(StudentGroup studentGroup) {
    this.count = 0;
    this.studentList = studentGroup.getStudentList();

   }
   
   @Override 
public boolean hasNext() {
 return count < studentList.size() -1;
}

@Override
public Student next() {
    if (!hasNext()) {
        return null;
    }
    count++;
    return StudentList.get(count);
}

@Override 
public void remove() {
    studentList.remove(count);
    }
}
