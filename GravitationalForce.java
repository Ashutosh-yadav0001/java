import java.util.Scanner;

public class GravitationalForce {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the mass of first object(M1): ");
        double M1 = scn.nextInt();

        System.out.print("Enter the mass of second object (M2): ");
        double M2 = scn.nextInt();

        System.out.print("Enter the distance b/w M1 and M2 (D): ");
        double D = scn.nextInt();

        double G = 6.6774e-11;

        double Force = (G * M1 * M2) / (D * D);

        System.out.print("force  b/w M1 and M2 : " + Force);

        scn.close();

    }
}
