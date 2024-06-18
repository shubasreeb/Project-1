class StudentData{
int Id;
int Mark;
String Name;

static String Course = "Java";

public static void main(String args[]){
StudentData s1 = new StudentData();
StudentData s2 = new StudentData();
s1.Id = 101;
s1.Mark = 95;
s1.Name ="Anumol";

s2.Id= 102;
s2.Mark = 90;
s2.Name= "Shubasree";

s1.display();
s2.display();

}

public void display(){

System.out.println(Id);
System.out.println(Mark);
System.out.println(Name);
System.out.println(Course);
}
}
