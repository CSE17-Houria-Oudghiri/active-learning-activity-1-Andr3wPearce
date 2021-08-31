/**
 * Class to Extend the class person to include Employee variables
 * @author Andrew Pearce
 *@version 0.1
 *Date of creation: August 26, 2021
 *Date of last modification: August 31, 2021
 */
public class Employee extends Person{
   
    private int id;
    private String position;
    private double salary;

    //constructors
    /**
     * Default Constructor
     * @param none
     * Initializes id to Integer.MIN_VALUE as a placeholder, position to "unknown", and salary to 0.0. All other parameters are set to the string "none"
     * 
     */
    public Employee(){
        super();
        id=Integer.MIN_VALUE;
        position="unknown";
        salary=0.0;
    }

	/**
	 * Constructor with seven parameters
	 * @param name for the name of an Employee
	 * @param address for the address of an Employee
	 * @param phone for the phone number of an Employee
	 * @param email for the email address of an Employee
	 * @param id for the id of an Employee
	 * @param position for the position of an Employee
	 * @param salary for the salary of an Employee
	 */
	public Employee(String name, String address, String phone, String email, int id, String position, double salary) {
		super(name, address, phone, email);
		this.id = id;
		this.position = position;
		this.salary = salary;
	}

    //getters
    /**
     * Getter for employee id
     * @param none
     * @return employee id
     */
    public int getId(){
        return this.id;
    }
    /**
     * Getter for employee position
     * @return position
     * @param none
     */
    public String getPosition(){
        return position;
    }
    /**
     * Getter for Employee Salary
     * @return employee salary
     * @param none
     */
    public double getSalary(){
        return salary;
    }

    //setters
    /**
     * Setter for ID
     * @param id of Employee
     * @return nothing
     */
    public void setId(int id) {
        this.id=id;
    }
    /**
     * Setter for Position
     * @param position of Employee
     * @return nothing
     */
    public void setPosition(String position){
        this.position=position;
    }
    /**
     * Setter for Salary
     * @param salary of Employee
     * @return nothing
     */
    public void setSalary(double salary){
        this.salary=salary;
    }

    /**
     * Method to get Employee information
     * @return formatted string with information on Employee
     *@param none
     */
    public String toString(){
        String f = String.format("Id: %d\nPosition: %s\nAnnual Salary: $%f\n", id,position,salary);
        return super.toString()+f;
    }
}
