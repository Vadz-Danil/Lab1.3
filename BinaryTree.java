import java.util.ArrayList;

public class BinaryTree {
    static class Node {
        Student data;
        Node left;
        Node right;
        public Node(Student data) {
            this.data = data;
        }
    }
    private Node root;
    public BinaryTree() {
        root = null;
    }
    public void add(Student student) {
        root = insert(root, student);
    }
    private Node insert(Node current, Student student) {
        if (current == null) {
            return new Node(student);
        }
        else {
            if (student.StudentID < current.data.StudentID) {
                current.left = insert(current.left, student);
            }
            else if (student.StudentID > current.data.StudentID) {
                current.right = insert(current.right, student);
            }
        }
        return current;
    }
    public void print(){
        inorder(root);
    }
    private void inorder(Node current) {
        if (current == null){
            return;
        }
        inorder(current.left);
        System.out.println(current.data.toString());
        inorder(current.right);
    }
    //2 рівень
    public ArrayList<Student> find(int course,String hobby) {
        ArrayList<Student> list = new ArrayList<>();
        if (root == null){
            System.out.println("Tree empty!");
        }
        search(root,course,hobby,list);
        return list;
    }
    private void search(Node current, int course, String hobby, ArrayList<Student> list) {
        if (current == null){
            return;
        }
        search(current.left, course, hobby, list);
        if (current.data.Course == course &&  current.data.Hobby.equals(hobby)){
            list.add(current.data);
        }
        search(current.right, course, hobby, list);
    }
    //3 рівень
    public void delete(int course, String hobby) {
        root = remove(root, course, hobby);
    }
    private Node remove(Node current, int course,String hobby){
        if (current == null){
            return null;
        }
        current.left = remove(current.left, course, hobby);
        current.right = remove(current.right, course, hobby);
        if (current.data.Course == course && current.data.Hobby.equals(hobby)){
            if (current.left == null && current.right == null){
                return null;
            }
            else if (current.left == null){
                current = current.right;
                return current;
            }
            else if (current.right == null){
                current = current.left;
                return current;
            }
            current.right = replaceNode(current, current.right);
        }
        return current;
    }
    private Node replaceNode(Node deleteNode,Node current){
        if (current.left != null){
            current.left = replaceNode(current.left, current);
        }
        else {
            deleteNode.data = current.data;
            current = current.right;
        }
        return current;
    }
}
