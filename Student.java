package com.xworkz.oops.Encapsulation;

public class Student {
	 private String name;
	 private int reg;
	 private boolean Discipline;
	 private int marks;
	 private String colour;
	 
	 private int awards;
	 private String goal;
	 private char brilliant;
	 private boolean attitude;
	 
	 public Student () {
		 
		 System.out.println("Default");
	 }
		public void setname (String name) {
		  this.name=name;
		  }
		public String getname () {
		return name;
		}
	  
		public void setreg (int reg) {
		  this.reg=reg;
		  }
		public int getreg () {
		return reg;
		}
	  
		public void setDiscipline (boolean Discipline) {
		  this.Discipline=Discipline;
		  }
		public boolean getDiscipline () {
		return Discipline;
	    }
		public void setmarks (int marks) {
		  this.marks=marks;
		  }
		public int getmarks () {
		return marks;
		}
		public void setcolour(String colour) {
		  this.colour=colour;
		}
		 public String getcolour() {
		return colour;
		}
		  
		  
		
		  
		 public void setawards(int awards) {
			  this.awards=awards;
		  }
			  public int getawards() {
		  return awards;
		}
		
		public void setgoal (String goal) {
		   this.goal= goal;
		}
		 public String getgoal () {
		 return  goal;
		}
				    
				  
		public void setbrilliant (char brilliant) {
		 this.brilliant=brilliant;
		 }
		 public char getbrilliant () {
		return brilliant;
		}
					    
					  
	    public void setattitude (boolean attitude) {
		this.attitude=attitude;
		 }
		 public boolean getattitude () {
		 return attitude;
		}
						    
						  
	 }

