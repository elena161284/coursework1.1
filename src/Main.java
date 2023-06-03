public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 1, 30_000);
        employee[1] = new Employee("Петров", "Петр", "Петрович", 2, 40_000);
        employee[2] = new Employee("Семенов", "Семен", "Семенович", 3, 25_000);
        employee[3] = new Employee("Степанов", "Степан", "Степанович", 4, 15_000);
        employee[4] = new Employee("Константинов", "Константин", "Константинович", 5, 20_000);
        for (Employee value : employee) {
            System.out.println(value);
        }
        employee[0].setSalary(100);
        employee[0].setDepartment(1);
        System.out.println("employee[0].getSalary()= " + employee[0].getSalary());
        System.out.println("employee[0].getDepartment()= " + employee[0].getDepartment());

        int[] salary = {30_000, 40_000, 25_000, 15_000, 20_000};
        int maxSalary = 0;
        int minSalary = 40_000;
        compareSum(maxSalary, minSalary, salary);
        int sum = 0;
        addedUpTheAmounts(sum, salary);
        calculatedTheAverageAmount(salary);
    }
    private static void calculatedTheAverageAmount(int[] salary) {
        int sum = 0;
        for (int i: salary) {
            sum += i;
        }
        sum=sum/salary.length;
        System.out.println("Cредняя заробатная  плата : " + sum);
    }
    private static void compareSum(int maxSalary, int minSalary, int[] salary) {
        for (int j : salary) {
            if (j > maxSalary) {
                maxSalary = j;
            }
            if (j < minSalary) {
                minSalary = j;
            }
        }
        System.out.println("Минимальная заработная плата- " + minSalary);
        System.out.println("Максимальная заработная плата- " + maxSalary);
    }

    private static void addedUpTheAmounts(int sum1,int[] salary) {
        for (int j : salary) {
            sum1 = sum1 + j;
        }
        System.out.println("Общая сумм заработных плат: "+sum1);
    }

    }