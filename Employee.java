import java.time.Year;

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
  private int masterStudies;
  private boolean married;
  private int years;
  private int childrens;
  private int salary;
  private int bonus;

  /**
   * Create a constructor with name - String - name and surname,
   * 
   * educationLevel - String ("YE", "DE" or "ME"),
   * 
   * masterStudies - int (0,1 or 2 where 0 = No, 1=Master, 2=PhD),
   * 
   * married - boolean true = yes , false = no,
   * 
   * years - int (years of service = yos),
   * 
   * childrens - int (number of underage childrens = noc),
   * 
   * salary - int (sal),
   * 
   * bonus - int (initial value = 0),
   */

  public Employee(String aName, String anEducation, int studiesType, boolean ifMarried, int yos, int noc, int sal) {

    name = aName; // String
    education = anEducation; // String
    masterStudies = studiesType; // int
    married = ifMarried; // boolean
    years = yos; // int
    childrens = noc; // int
    salary = sal; // int
    bonus = 0; // int

  }

  public void ifMarried() {
    if (married == true) {
      System.out.println("Έγγαμος/η");
    } else {
      System.out.println("Άγγαμος/η");
    }
  }

  // Seting up the getters-accessors
  public Sting getName() {
    return name;
  }

  public Sting getEducation() {
    return education;
  }

  public int getStudies() {
    return masterStudies;
  }

  public boolean getMarried() {
    return married;
  }

  public int getYears() {
    return years;
  }

  public int getChildrens() {
    return childrens;
  }

  public int getSalary() {
    return salary;
  }

  public int getBonus() {
    return bonus;
  }

  // Setting up the setters-mutators
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param education the education to set
   */
  public void setEducation(String education) {
    this.education = education;
  }

  /**
   * @param masterStudies the masterStudies to set
   */
  public void setMasterStudies(int masterStudies) {
    this.masterStudies = masterStudies;
  }

  /**
   * @param married the married to set
   */
  public void setMarried(boolean married) {
    this.married = married;
  }

  /**
   * @param years the years to set
   */
  public void setYears(int years) {
    this.years = years;
  }

  /**
   * @param childrens the childrens to set
   */
  public void setChildrens(int childrens) {
    if (this.childrens >= 0) {
      this.childrens = childrens;
    } else {
      System.out.println("*** Λάθος δεν επιτρέπεται αρνητικός αριθμός παιδιών");
    }
  }

  /**
   * @param salary the salary to set
   */
  public void setSalary(int salary) {
    this.salary = salary;
  }

  /**
   * @param bonus the bonus to set
   */
  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

}