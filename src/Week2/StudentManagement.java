package Week2;

import java.util.Arrays;

public class StudentManagement {

    Student[] students;
    int countStudent;
    public StudentManagement(){
        students = new Student[100];
        countStudent = 0;
    }
    
    public void addStudent (Student newStudent) {
        students[countStudent] = newStudent;
        this.countStudent++;
    }
    
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public String studentsByGroup() {
        boolean[] checkGroup = new boolean[100];
        String str = "";
        for (int i = 0; i < countStudent; i++) {
            if(!checkGroup[i]){
                str += students[i].getGroup() + "\n";
                for(int j = i; j < countStudent; j++){
                    if(sameGroup(students[i], students[j])){
                        checkGroup[j] = true;
                        str += students[j].getInfo() + "\n";
                    }
                }
            }
            checkGroup[i] = false;
        }
        return str;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < countStudent; j++) {
                    students[j] = students[j + 1];
                }
                countStudent--;
                break;
            }
        }
    }
}

 