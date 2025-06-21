/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
class Employee {
    String employeeId;
    String name;
    String position;
    double salary;
    
    public Employee(String id, String name, String position, double salary) {
        this.employeeId = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Position: %s, Salary: $%.2f",
                employeeId, name, position, salary);
    }
}

public class EmployeeSystem {
    private Employee[] employees;
    private int count;
    private int capacity;
    
    public EmployeeSystem(int capacity) {
        this.capacity = capacity;
        employees = new Employee[capacity];
        count = 0;
    }
    
    public void addEmployee(Employee emp) {
        if (count < capacity) {
            employees[count++] = emp;
            System.out.println("Employee added: " + emp);
        } else {
            System.out.println("System full! Cannot add employee.");
        }
    }
    
    public Employee searchEmployee(String id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId.equals(id)) return employees[i];
        }
        return null;
    }
    
    public void traverseEmployees() {
        System.out.println("Employee List:");
        for (int i = 0; i < count; i++) System.out.println(employees[i]);
    }
    
    public void deleteEmployee(String id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId.equals(id)) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Deleting employee: " + employees[index]);
            for (int i = index; i < count - 1; i++) employees[i] = employees[i+1];
            count--;
            employees[count] = null;
        } else {
            System.out.println("Employee not found!");
        }
    }
    
    public static void main(String[] args) {
        EmployeeSystem system = new EmployeeSystem(5);
        system.addEmployee(new Employee("E1001", "John Doe", "Manager", 75000));
        system.addEmployee(new Employee("E1002", "Jane Smith", "Developer", 65000));
        system.traverseEmployees();
        system.deleteEmployee("E1002");
        system.traverseEmployees();
    }
}