public class Employee extends Person{
    //instance vars
    private int id;
    private String position;
    private double salary;

    //constructors
    public Employee(){
        super();
        id=Integer.MIN_VALUE;
        position="unknown";
        salary=0.0;
    }
    public Employee(String name, String address, String phone, String email, int id, String position, double salary){
        super(name,address,phone,email);
        this.id=id;
        this.position=position;
        this.salary=salary;
    }

    //getters
    public int getId(){
        return this.id;
    }
    public String getPosition(){
        return position;
    }
    public double getSalary(){
        return salary;
    }

    //setters
    public void setId(int id) {
        this.id=id;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public String toString(){
        String f = String.format("Id: %d\nPosition: %s\nAnnual Salary: $%f\n", id,position,salary);
        return super.toString()+f;
    }
}
