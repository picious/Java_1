
/** ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΑΝΑΠΤΥΞΗ ΛΟΓΙΣΜΙΚΟΥ
 *  A΄ Εξαμήνου Μεταπτυχιακού Προγράμματος στην Επιχειρηματική Πληροφορική
 *  Project 1: Ορισμός κλάσεων - η μέθοδος main
 *  Student: mai19013, Christos Demertzis
 */

/**
 * Create a class for Employee
 */
public class Employee {

  private String name;
  private String education;
  private int postGrad;
  private int years;
  private boolean married;
  private int noChildren;
  private int salary;
  private int bonus;

  // Constructor
  public Employee(String fullName, String anEducation, int levelGrad, int noOfYears, boolean ifMarried, int aNoChildren,
      int aSalary) {
    name = fullName;
    education = anEducation;
    postGrad = levelGrad;
    years = noOfYears;
    married = ifMarried;
    noChildren = aNoChildren;
    salary = aSalary;
    bonus = 0;
  }

  // Getters and Setters

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return String return the education
   */
  public String getEducation() {
    return education;
  }

  /**
   * @param education the education to set
   */
  public void setEducation(String education) {
    if (education == "ΥΕ" || education == "ΔΕ" || education == "ΠΕ") {
      this.education = education;
    }
  }

  /**
   * @return int return the postGrad
   */
  public int getPostGrad() {
    return postGrad;
  }

  /**
   * @param postGrad the postGrad to set
   */
  public void setPostGrad(int postGrad) {
    if (postGrad == 1 || postGrad == 1 || postGrad == 2) {
      this.postGrad = postGrad;
    }
  }

  /**
   * @return int return the years
   */
  public int getYears() {
    return years;
  }

  /**
   * @param years the years to set
   */
  public void setYears() {
    years++;
  }

  /**
   * @return boolean return the married
   */
  public boolean isMarried() {
    return married;
  }

  /**
   * @param married the married to set
   */
  public void setMarried(boolean married) {
    this.married = married;
  }

  /**
   * @return int return the noChildren
   */
  public int getNoChildren() {
    return noChildren;
  }

  /**
   * @param noChildren the noChildren to set
   */
  public void setNoChildren(int noChildren) {
    if (noChildren < 0) {
      System.out.println("Λάθος δεν επιτρέπεται αρνητικός αριθμός παιδιών");
    } else {
      this.noChildren = noChildren;
    }
  }

  /**
   * @return int return the salary
   */
  public int getSalary() {
    return salary;
  }

  /**
   * @param salary the salary to set
   */
  public void setSalary(int salary) {
    this.salary = salary;
  }

  /**
   * @return int return the bonus
   */
  public int getBonus() {
    return bonus;
  }

  /**
   * @param bonus the bonus to set
   */
  // bonus = (10 * years) + 50(ifmarried) + (noChildren * 30) + salary;
  public void setBonus() {
    if (postGrad == 0) {
      bonus = 0;
    } else if (postGrad == 1) {
      bonus = 50;
    } else {
      bonus = 100;
    }
    if (married) {
      this.bonus = ((10 * years) + 50 + (noChildren * 30) + bonus);
    } else {
      this.bonus = ((10 * years) + (noChildren * 30) + bonus);
    }
  }

  // Printing Employee
  public void printEmployee() {
    System.out.println("==============================");
    System.out.println("Ονοματεπώνυμο: " + name);
    System.out.println("Βαθμίδα Εκπαίδευσης: " + education);
    switch (postGrad) {
    case 0:
      System.out.println("Μεταπτυχιακές Σπουδές : δεν έχει");
      break;
    case 1:
      System.out.println("Μεταπτυχιακές Σπουδές : Μεταπτυχιακό δίπλωμα");
      break;
    case 2:
      System.out.println("Μεταπτυχιακές Σπουδές : Διδακτορικό δίπλωμα");
      break;
    default:
      break;
    }
    System.out.println("Έτη Υπηρεσίας: " + years);
    if (married) {
      System.out.println("Οικογενειακή Κατάσταση: Έγγαμος");
    } else {
      System.out.println("Οικογενειακή Κατάσταση: Άγγαμος");
    }
    System.out.println("Αριθμός Ανηλίκων Παιδιών: " + noChildren);
    System.out.println("Μισθός: " + salary + " euros");
    System.out.println("Μηνιαίο εισόδημα: " + (salary + bonus) + " euros");
    System.out.println("==============================");
  }

}