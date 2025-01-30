import java.util.Scanner;

public class Plate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int xSW = in.nextInt();
        int ySW = in.nextInt();
        int xNE = in.nextInt();
        int yNE = in.nextInt();
        int xMen = in.nextInt();
        int yMen = in.nextInt();

        System.out.println(shortestDistance(xSW, ySW, xNE, yNE, xMen, yMen));
    }

    static String shortestDistance(int xSW, int ySW, int xNE, int yNE, int xMen, int yMen) {
        if (xMen < xSW) {
            if (yMen < ySW) {
                return "SW";
            } else if (yMen > yNE) {
                return "NW";
            } else {
                return "W";
            }
        }else if (xMen > xNE) {
            if (yMen < ySW) {
                return "SE";
            } else if (yMen > yNE) {
                return "NE";
            } else {
                return "E";
            }
        } else {
            if (yMen < ySW) {
                return "S";
            }else if (yMen > yNE) {
                return "N";
            } else {
                return null;
            }
        }
    }
}
