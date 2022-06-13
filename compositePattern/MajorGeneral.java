package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MajorGeneral implements Employee {
    private int id;
    private String name;
    private double salary;
    private String designation = "Major General";

    public MajorGeneral(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void print() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
        System.out.println("Designation = " + designation);

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            employee.print();
        }
    }
}
