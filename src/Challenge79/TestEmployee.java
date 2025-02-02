package Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Ravina", 28, 50000.00 );
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Manish");
        System.out.println(emp.getEmployeeDetails());
    }
}
