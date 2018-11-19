/**
 * TestEmployee
 */
public class TestEmployee {

  public static void main(String[] args) {

    Employee employee1 = new Employee("Μαρία Νικολάου", "ΠΕ", 2, 25, true, 2, 1800);
    // δημιουργία 1ου εργαζόμενου
    //
    Employee employee2 = new Employee("Στέλιος Στυλιανίδης", "ΠΕ", 1, 4, true, 2, 1200); // δημιουργία 2ου εργαζόμενου

    // Εκτύπωση εργαζομένων
    employee1.printEmployee(); // εκτύπωση στοιχεία 1ου εργαζόμενου
    employee2.printEmployee(); // εκτύπωση στοιχεία 2ου εργαζόμενου
    System.out.println("*** Αλλαγή του αριθμού ανήλικων παιδιών του/της " + employee1.getName());
    employee1.setNoChildren(-1); // θέτουμε αριθμό παιδιών -1
    System.out.println("*** Αλλαγή του αριθμού ανήλικων παιδιών του/της " + employee1.getName());
    employee1.setNoChildren(0); // θέτουμε αριθμό παιδιών 0
    System.out.println("*** Υπολογισμός μηνιαίου εισοδήματος του/της " + employee1.getName());
    employee1.setBonus(); // υπολογισμός bonus
    employee1.printEmployee(); // εκτύπωση στοιχεία 1ου εργαζόμενου
    System.out.println("*** Υπολογισμός μηνιαίου εισοδήματος του/της " + employee2.getName());
    employee2.setBonus(); // υπολογισμός bonus
    employee2.printEmployee(); // εκτύπωση 2ου εργαζόμενου
  }
}