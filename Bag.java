package com.xworkz.oops.Encapsulation;

public class Bag {
 private String colour;
 private String brand;
 private int price;
 private boolean discount;
 private int Quntity;
 private char Quality;
 private int zips;
 private char compartment;
 private int weight;
 private boolean waterproof;
 
 public Bag () {
	 
	 System.out.println("Default");
 }
  public void setcolour (String colour) {
	  this.colour=colour;
	  }
  public String getcolour () {
  return colour;
  }
  
  public void setbrand (String brand) {
	  this.brand=brand;
	  }
  public String getbrand () {
  return brand;
  }
  
  public void setprice (int price) {
	  this.price=price;
	  }
  public int getprice () {
  return price;
    }
  public void setdiscount (boolean discount) {
	  this.discount=discount;
	  }
  public boolean getdiscount () {
  return discount;
}
  public void setQuntity (int Quntity) {
	  this.Quntity=Quntity;
  }
	  public int getQuntity () {
  return Quntity;
}
	  
	  
	  public void setQuality (char Quality) {
		  this.Quality=Quality;
	  }
		  public char getQuality () {
	  return Quality;
		  }
	  
	  public void setzips (int zips) {
		  this.zips=zips;
	  }
		  public int getzips () {
	  return zips;
	}
		  
		  
		  public void setcompartment (char compartment) {
			  this. compartment= compartment;
		  }
			  public char getcompartment () {
		  return  compartment;
		}
			    
			  
			  public void setweight (int weight) {
				  this.weight=weight;
			  }
				  public int getweight () {
			  return weight;
			}
				    
				  
				  
				  public void setwaterproof (boolean waterproof) {
					  this.waterproof=waterproof;
				  }
					  public boolean getwaterproof () {
				  return waterproof;
				}
					    
					  
 }

