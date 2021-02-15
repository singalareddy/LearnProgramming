 public class Employee {​​​​​​​
  int id;
  String name;
 
  void assignFields(int id, String name){​​​​​​​
 
  id=id;
  name=name;
 
  }​​​​​​​
 
  public static void main(String[] args) {​​​​​​​
    Employee e1 = new Employee();
    e1.id=1;
    e1.name="john";
    System.out.println(e1.id);
    System.out.println(e1.name);
   
    Employee e2 = new Employee();
    e2.assignFields(2,"abraham");
    System.out.println(e2.id);
    System.out.println(e2.name);
  
    }​​​​​​​
}​​​​​​​
