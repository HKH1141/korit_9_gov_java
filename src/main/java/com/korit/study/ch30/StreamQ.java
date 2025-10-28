package com.korit.study.ch30;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee {
    String name;
    double salary;
    // constructor, getters


    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%f", salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeDTO {
    String displayName;
    String salaryInfo;
    // constructor, getters


    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSalaryInfo() {
        return salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }
}

public class StreamQ {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squareNums = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squareNums);

        /// ///////////////////////////////////////////////////////////////////////////////////

        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");

        List<Integer> wordsSize = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(wordsSize);

///

        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);

        List<Double> tax = prices.stream()
                .map(n -> n * 110 / 100)
                .collect(Collectors.toList());

        System.out.println(tax);

///

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        List<String> peopleNames = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(peopleNames);

///

        List<String> usernames = Arrays.asList("john", "mary", "steve");

        List<String> infoUsernames = usernames.stream()
                .map(u -> "user:" + u)
                .collect(Collectors.toList());
        System.out.println(infoUsernames);

///
        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

        List<EmployeeDTO> employeeDTOs = employees.stream()
                .map(Employee::toDto)
                .toList();

        System.out.println(employees);
        System.out.println(employeeDTOs);


///

        List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");

        List<String> qwe = cities.stream()
                .map(s -> s.toUpperCase(Locale.ROOT).substring(0,1))
                .toList();
        System.out.println(qwe);
///

        List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);

        List<Double> fCelsius = celsius.stream()
                .map(s -> (s * 9 / 5) +32)
                .toList();
        System.out.println(fCelsius);

///
        List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");

        List<String> mm = messyData.stream()
                .map(m -> m.trim())
                .toList();
        System.out.println(mm);


///
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );

        List<String> domains = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1))
                .toList();
        System.out.println(domains);

    }




}