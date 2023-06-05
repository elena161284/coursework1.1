public class Employee {
    private static int idCounter=0;
    private final int id;
    private final String fio;
    private int department;
    private int salary;

    public Employee(String fio, int department, int salary) {
        if (department < 1 && department > 5){
            throw new IllegalStateException("отдел от 1 до 5");
    }
        this.id = ++idCounter;
        this.fio = fio;
        this.department = department;
        this.salary=salary;

    }
    int getId() {
        return id;
    }
    String getFio() {
        return fio;
    }

    int getDepartment() {
        return department;
    }

    int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return this.id+"." + this.fio + " "+ " отдел " + this.department + " зарплата " + this.salary;
    }

    }