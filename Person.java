

/**
 * Class to Extend the class Employee to include Faculty variables
 * @author Andrew Pearce
 * @version 0.1
 *Date of creation: August 26, 2021
 *Date of last modification: August 31, 2021
 */
public class Person{
  //instance vars
  protected String name;
  protected String address;
  protected String phone;
  protected String email;
  
  //constructors
  /**
   * Default constructor, sets all instance variables to "none"
   * @param none
 * @return person object with all variables set to "none"
 */
public Person(){
    name=address=phone=email="none";
    
  }
  
  /**
   * Constructor for the person class
 * @param name for the name of the person
 * @param address for the address of the person
 * @param phone for the phone number of the person
 * @param email for the email address of the person
 */
public Person(String name, String address, String phone, String email){
    this.name=name;
    this.address=address;
    this.phone=phone;
    this.email=email;
  }
  
  //getters
  /**
   * Getter for the data member name
   * @param none
 * @return the value of the data member name
 */
public String getName(){
    return name;
  }
/**
 * Getter for the data member address
 * @param none
* @return the value of the data member address
*/
  public String getAddress(){
    return address;
  }
  /**
   * Getter for the data member phone
   * @param none
 * @return the value of the data member phone
 */
  public String getPhone(){
    return phone;
  }
  /**
   * Getter for the data member email
   * @param none
 * @return the value of the data member email
 */
  public String getEmail(){
    return email;
  }
  
  //setters
  /**
   * Setter for the data member name
 * @param name to be the new value
 * @return none
 */
public void setName(String n){
    name=n;
  }
/**
 * Setter for the data member address
* @param address to be the new value
* @return none
*/
  public void setAddress(String a){
    address=a;
  }
  /**
   * Setter for the data member phone
  * @param phone to be the new value
  * @return none
  */
  public void setPhone(String p){
    phone=p;
  }
  /**
   * Setter for the data member email
  * @param email to be the new value
  * @return none
  */
  public void setEmail(String e){
    email=e;
  }
  
  /**
 *Method to produce Person information
 *@return formatted string with person information
 *@param none
 */
public String toString(){
    String s;
    s= String.format("Name : %s\nAddress: %s\nPhone: %s\nEmail: %s\n",
    name, address, phone, email);
    return s;
  }
  
  /**
   * Method to compare two person objects
 * @param object to be compared with
 * @return true if the objects are the same
 */
@Override
  
  public boolean equals(Object obj){
    if(obj instanceof Person){
    Person p = (Person) obj;//downcasting
    return p.name.equals(this.name);
    }
    else{
      return false;
    }
  }
}