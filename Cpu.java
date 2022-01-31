package com.xworkz.oops.Encapsulation;

public class Cpu {
		 private String name;
		 private String type;
		 private int ram;
		 private int gpu;
		 private int cd;
		 private String motherboard;
		 private int cmos;
		 private int harddisc;
		 private int powersupply;
		 private int warranty;
		 
		 Cpu () {
			 
			 System.out.println("Default");
		 }
			public void setname (String name) {
			  this.name=name;
			  }
			public String getname () {
			return name;
			}
		  
			public void settype (String type) {
			  this.type=type;
			  }
			public String gettype () {
			return type;
			}
		  
			public void setram (int ram) {
			  this.ram=ram;
			  }
			public int getram () {
			return ram;
		    }
			public void setgpu(int gpu) {
			  this.gpu=gpu;
			  }
			public int getgpu() {
			return gpu;
			}
			public void setcd(int cd) {
			  this.cd=cd;
			}
			 public int getcd() {
			return cd;
			}
			  
			  
			public void setmotherboard(String motherboard) {
				  this.motherboard=motherboard;
			  }
			public String getmotherboard() {
			  return motherboard;
			}
			  
			 public void setcmos(int cmos) {
				  this.cmos=cmos;
			  }
				  public int getcmos() {
			  return cmos;
			}
			
			public void setharddisc (int harddisc) {
			   this.harddisc= harddisc;
			}
			 public int getharddisc () {
			 return  harddisc;
			}
					    
					  
			public void setpowersupply (int powersupply) {
			 this.powersupply=powersupply;
			 }
			 public int getpowersupply () {
			return powersupply;
			}
						    
						  
		    public void setwarranty(int warranty) {
			this.warranty=warranty;
			 }
			 public int getwarranty() {
			 return warranty;
			}
							    
							  
		 }
