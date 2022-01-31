package com.xworkz.oops.Encapsulation;

public class TransformerTester {

public static void main (String[]args) {
Transformer s =new Transformer();
s.setname ("elctromagnetic");
String k=s.getname();
System.out.println(s);

s.setwinding (2);
int j=s.getwinding();
System.out.println(j);

s.setcore ("elctromagnetic");
String d=s.getcore();
System.out.println(d);

s.setcoils (2);
int i=s.getcoils();
System.out.println(i);

s.setcolour ("gold");
String l=s.getcolour();
System.out.println(l);

s.setefficiency(72);
int y=s.getefficiency();
System.out.println(y);

s.setspeed(1200);
int r=s.getspeed();
System.out.println(r);

s.settype("auto");
String e=s.gettype();
System.out.println(e);

s.setvoltage(250);
int q=s.getvoltage();
System.out.println(q);

s.setcurrent(5);
int w=s.getcurrent();
System.out.println(w);


System.out.println("End of the program");
}
}


