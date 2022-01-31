package com.xworkz.oops.Encapsulation;

public class AccountTesterr {
	public static void main (String[]args) {
		Account ash=new Account();
		ash.setname ("Ashta");
		String a=ash.getname();
		System.out.println(a);

		ash.settype ("saving");
		String h=ash.gettype();
		System.out.println(h);

		ash.setbalance (498874333d);
		double j=ash.getbalance();
		System.out.println(j);

		ash.setAccnum ("As1234");
		String k=ash.getAccnum();
		System.out.println(k);

		ash.setjoint (true);
		boolean i=ash.getjoint();
		System.out.println(i);

		ash.setifsc("rtrw12389");
		String l=ash.getifsc();
		System.out.println(l);

		ash.setnominee ("akshatha");
		String y=ash.getnominee();
		System.out.println(y);

		ash.setbranch("rtnagar");
		String r=ash.getbranch();
		System.out.println(r);


		ash.setbankname ("Dena");
		String e=ash.getbankname();
		System.out.println(e);

		ash.setlinks ("pan");
		String q=ash.getlinks();
		System.out.println(q);
		System.out.println("End of the program");

		}
		}

	