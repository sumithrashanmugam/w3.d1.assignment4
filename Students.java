package week3day1;

public class Students {
public void Studentsinfo() {
	
	System.out.println("Student info ");
}
public static void Studentsinfo(int id) {
	
	System.out.println("the  id is "+id);
}
public void Studentsinfo(int id1,String name) {
	
	System.out.println("the student id2 is"+id1);
	System.out.println("the student name1 is"+name);
}
public void Studentsinfo(String email,long phoneno) {
	
	System.out.println("the student emailid is "+email);
	System.out.println("the student phoneno is"+phoneno);
}
public static void main(String[] args) {
Students students =new Students();
students.Studentsinfo();
students.Studentsinfo(1234, "shree");
students.Studentsinfo("shree123@gmail.com", 123455639L);


}
}
