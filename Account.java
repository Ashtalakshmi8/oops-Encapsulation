package com.xworkz.oops.Encapsulation;

public class Account {
		 private String name;
		 private String type;
		 private double balance;
		 private String Accnum;
		 private boolean joint;
		 private String ifsc;
		 private String nominee;
		 private String branch;
		 private String bankname;
		 private String links;
		 
		 Account  () {
			 
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
			return branch;
			}
		  
			public void setbalance (double balance) {
			  this.balance=balance;
			  }
			public double getbalance () {
			return balance;
		    }
			public void setAccnum (String Accnum) {
			  this.Accnum=Accnum;
			  }
			public String getAccnum () {
			return Accnum;
			}
			public void setjoint(boolean joint) {
			  this.joint=joint;
			}
			 public boolean getjoint() {
			return joint;
			}
			  
			  
			public void setifsc(String ifsc) {
				  this.ifsc=ifsc;
			  }
			public String getifsc() {
			  return ifsc;
			}
			  
			 public void setnominee(String nominee) {
				  this.nominee=nominee;
			  }
				  public String getnominee() {
			  return nominee;
			}
			
			public void setbranch (String branch) {
			   this.branch= branch;
			}
			 public String getbranch () {
			 return  branch;
			}
					    
					  
			public void setbankname (String bankname) {
			 this.bankname=bankname;
			 }
			 public String getbankname () {
			return bankname;
			}
						    
						  
		    public void setlinks(String links) {
			this.links=links;
			 }
			 public String getlinks() {
			 return links;
			}
							    
							  
		 }
