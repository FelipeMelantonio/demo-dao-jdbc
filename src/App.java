import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Department department = new Department(1, "Human Resources");
        System.out.println(department);
        Seller seller = new Seller(1, "John Doe","bob@gmail", new Date(),3000.0, department);
        System.out.println(seller); 
    }
}
