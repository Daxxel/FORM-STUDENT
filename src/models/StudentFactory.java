package models;

/**
 * Un Factory es un patrón que crea objetos mas complejos
 * en este caso usaremos StudentFactory para carear Students
 * ya que la clase necesita muchos parámetros y hacer eso seria tedioso
 */

public class StudentFactory {
    private String splitter;

    public StudentFactory(String prefix) {
        splitter = prefix;
    }

    public StudentFactory() {
        splitter = " ";
    }

    public Student createStudent(
        String fullName,
        String career,
        String semester
    ) {
        String[] names = fullName.split(splitter);

        String email = names[0] + "." + names[1] + "@student.com";
        String name = names[0] + " " + names[1];
 
        return new Student(email, name, names[3], names[4], career, semester, email);
    }
}
