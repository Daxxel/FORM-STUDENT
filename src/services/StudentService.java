package services;

public class StudentService {
    private static StudentService instance;

    private StudentService() {

    }

    public static StudentService studentService() {
        if(instance == null) {
            instance = new StudentService();
        }

        return instance;
    }
}
