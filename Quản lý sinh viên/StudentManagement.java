import java.util.Arrays;
import java.util.Objects;

public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    static Student[] students = new Student[100];

    static int size = 0;

    /**
     * check whether 2 student have same class.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * add student into Student list.
     */
    public static void addStudent(Student newStudent) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equals(newStudent.getId())) {
                return;
            }
        }
        students[size] = newStudent;
        size++;
    }

    /**
     * return like what question required.
     * @return listOfStudents the present list of students
     */
    public static String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        boolean[] printed = new boolean[size];
        Arrays.fill(printed, false);
        for (int i = 0; i < size; i++) {
            if (!printed[i]) {
                result.append(students[i].getGroup()).append('\n');
            }
            for (int j = 0; j < size; j++) {
                if (!printed[j] && students[j].getGroup().equals(students[i].getGroup())) {
                    result.append(students[j].getInfo()).append('\n');
                    printed[j] = true;
                }
            }
        }
        return result.toString();
    }

    /**
     * remove student from id information.
     */
    public static void removeStudent(String id) {
        for (int i = 0; i < size; i++) {
            if (students[i] == null) {
                break;
            }
            if (Objects.equals(students[i].getId(), id)) {
                if (size - 1 - i >= 0) {
                    System.arraycopy(students, i + 1, students, i, size - 1 - i);
                }
                students[size - 1] = null;
                size--;
            }

        }
    }

    public static void main(String[] args) {
        // TODO:

    }
}
