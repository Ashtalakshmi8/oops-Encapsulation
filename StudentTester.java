package com.xworkz.oops.Encapsulation;

public class StudentTester {

public static void main (String[]args) {
Student s =new Student();
s.setname ("Ashu");
String k=s.getname();

System.out.println(s);

s.setreg (1);
int d=s.getreg();
System.out.println(d);

s.setDiscipline (true);
boolean j=s.getDiscipline();
System.out.println(j);

s.setmarks (88);
int o=s.getmarks();
System.out.println(k);

s.setcolour ("white");
String i=s.getcolour();
System.out.println(i);


s.setawards(72);
int y=s.getawards();
System.out.println(y);

s.setgoal("  ");
String r=s.getgoal();
System.out.println(r);


s.setbrilliant('G');
char e=s.getbrilliant();
System.out.println(e);

s.setattitude(true);
boolean q=s.getattitude();
System.out.println(q);
System.out.println("End of the program");

}
}

