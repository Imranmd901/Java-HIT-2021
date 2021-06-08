import java.util.Scanner;

 class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Rectangale:");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width = scanner.nextDouble();
		double area = length*width;
		System.out.println("Area Of Rectangle is:"+area);
		

	}

}
