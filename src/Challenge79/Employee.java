package Challenge79;

public class Employee {
    private String name;
    private int age;
    private Double salary;

     Employee(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails(){
       return "Employee details: Name: " + name +
                                ", Age: " + age +
                                ", Salary: " + salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
