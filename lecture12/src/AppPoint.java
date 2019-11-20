class Point {
	static int x;
	int y;
	
	public Point(){
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y; 
	}
	
	public String toString(){
		return "x: " + this.x + "y: " + this.y; 
	}
}

public class AppPoint {

	public static void main(String[] args) {
		Point startPoint = new Point(); 
		startPoint.x = 0; 
		startPoint.y = 0; 
		
		
		System.out.println(startPoint);
		System.out.println(startPoint.toString()); 
		
		Point endPoint = new Point(10, 10); 
		System.out.println(endPoint); 
		
		int middleX = (startPoint.x + endPoint.x)/2; 
		int middley = (startPoint.y + endPoint.y)/2;

	}

}
