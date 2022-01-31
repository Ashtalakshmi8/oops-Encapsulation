package com.xworkz.oops.Encapsulation;

public class CpuTesterrr {
	public static void main (String[]args) {
		Cpu h=new Cpu();
		h.setname ("Dell");
		String a=h.getname();
		System.out.println(a);

		h.settype ("processor");
		String t=h.gettype();
		System.out.println(t);

		h.setram (8);
		int j=h.getram();
		System.out.println(j);

		h.setgpu (2);
		int k=h.getgpu();
		System.out.println(k);

		h.setcd (120);
		int i=h.getcd();
		System.out.println(i);

		h.setmotherboard("intel");
		String l=h.getmotherboard();
		System.out.println(l);

		h.setcmos (1);
		int y=h.getcmos();
		System.out.println(y);

		h.setharddisc(500);
		int r=h.getharddisc();
		System.out.println(r);


		h.setpowersupply (250);
		int e=h.getpowersupply();
		System.out.println(e);

		h.setwarranty (3);
		int q=h.getwarranty();
		System.out.println(q);
		System.out.println("End of the program");

		}
		

}
