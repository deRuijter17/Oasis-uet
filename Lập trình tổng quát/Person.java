public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * constructor person.
     * 
     * @param name name
     * @param age age
     * @param address address
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person o) {
        int nameCompare = this.name.compareTo(o.getName());
        if (nameCompare == 0) {
            return this.age - o.getAge();
        }
        return nameCompare;
    }
}
