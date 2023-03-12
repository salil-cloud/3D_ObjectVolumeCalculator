import java.util.Scanner; //Scanner package for User Input

class test_volumeCalculator { // Class to Calculate Volume
	private double length;
	private double breadth;
	private double height;
	private double radius;

	test_volumeCalculator() { // Non parameterised Constructor
		length = 0;
		breadth = 0;
		height = 0;
		radius = 0;
	}

	test_volumeCalculator(double l) { // Parameterised Constructor for Cube
		length = l;
	}

	test_volumeCalculator(double l, double b, double h) { // Parameterised Constructor for cuboid
		length = l;
		breadth = b;
		height = h;
	}

	test_volumeCalculator(double r, double h) { // Parameterised Constructor for Cylinder
		radius = r;
		height = h;
	}

	public void setLength(double l) { // Setter Method For Length
		if (l > 0)
			length = l;
		else
			length = 0;
	}

	public void setBreadth(double b) { // Setter Method for Breadth
		if (b > 0)
			breadth = b;
		else
			breadth = 0;
	}

	public void setHeight(double h) { // Setter Method for Height
		if (h > 0)
			height = h;
		else
			height = 0;
	}

	public void setRadius(double r) { // Setter Method for Radius
		if (r > 0)
			radius = r;
		else
			radius = 0;
	}

	public double getLength() { // Getter Method to get/access Length
		return length;
	}

	public double getBreadth() { // Getter Method to get/access Breadth
		return breadth;
	}

	public double getHeight() { // Getter Method to get/access Height
		return height;
	}

	public double getRadius() { // Getter Method to get/access Radius
		return radius;
	}

	public double CubeVolume() { // Method to Calculate Cube Volume
		return length * length * length;
	}

	public double CuboidVolume() { // Method to calculate Cuboid volume
		return length * breadth * height;
	}

	public double CylinderVolume() { // Method to calculate Cylinder volume
		return (3.14 * ((radius * radius) * height));
	}

	public boolean IsCube() { // Method to Find out if Cuboid is also a cube with resp. to its dimensions
		if (getLength() == getBreadth() && getBreadth() == getHeight())
			return true; // If Cuboid is also cube then it will return boolean value (true)
		else
			return false;
	}
}

class volumeCalculator { // Main Class
	public static void main(String args[]) { // Main Method
		try (Scanner s = new Scanner(System.in)) { // Scanner Object within try block, try block is used to enclose the
													// code that might throw an exception. It must be used within the
													// method.
			int op = 0; // int op is used to store operation selection input by the user in do{}
						// block,(User will decide on which 3D object he/she might want to run the
						// operations)
			int c = 0; // int c is used to store the continue or stop program user input after one
						// successful cycle
			double Length = 0;
			double Breadth = 0;
			double Height = 0;
			double Radius = 0;
			do { // Menu based interface using doWhile loop
				System.out.println("You want volume of which 3D object :");
				System.out.println("1-Cube");
				System.out.println("2-Cuboid");
				System.out.println("3-Cylinder");
				op = s.nextInt(); // storing user input in op using Scanner class
				switch (op) { // Initialising Switch Case for seperate 3D objects
					case 1: {
						int again = 0;
						System.out.println("Enter the Length :");
						Length = s.nextDouble();
						test_volumeCalculator cube = new test_volumeCalculator(Length); // Creating Object of class
																						// volumeCalculator with
																						// reference named cube
						// Parameterised Constructor is utilised
						System.out.println("Volume of Cube:" + cube.CubeVolume());
						System.out.println("Do you want to change the data and again Calculate the Volume:Y==1/N==0");

						again = s.nextInt(); // Storing the user input in again int var
						if (again == 1) {
							System.out.println("Enter the new Length :");
							Length = s.nextDouble();
							cube.setLength(Length); // Calling setLength method to update the length
							System.out.println("Volume of Cube:" + cube.CubeVolume());
						}
						System.out.println("Do you want to continue:(Y==1/N==0)");
						c = s.nextInt();
						break;
					}
					case 2: {
						int again = 0;
						boolean val;
						System.out.println("Enter the Length:");
						Length = s.nextDouble();

						System.out.println("Enter the Breadth:");
						Breadth = s.nextDouble();

						System.out.println("Enter the Height:");
						Height = s.nextDouble();

						test_volumeCalculator cuboid = new test_volumeCalculator(Length, Breadth, Height);
						System.out.println("Volume of Cuboid:" + cuboid.CuboidVolume());

						val = cuboid.IsCube();
						System.out.println("Is your cuboid also a cube:" + val);

						System.out.println("Do you want to change the data and again Calculate the Volume:Y==1/N==0");
						again = s.nextInt();
						if (again == 1) {
							System.out.println("Enter the new Length:");
							Length = s.nextDouble();

							System.out.println("Enter the new Breadth:");
							Breadth = s.nextDouble();

							System.out.println("Enter the new Height:");
							Height = s.nextDouble();

							cuboid.setLength(Length);
							cuboid.setBreadth(Breadth);
							cuboid.setHeight(Height);

							System.out.println("Volume of Cuboid:" + cuboid.CuboidVolume());

							val = cuboid.IsCube();
							System.out.println("Is your cuboid also a cube: " + val);
						}
						System.out.println("Do you want to continue:(Y==1/N==0)");
						c = s.nextInt();
						break;
					}
					case 3: {
						int again = 0;
						System.out.println("Enter the Radius:");
						Radius = s.nextDouble();

						System.out.println("Enter the Height:");
						Height = s.nextDouble();
						test_volumeCalculator cylinder = new test_volumeCalculator(Radius, Height);
						System.out.println("Volume of Cylinder:" + cylinder.CylinderVolume());

						System.out.println("Do you want to change the data and again Calculate the Volume:Y==1/N==0");
						again = s.nextInt();
						if (again == 1) {
							System.out.println("Enter the new Radius:");
							Radius = s.nextDouble();

							System.out.println("Enter the new Height:");
							Height = s.nextDouble();

							cylinder.setRadius(Radius);
							cylinder.setHeight(Height);

							System.out.println("Volume of Cylinder: " + cylinder.CylinderVolume());
						}
						System.out.println("Do you want to continue:(Y==1/N==0)");
						c = s.nextInt();
						break;
					}
					default: {
						System.out.println("Enter Valid Input");
						System.out.println("Do you want to continue:(Y==1/N==0)");
						c = s.nextInt();
						break;
					}
				}
			} while (c == 1); // if the user input is 1 then the loop will iterate again
		}
	}
}
