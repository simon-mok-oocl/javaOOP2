import model.Student;

public class testStudent
{
    public static void main(String argv[])
    {
        Student s = new Student(1 , 2 , "student1");
        s.setAge(3);
        s.setId(4);
        s.setName("student2");

        System.out.println(s.getAge() + " " + s.getId() + " " + s.getName());
    }
}
