
package programming.training.week_1.week2.day4.employee_management;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ClassNotFoundException;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int empId;
    private String empName;
    private String department;
    private double salary;

    public Employee(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "John", "IT", 75000);
        employees[1] = new Employee(2, "Sarah", "HR", 68000);
        employees[2] = new Employee(3, "Mike", "Finance", 82000);
        employees[3] = new Employee(4, "Emily", "Marketing", 71000);
        employees[4] = new Employee(5, "David", "Engineering", 90000);

        try (FileOutputStream fos = new FileOutputStream("employees.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employees);
            System.out.println("Employee array successfully serialized.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("employees.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Employee[] retrievedEmployees = (Employee[]) ois.readObject();

            for (Employee employee : retrievedEmployees) {
                System.out.println(employee);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
