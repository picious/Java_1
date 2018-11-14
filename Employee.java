
/** ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΑΝΑΠΤΥΞΗ ΛΟΓΙΣΜΙΚΟΥ
 *  A΄ Εξαμήνου Μεταπτυχιακού Προγράμματος στην Επιχειρηματική Πληροφορική
 *  Project 1: Ορισμός κλάσεων - η μέθοδος main
 *  Student: mai19013, Christos Demertzis
 */

/**
 * Create a class for Employee
 */
public class Employee {
  // Question 1
  private String name;
  private String education;
  private int postGrad;
  private int years;
  private boolean married;
  private int noChildren;
  private int salary;
  private int bonus;

  public Employee(String fullName, String anEducation, int levelGrad, int noc, boolean ifMarried, int aNoChildren,
      int aSalary) {
    name = fullName;
    education = anEducation;
    if (levelGrad > 3 || levelGrad < 0) {
      throw new IllegalArgumentException("PostGraduate Level must be between 0 and 3");
    } else {
      this.postGrad = levelGrad;
    }

    years = noc;
    married = ifMarried;
    noChildren = aNoChildren;
    salary = aSalary;
    bonus = 0;
  }

  public String getName() {
    return name;
  }

  public void setPostGrad(int postGrad) {
    if (postGrad > 3 || postGrad < 0) {
      throw new IllegalArgumentException("PostGraduate Level must be between 0 and 3");
    } else {
      this.postGrad = postGrad;
    }
  }

  public void printEmployee() {
    System.out.println("Printing Name: " + name);
    switch (postGrad) {
    case 0:
      System.out.println("PostGrad Level : None");
      break;
    case 1:
      System.out.println("PostGrad Level : MSc");
      break;
    case 2:
      System.out.println("PostGrad Level : PhD");
      break;
    default:
      break;
    }
    if (married) {
      System.out.println("Κατάσταση: Έγγαμος");
    } else {
      System.out.println("Κατάσταση: Άγγαμος");
    }

  }

  public void setName(String name) {
    this.name = name;
  }

}