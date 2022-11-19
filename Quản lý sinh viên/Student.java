public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    //getter cho thuoc tinh name
    public String getName() {
        return name;
    }

    //setter cho thuoc tinh name
    public void setName(String name) {
        this.name = name;
    }

    //getter cho thuoc tinh id
    public String getId() {
        return id;
    }

    //setter cho thuoc tinh id
    public void setId(String id) {
        this.id = id;
    }

    //getter cho thuoc tinh group
    public String getGroup() {
        return group;
    }

    //setter cho thuoc tinh group
    public void setGroup(String group) {
        this.group = group;
    }

    //getter cho thuoc tinh email
    public String getEmail() {
        return email;
    }

    //setter cho thuoc tinh email
    public void setEmail(String email) {
        this.email = email;
    }

    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}