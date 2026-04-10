 class Student {
    int rollNo;
    String name;
    
    //Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Raj");
        Student s2 = new Student(2, "Raunak");

        s1.display();
        s2.display();
    }
}
