import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(new Student("Іваненко","Петро",2,12345,"Спорт"));
        bt.add(new Student("Петров","Иван",3,45678,"Малювання"));
        bt.add(new Student("Сидоренко","Олег",4,11111,"Шахи"));
        bt.add(new Student("Коваленко","Марія",2,22222,"Спорт"));
        bt.add(new Student("Петренко","Данило",2,99999,"Спорт"));
        bt.print();
        System.out.println("\nСтуденти 2-го курсу,які займаються спортом:");
        ArrayList<Student> result = bt.find(2,"Спорт");
        for (Student student : result){
            System.out.println(student);
        }
        System.out.println("\nДерево після видалення студентів 2-го курса,які займаються спортом:");
        bt.delete(2,"Спорт");
        bt.print();

    }
}