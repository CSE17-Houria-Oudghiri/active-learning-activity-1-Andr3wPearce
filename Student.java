public class Student extends Person{
private int id;
private String major;

  //constructors
  public Student(){
    super();
    id=0; major="undeclared";
  }
  public Student(String name, String address, String phone, String email, int id, String major){
    super(name,address,phone,email);
    this.id=id;
    this.major=major;
  }
  
  //getters
  public int getID(){
    return id;
  }
  public String getMajor(){
    return major;
  }
  public void setID(int id){
    this.id=id;
  }
  public void setMajor(String major){
    this.major = major;
  }
  public String toString(){
    String s = String.format("ID: %d\nMajor: %s\n",id,major);
    return super.toString()+s;
  }
}