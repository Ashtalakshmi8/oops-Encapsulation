package com.xworkz.oops.Encapsulation;

public class BagTester {
	public static void main (String[]args) {
Bag b=new Bag();
b.setcolour ("white");
String a=b.getcolour();
System.out.println(a);

b.setbrand ("Dell");
String h=b.getbrand();
System.out.println(h);

b.setprice (49887);
int j=b.getprice();
System.out.println(j);

b.setdiscount (true);
boolean k=b.getdiscount();
System.out.println(k);

b.setQuntity (4218);
int i=b.getQuntity();
System.out.println(i);

b.setQuality ('G');
char l=b.getQuality();
System.out.println(l);

b.setzips (72);
int y=b.getzips();
System.out.println(y);

b.setcompartment ('2');
char r=b.getcompartment();
System.out.println(r);


b.setweight (987);
int e=b.getweight();
System.out.println(e);

b.setwaterproof (true);
boolean q=b.getwaterproof();
System.out.println(q);
System.out.println("End of the program");

}
}
