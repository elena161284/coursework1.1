public class Main {
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee(" Иванов Иван Иванович", 1, 30_000);
        employee[1] = new Employee(" Петров Петр Петрович", 2, 40_000);
        employee[2] = new Employee(" Семенов Семен Семенович", 3, 25_000);
        employee[3] = new Employee(" Степанов Степан Степанович", 4, 15_000);
        employee[4] = new Employee(" Константинов Константин Константинович", 5, 20_000);
        employee[5] = new Employee(" Иванов Константин Константинович", 1, 35_000);
        employee[6] = new Employee(" Петров Степан Степанович", 2, 41_000);
        employee[7] = new Employee(" Семенов Петр Петрович", 3, 27_000);
        employee[8] = new Employee(" Степанов Иван Иванович", 4, 12_000);
        employee[9] = new Employee(" Константинов Семен Семенович", 5, 26_000);
        printAllEmployee();
        System.out.println("Сумма затрат на заработную плату в месяц: " + sum());
        System.out.println("Cредняя сумма затрат на заработную плату: "+ average());
        Employee minSalary = findMinSalary();
        if (minSalary != null) {
            System.out.println("Сотрдник с минимальной заработной платой: " + minSalary);
        }
        findSalary();
        printFio();
        employee[0].setSalary(100);
        employee[0].setDepartment(1);
        System.out.println("employee[0].getSalary()= " + employee[0].getSalary());
        System.out.println("employee[0].getDepartment()= " + employee[0].getDepartment());
    }

    public static void printAllEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    public static int sum() {
        int sum = 0;
        for (Employee employee : employee) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee min = null;
        for (Employee employee : employee) {
            if (employee == null) {
                continue;
            }
            if (min == null && employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static void findSalary() {
        Employee max = employee[0];
        Employee min = employee[0];
        for (Employee employee : employee) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        System.out.println("Сотрдник с максимальной заработной платой: " + max);
        System.out.println("Сотрдник с минимальной заработной платой: " + min);
    }

    static double average() {
        return (double)sum() / employee.length;
    }

    static void printFio() {
        for (Employee employee : employee) {
            System.out.println(employee.getId()+employee.getFio());
        }
    }
}