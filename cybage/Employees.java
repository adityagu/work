package cybage;

import java.util.Scanner;

public class Employees {
	
	private int eid;
	private String ename;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public static void main(String[] args) {
		Employees e[]= new Employees[3];
		
		e[0]= new Employees(100, "a");
		e[1]= new Employees(200,"b");
		e[2]= new Employees(300,"c");
		
		for(int i=0;i<3;i++){
			System.out.println("Employee " + i +" has eid " + e[i].eid +  " name " + e[i].ename);
		} 
	}

}
