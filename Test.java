

/**
 * Tester class for the files used in ALA 1
 * @author Andrew Pearce
 * @version 0.1
 *Date of creation: August 26, 2021
 *Date of last modification: August 31, 2021
 */
public class Test{

/**
 * Main method to create instances of each class related to the Person class and test the sortArray method
 */
public static void main(String args[]){
  Person[] people = new Person[4];
  people[0] = new Person("Helen Brown",
                          "222 10th Street Bethlehem",
                          "610-334-2288",
                          "hbrown@gmail.com");
  people[1] = new Student("Paul Leister",
                          "972 4th Street Allentown",
                          "610-331-7177",
                          "gleister@gmail.com",
                          12345,
                          "CSE");
  people[2] = new Employee("Beth Down",
                            "234 Main Street Philadelphia",
                            "484-222-4433",
                            "bdown@gmail.com",
                            33442,
                            "Systems Administrator",
                            75000.00);
  people[3] = new Faculty("Mark Jones",
                          "21 Orchid Street Bethlehem",
                          "610-333-2211",
                          "mjones@gmail.com",
                          22222,
                          "Faculty",
                          90000.00,
                          "Associate Professor");
  printArray(people);
  sortArray(people);
  printArray(people);
  }
  
  /**
   * Prints to the terminal the persons in an array
 * @param list of objects Person to be printed
 * @return none
 */
public static void printArray(Person[] list){
    for(int i=0; i<list.length; i++){
      System.out.println(list[i].toString());
    }
  }
    /**
     * Sorts through the array by first letter in the persons name
     * @param list of Person objects to sort through
     * @return none
     */
    public static void sortArray(Person[] list){
      for(int i=0; i<list.length; i++){
        int minIndex = i;
    for(int j=i+1; j<list.length; j++)
      if(list[j].getName().compareTo(list[minIndex].getName()) <0)
        minIndex=j;
        Person temp = list[i];
      list[i] = list[minIndex];
      list[minIndex] = temp;
    }
  }
}