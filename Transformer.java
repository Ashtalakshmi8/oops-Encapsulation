package com.xworkz.oops.Encapsulation;

public class Transformer {
		 private String name;
		 private int winding;
		 private String core;
		 private int coils;
		 private String colour;
		 private int efficiency;
		 private int speed;
		 private String type;
		 private int voltage;
		 private int current;
		 
		 public Transformer () {
			 
			 System.out.println("Default");
		 }
			public void setname (String name) {
			  this.name=name;
			  }
			public String getname () {
			return name;
			}
		  
			public void setwinding (int winding) {
			  this.winding=winding;
			  }
			public int getwinding () {
			return winding;
			}
		  
			public void setcore (String core) {
			  this.core=core;
			  }
			public String getcore () {
			return core;
		    }
			public void setcoils (int coils) {
			  this.coils=coils;
			  }
			public int getcoils () {
			return coils;
			}
			public void setcolour(String colour) {
			  this.colour=colour;
			}
			 public String getcolour() {
			return colour;
			}
			  
			  
			public void setefficiency(int efficiency) {
				  this.efficiency=efficiency;
			  }
			public int getefficiency() {
			  return efficiency;
			}
			  
			 public void setspeed(int speed) {
				  this.speed=speed;
			  }
				  public int getspeed() {
			  return speed;
			}
			
			public void settype (String type) {
			   this.type= type;
			}
			 public String gettype () {
			 return  type;
			}
					    
					  
			public void setvoltage (int voltage) {
			 this.voltage=voltage;
			 }
			 public int getvoltage () {
			return voltage;
			}
						    
						  
		    public void setcurrent(int current) {
			this.current=current;
			 }
			 public int getcurrent() {
			 return current;
			}
}
