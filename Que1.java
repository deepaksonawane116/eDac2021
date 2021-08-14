package LabExam;

public class Que1 {

	double radius;
	
	public Que1(double r) {
		
		radius=r;
		
	}
	
	
	 double sArea() {
		
		double area=4*Math.PI*radius*radius;
		return area;
	}
	
	double volume() {
		
		double volume=(4/3)*Math.PI*radius*radius*radius;
		return volume;
	}

}
