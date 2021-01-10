package Java8.Lambda.Practice1_2;

public class Student {
    private int rollNo;
    private String name;
    private String address;
    private int age;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public Student(int rollNo, String name, String address, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String toString() {
        return this.rollNo + " " + this.name + " " + this.address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
