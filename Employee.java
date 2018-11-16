
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

  // Constructor
  public Employee(String fullName, String anEducation, int levelGrad, int noc, boolean ifMarried, int aNoChildren,
      int aSalary) {
    name = fullName;
    education = anEducation;
    if (anEducation == "ΥΕ" || anEducation == "ΠΕ" || anEducation == "ΔΕ") {
      this.education = anEducation;
    } else {
      throw new IllegalArgumentException("Η Βαθμίδα εκπαίδευσης θα πρέπει να είναι: ΥΕ, ΠΕ ή ΔΕ");
    }

    postGrad = levelGrad;
    if (levelGrad > 3 || levelGrad < 0) {
      throw new IllegalArgumentException("Παίρνει τιμές -> 0: δεν έχει, 1: Μεταπτυχιακό και 2: Διδακτορικό");
    } else {
      this.postGrad = levelGrad;
    }

    years = noc;
    married = ifMarried;
    noChildren = aNoChildren;
    salary = aSalary;
    bonus = 0;
  }

  // Getters

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the years
   */
  public int getYears() {
    return years;
  }

  /**
   * @return the bonus
   */
  public int getBonus() {
    return bonus;
  }

  /**
   * @param years the years to set
   */
  public void setYears(int years) {
    this.years = years;
  }

  public synchronized void increament() {
    years++;
  }

  /**
   * @param bonus the bonus to set
   */
  public void setBonus(int bonus) {
    if (postGrad == 0) {
      bonus = 0;
    } else if (postGrad == 1) {
      bonus = 50;
    } else {
      bonus = 100;
    }
    this.bonus = (salary + (10 * years) + 50 + (noChildren * 30) + bonus);
  }

  public void setPostGrad(int postGrad) {
    if (postGrad > 2 || postGrad < 0) {
      throw new IllegalArgumentException("PostGraduate Level must be between 0 and 3");
    } else {
      this.postGrad = postGrad;
    }
  }

  public void setName(String name) {
    this.name = name;
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

  // bonus = (10 * years) + 50 + (noChildren * 30) + amount;

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
      System.out.println("Μεταπτυχιακές Σπουδές : Μεταπτυχιακό");
      break;
    case 2:
      System.out.println("Μεταπτυχιακές Σπουδές : Διδακτορικό");
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
    if (bonus == 0) {
      System.out.println("Μηνιαίο εισόδημα: " + salary + " euros");
    } else {
      System.out.println("Bonus: " + bonus + " euros");
    }

    System.out.println("==============================");
  }

}