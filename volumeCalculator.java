import java.util.Scanner;

class test_volumeCalculator {
	private double length;
	private double breadth;
	private double height;
	private double radius;

	test_volumeCalculator() {
		length = 0;
		breadth = 0;
		height = 0;
		radius = 0;
	}

	test_volumeCalculator(double l) {
		length = l;
	}

	test_volumeCalculator(double l, double b, double h) {
		length = l;
		breadth = b;
		height = h;
	}

	test_volumeCalculator(double r, double h) {
		radius = r;
		height = h;
	}

	public void setLength(double l) {
		if (l > 0)
			length = l;
		else
			length = 0;
	}

	public void setBreadth(double b) {
		if (b > 0)
			breadth = b;
		else
			breadth = 0;
	}

	public void setHeight(double h) {
		if (h > 0)
			height = h;
		else
			height = 0;
	}

	public void setRadius(double r) {
		if (r > 0)
			radius = r;
		else
			radius = 0;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return radius;
	}

	public double CubeVolume() {
		return length * length * length;
	}

	public double CuboidVolume() {
		return length * breadth * height;
	}

	public double CylinderVolume() {
		return (3.14 * ((radius * radius) * height));
	}

	public boolean IsCube() {
		if (getLength() == getBreadth() && getBreadth() == getHeight())
			return true;
		else
			return false;
	}
}

class volumeCalculator {
	public static void main(String args[]) {
		try (Scanner s = new Scanner(System.in)) {
            int op = 0;
            int c = 0;
            double Length = 0;
            double Breadth = 0;
            double Height = 0;
            double Radius = 0;
            do {
            	System.out.println("You want volume of which 3D object :");
            	System.out.println("1-Cube");
            	System.out.println("2-Cuboid");
            	System.out.println("3-Cylinder");
            	op = s.nextInt();
            	switch (op) {
            		case 1: {
            			int again = 0;
            			System.out.println("Enter the Length :");
            			Length = s.nextDouble();
            			test_volumeCalculator cube = new test_volumeCalculator(Length);

            			System.out.println("Volume of Cube:" + cube.CubeVolume());
            			System.out.println("Do you want to change the data and again Calculate the Volume:Y==1/N==0");
            			again = s.nextInt();
            			if (again == 1) {
            				System.out.println("Enter the new Length :");
            				Length = s.nextDouble();
            				cube.setLength(Length);
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
            } while (c == 1);
        }
	}
}
