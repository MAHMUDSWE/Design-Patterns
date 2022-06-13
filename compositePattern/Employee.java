package compositePattern;

public interface Employee {
    public int getId();

    public String getName();

    public double getSalary();

    public void add(Employee employee);

    public void remove(Employee employee);

    public Employee getChild(int i);

    public void print();
}

// Methods that are not needed in child node shouldn't be declared in Interface
// It is recommended to declare only operational function here
//
