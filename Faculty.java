

/**
 * Class to Extend the class Employee to include Faculty variables
 * @author Andrew Pearce
 * @version 0.1
 *Date of creation: August 26, 2021
 *Date of last modification: August 31, 2021
 */
public class Faculty extends Employee{
    private String rank;
    
    
    /**
     * Faculty constructor with no parameters
     * @param none
     * @return object faculty with all instance variables set to "none" 
     */
    public Faculty(){
        super();
        this.rank="unknown";
    }
    /**
	 * Constructor with eight parameters
	 * @param name for the name of a faculty member
	 * @param address for the address of a faculty member
	 * @param phone for the phone number of a faculty member
	 * @param email for the email address of a faculty member
	 * @param id for the id of a faculty member
	 * @param position for the position of a faculty member
	 * @param salary for the salary of a faculty member
     * @param rank for the rank of faculty member
     * @return faculty object
     */
    public Faculty(String name, String address, String phone, String email, int id, String position, double salary,
            String rank) {
                super(name, address, phone, email, id, position, salary);
                this.rank=rank;
    }

    /**
     * @param none
     * @return the value of the data member rank
     */
    public String getRank(){
        return rank;
    }
    /**
     * @param rank rank to set data member rank to
     */
    public void setRank(String rank){
        this.rank=rank;
    }

    /**
     * @param none
     * @return formatted string of all parts of the person's information
     */
    public String toString(){
        String f = String.format("Rank: %s\n", rank);
        return super.toString()+f;
    }
}
