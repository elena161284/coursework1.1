public class Employee {
    private final int id;
    private final String surName;
    private final String name;
    private final String patronymic;
    private int department;
    private int salary;

    private static int idCounter;

    public Employee(String surName, String name, String patronymic, int department, int salary) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        if (salary > 0) {
            this.salary = salary;
        }
        id = idCounter++;
    }

    String getSurName() {
        return surName;
    }

    String getName() {
        return name;
    }

    String getPatronymic() {
        return patronymic;
    }

    int getDepartment() {
        return department;
    }

    int getSalary() {
        return salary;
    }
    int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "сотрудник: " + this.surName + " " + this.name + " " + this.patronymic
                + " отдел " + this.department + " зарплата " + this.salary;
    }
}