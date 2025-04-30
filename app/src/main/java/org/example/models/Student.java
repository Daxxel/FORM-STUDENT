package org.example.models;

public class Student {
    private String id;
    private String name;
    private String fatherLastName;
    private String motherLastName;
    private String career;
    private String semester;
    private String email;

    public Student(
        String id,
        String name,
        String fathersLastName,
        String motherLastName,
        String career,
        String semester,
        String email
    ) {
        this.id = id;
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
        this.id = id;
        this.name = name;
        this.fatherLastName = fatherLastName;
        this.career = career;
        this.semester = semester;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFatherLastName() {
        return fatherLastName;
    }
    
    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }
    
    public String getMotherLastName() {
        return motherLastName;
    }
    
    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }
    
    public String getCareer() {
        return career;
    }
    
    public void setCareer(String career) {
        this.career = career;
    }
    
    public String getSemester() {
        return semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
}
