import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        bt.add(new Student("Іваненко","Петро",2,110,"Спорт"));
        bt.add(new Student("Петров","Иван",3,105,"Малювання"));
        bt.add(new Student("Сидоренко","Олег",4,103,"Шахи"));
        bt.add(new Student("Коваленко","Марія",2,107,"Спорт"));
        bt.add(new Student("Петренко","Данило",2,190,"Спорт"));
        bt.add(new Student("Бондар","Василь",5,195,"Музика"));
        bt.print();
        System.out.println("\nВведіть курс пошуку:");
        int searchCourse = sc.nextInt();
        sc.nextLine();
        System.out.println("Введіть хоббі для пошуку:");
        String searchHobby = sc.nextLine();
        ArrayList<Student> foundStudents = bt.find(searchCourse,searchHobby);
        if (foundStudents.isEmpty()) {
            System.out.println("Студентів за даними критеріями не знайдено.");
        }
        else{
            System.out.println("Студенти знайдені:");
            for (Student student : foundStudents) {
                System.out.println(student);
            }
        }
        bt.delete(2,"Спорт");
        System.out.println("Після видалення:");
        bt.print();
    }
}
