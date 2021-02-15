class Student{
  String name;
  int roll_no;
}

class Main{
  public static void main(String[] args){
    Student s = new Student();
    s.name = "Prasanth";
    s.roll_no = 25;
    System.out.println("Name is "+s.name+" and roll number is "+s.roll_no);
  }
}