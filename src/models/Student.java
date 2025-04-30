package models;

public class Student {
    public int id;
    public String name;
    public String fatherLastName;
    public String motherLastName;
    public String career;
    public String semester;
    public String email;

    public Student(
        String id,
        String name,
        String fathersLastName,
        String motherLastName,
        String career,
        String semester,
        String email
    ) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.fatherLastName = fathersLastName;
        this.motherLastName = motherLastName;
        this.career = career;
        this.semester = semester;
        this.email = email;
    }

    public Student(
        String id,
        String name,
        String fatherLastName,
        String career,
        String semester,
        String email
    ) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.fatherLastName = fatherLastName;
        this.career = career;
        this.semester = semester;
        this.email = email;
    }
}
