package com.Collection_frameWork.Set.Hashset;

public class Emp {
	String name;
	int id;
	
	
	
	public Emp(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	
	@Override
	public String toString() {
		return "name= "+name+" "+"id= "+id;
	}
	@Override
	public boolean equals(Object o) {
		Emp e= (Emp)o;
		return this.name.equals(e.name)&&this.id==e.id;
		
	}
	@Override
	public int hashCode() {
		return id;
	}

}
