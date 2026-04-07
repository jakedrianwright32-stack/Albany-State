import java.util.Scanner;
import java.text.DecimalFormat;

// Changed class name to Portfolio2
public class Portfolio2 {
public static final double PI = 3.14;
public static Scanner scanner = new Scanner(System.in);
public static DecimalFormat df = new DecimalFormat("0.00");

public static void main(String[] args) {
int choice;
do {
System.out.println("\n--- Menu ---\n1. Trapezoid Area\n2. Cylinder Surface Area\n3. Sphere Volume\n4. Exit");
System.out.print("Enter choice: ");

if (scanner.hasNextInt()) {
choice = scanner.nextInt();
scanner.nextLine();
} else {
choice = 0;
scanner.nextLine();
}

switch (choice) {
case 1: calculateTrapezoidArea(); break;
case 2: calculateCylinderSurfaceArea(); break;
case 3: calculateSphereVolume(); break;
case 4: System.out.println("Goodbye!"); break;
default: System.out.println("Invalid choice.");
}
} while (choice != 4);
}

// A. Area of a Trapezoid: A = 1/2(x₁ + x₂)h
public static void calculateTrapezoidArea() {
System.out.print("Enter x₁: "); double x1 = scanner.nextDouble();
System.out.print("Enter x₂: "); double x2 = scanner.nextDouble();
System.out.print("Enter h: "); double h = scanner.nextDouble();
scanner.nextLine();
double area = 0.5 * (x1 + x2) * h;
System.out.println("Area: " + df.format(area));
}

// B. Surface Area of a Cylinder: S = 2πr² + 2π(rh)
public static void calculateCylinderSurfaceArea() {
System.out.print("Enter r: "); double r = scanner.nextDouble();
System.out.print("Enter h: "); double h = scanner.nextDouble();
scanner.nextLine();
double surfaceArea = (2 * PI * Math.pow(r, 2)) + (2 * PI * r * h);
System.out.println("Surface Area: " + df.format(surfaceArea));
}

// C. Volume of a Sphere: V = 4/3πr³
public static void calculateSphereVolume() {
System.out.print("Enter r: "); double r = scanner.nextDouble();
scanner.nextLine();
double volume = (4.0 / 3.0) * PI * Math.pow(r, 3);
System.out.println("Volume: " + df.format(volume));
}
}
