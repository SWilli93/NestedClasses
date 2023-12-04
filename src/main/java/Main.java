import org.example.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(101, "Jake", 2015),
                new Employee(155, "Martha", 2017),
                new Employee(131, "Blake", 2017),
                new Employee(205, "Carl", 2019),
                new Employee(206, "Denise", 2019)));

////        var comparator = new EmployeeComparator<>();
//        employees.sort(new EmployeeComparator<>("yearStarted"));

        employees.sort(new Employee.EmployeeComparator<>("yearStarted"));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}