package Day13.Examples.bharath;

class Functions1 {
    public String getFullname(String fname, String mname, String lname){
        return fname+" "+mname+" "+lname+" ";
    }
}
public class Name{
        public static void main(String args[]){
            Functions1 a=new Functions1();
            String Fullname=a.getFullname("bharath","simha","reddy");
            System.out.println(Fullname);
        }
}
