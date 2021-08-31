/**
 * Class to Extend the class person to include Student variables
 * @author Andrew Pearce
 *@version 0.1
 * Date of creation: August 26, 2021
 * Date of last modification: August 31, 2021
 */
public class Student extends Person{
private int id;
private String major;

  //constructors
  /**
 * Default constructor
 * Initializes id as 0 and major as "undeclared"
 * @param none
 * 
 */
public Student(){
    super();
    id=0; major="undeclared";
  }
/**
 * Constructor with six parameters
 * @param name for the name of a student
 * @param address for the address of a student
 * @param phone for the phone number of a student
 * @param email for the email address of a student
 * @param id for the id of a student
 * @param major for the students major
 */
public Student(String name, String address, String phone, String email, int id, String major){
    super(name,address,phone,email);
    this.id=id;
    this.major=major;
  }
  
  //getters
  /**
   * Getter for student's id
 * @return the value of the data member id
 * @param none
 */
public int getID(){
    return id;
  }
/**
 * Getter for student's major
* @return the value of the data member major
* @param none
*/
public String getMajor(){
    return major;
  }

  /**
   * Setter for the student's id
 * @param id
 * @return none
 */
public void setID(int id){
    this.id=id;
  }
/**
 * Setter for the student's major
* @param major
* @return none
*/
  public void setMajor(String major){
    this.major = major;
  }
  /**
   * Creates formatted string with the information in the class
 * @return String with all information
 * @param none
 */
public String toString(){
    String s = String.format("ID: %d\nMajor: %s\n",id,major);
    return super.toString()+s;
  }
}