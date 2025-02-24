public class Student {
    String Surname;
    String Name;
    int Course;
    int StudentID;
    String Hobby;
    public Student(String Surname, String Name, int Course, int StudentID, String Hobby) {
        this.Surname = Surname;
        this.Name = Name;
        this.Course = Course;
        this.StudentID = StudentID;
        this.Hobby = Hobby;
    }
    @Override
    public String toString() {
        return String.format("%12s %10s %5d %10s %15s", Surname, Name, Course, StudentID, Hobby);
    }
}
