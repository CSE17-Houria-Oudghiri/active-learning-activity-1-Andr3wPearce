

public class Person{
  //instance vars
  protected String name;
  protected String address;
  protected String phone;
  protected String email;
  
  //constructors
  public Person(){
    name=address=phone=email="none";
    
  }
  
  public Person(String name, String address, String phone, String email){
    this.name=name;
    this.address=address;
    this.phone=phone;
    this.email=email;
  }
  
  //getters
  public String getName(){
    return name;
  }
  public String getAddress(){
    return address;
  }
  public String getPhone(){
    return phone;
  }
  public String getEmail(){
    return email;
  }
  
  //setters
  public void setName(String n){
    name=n;
  }
  public void setAddress(String a){
    address=a;
  }
  public void setPhone(String p){
    phone=p;
  }
  public void setEmail(String e){
    email=e;
  }
  
  public String toString(){
    String s;
    s= String.format("Name : %s\nAddress: %s\nPhone: %s\nEmail: %s\n",
    name, address, phone, email);
    return s;
  }
  
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