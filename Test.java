import java.util.*;
public class Test{
	public static void main(String[] args){
		Cost c = new Cost("530","Audi",530000);
		c.costInfo();
		c.vehicleInfo();
		c.brandInfo();
	}
	static class Vehicle{
		String vname;
		Vehicle(String vname){
			this.vname=vname;
		}	
		void vehicleInfo(){
			System.out.println(vname);
		}
	}
	static class Brand extends Vehicle{
		String bname;
		Brand(String vname,String bname){
			super(vname);
			this.bname=bname;
		}
		void brandInfo(){
			System.out.println(bname);
		}
	}
	static class Cost extends Brand{
		int cost;
		Cost(String vname,String bname,int cost){
			super(vname,bname);
			this.cost=cost;
		}
		void costInfo(){
			System.out.println(cost);
		}
	}
}