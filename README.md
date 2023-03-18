# 3D_ObjectVolumeCalculator

Documentation of the Java program "volumeCalculator":

This program calculates the volume of different 3D objects such as a cube, cuboid, and cylinder. It uses the "test_volumeCalculator" class to define objects with properties like length, breadth, height, and radius. It also defines methods to calculate the volume of different objects and check if an object is a cube or not.

The "volumeCalculator" class is the main class of the program. It has a "main" method that contains the code to interact with the user, read input values, create objects, and call methods to calculate the volume of different 3D objects.

Classes:

test_volumeCalculator: Defines objects with properties like length, breadth, height, and radius. It also defines methods to calculate the volume of different objects and check if an object is a cube or not.


volumeCalculator: The main class of the program that interacts with the user, reads input values, creates objects, and calls methods to calculate the volume of different 3D objects.


Variables:

length: The length of an object.

breadth: The breadth of an object.

height: The height of an object.

radius: The radius of an object.

op: The option selected by the user to calculate the volume of an object.

c: The option selected by the user to continue or exit the program.

Length: The input value for the length of an object.

Breadth: The input value for the breadth of an object.

Height: The input value for the height of an object.

Radius: The input value for the radius of an object.

again: The option selected by the user to change the input values and recalculate the volume of an object.

val: The boolean value to check if an object is a cube or not.
Methods:

test_volumeCalculator(): Constructor method that initializes the object's properties to 0.

test_volumeCalculator(double l): Constructor method that initializes the object's length to l and other properties to 0.

test_volumeCalculator(double r, double h): Constructor method that initializes the object's radius to r, height to h, and other properties to 0.

test_volumeCalculator(double l, double b, double h): Constructor method that initializes the object's length to l, breadth to b, height to h, and radius to 0.

setLength(double l): Setter method to set the length of an object.

setBreadth(double b): Setter method to set the breadth of an object.

setHeight(double h): Setter method to set the height of an object.

setRadius(double r): Setter method to set the radius of an object.

getLength(): Getter method to get the length of an object.

getBreadth(): Getter method to get the breadth of an object.

getHeight(): Getter method to get the height of an object.

getRadius(): Getter method to get the radius of an object.

CubeVolume(): Method to calculate the volume of a cube.

CuboidVolume(): Method to calculate the volume of a cuboid.

CylinderVolume(): Method to calculate the volume of a cylinder.

IsCube(): Method to check if an object is a cube or not.

Flow:

*The program starts by creating an object of the "Scanner" class to read  input values from the user.

*It then initializes the variables "op" and "c" to 0, and "Length", "Breadth", "Height", and "Radius" to 0.

*The program then enters a do-while loop to interact with the user and calculate the volume of different 3D objects.

*Inside the loop, the program displays a menu to ask the
