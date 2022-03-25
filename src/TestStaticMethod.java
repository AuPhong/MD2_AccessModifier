public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
