

public class Test{

public static void main(String args[]){
  Person[] people = new Person[4];
  people[0] = new Person("Helen Brown",
                          "222 10th Street Bethlehem",
                          "610-334-2288",
                          "hbrown@gmail.com");
  people[1] = new Student();
  printArray(people);
  sortArray(people);
  printArray(people);
  }
  
  public static void printArray(Person[] list){
    for(int i=0; i<list.length; i++){
      System.out.println(list[i].toString());
    }
    public static void sortArray(Person[] list){
      for(int i=0; i<list.length; i++){
        int minIndex = i;
    for(int j=i+1; j<list.length; j++)
      if(list[j].getName().compareto(list[minIndex].getName) <0)
        minIndex=j;
        Person temp = list[i];
      list[i] = list[minIndex];
      list[minIndex] = temp;
    }
  }
}