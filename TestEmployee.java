/**
 * TestEmployee
 */
public class TestEmployee {

  public static void main(String[] args) {

    Employee employee1 = new Employee("Μαρία Νικολάου", "ΠΕ", 2, 25, true, 2, 1800);
    Employee employee2 = new Employee("Στέλιος Στυλιανίδης", "ΠΕ", 1, 4, true, 2, 1200);
    employee1.printEmployee();
    System.out.println("***");
    // employee1.setYears(2);
    // employee1.increament();
    employee1.setNoChildren(-1);
    employee1.printEmployee();

  }
}