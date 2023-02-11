package level1;
public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Ivan Ivanov Ivanovich1", 1, 120_000);
        employees[1] = new Employee("Ivan Ivanov Ivanovich2", 2, 110_000);
        employees[2] = new Employee("Ivan Ivanov Ivanovich3", 3, 89_000);
        employees[3] = new Employee("Ivan Ivanov Ivanovich4", 4, 70_000);
        employees[4] = new Employee("Ivan Ivanov Ivanovich5", 5, 68_000);
        employees[5] = new Employee("Ivan Ivanov Ivanovich6", 1, 126_000);
        employees[6] = new Employee("Ivan Ivanov Ivanovich7", 2, 105_000);
        employees[7] = new Employee("Ivan Ivanov Ivanovich8", 3, 89_000);
        employees[8] = new Employee("Ivan Ivanov Ivanovich9", 4, 78_000);
        employees[9] = new Employee("Ivan Ivanov Ivanovich10", 5, 90_000);



        printInfo();
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalarys());
        System.out.println("Cотрудник с минимальной зарплатой: "  + findEmployeeMinSalary());
        System.out.println("Cотрудник с максимальной зарплатой: "  + findEmployeeMaxSalary());
        System.out.println("Cреднее значение зарплат: " + middleSalary());
        printNames();

    }

    private static void printInfo() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static double totalSalarys(){
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeMinSalary(){
        double min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp.getSalary()<min){
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static Employee findEmployeeMaxSalary(){
        double max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp.getSalary()>max){
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static double middleSalary(){
        return totalSalarys()/employees.length;
    }
    private static void printNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

}



