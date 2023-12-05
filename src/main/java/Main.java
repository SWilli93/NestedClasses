import org.example.Employee;
import org.example.StoreEmployee;

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


        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(115, "Sara", 2015, "Walmart"),
                new StoreEmployee(121, "Tim", 2017, "Target"),
                new StoreEmployee(116, "Becky", 2016, "Publix"),
                new StoreEmployee(119, "John", 2016, "Kroger"),
                new StoreEmployee(120, "Sarah", 2016, "Walmart")
        ));


        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }
    }
}