import java.util.*;


public class Plate {
    public static void main(String[] args) {
        int xSW = InputUtils.readTarget();
        int ySW = InputUtils.readTarget();
        int xNE = InputUtils.readTarget();
        int yNE = InputUtils.readTarget();
        int xMen = InputUtils.readTarget();
        int yMen = InputUtils.readTarget();

        shortestDistance(xSW, ySW, xNE, yNE, xMen, yMen);
    }

    static void shortestDistance(int xSW, int ySW, int xNE, int yNE, int xMen, int yMen) {
        int xNW = xSW;   // Северо-западный угол (xSW, yNE)
        int yNW = yNE;
        int xSE = xNE;   // Юго-восточный угол (xNE, ySW)
        int ySE = ySW;

        double distanceMenToSW = distance(xMen, yMen, xSW, ySW);
        double distanceMenToNW = distance(xMen, yMen, xNW, yNW);
        double distanceMenToNE = distance(xMen, yMen, xNE, yNE);
        double distanceMenToSE = distance(xMen, yMen, xSE, ySE);

        Map<String, Double> distanceMap = new HashMap<>();
        distanceMap.put("SW", distanceMenToSW);
        distanceMap.put("NW", distanceMenToNW);
        distanceMap.put("NE", distanceMenToNE);
        distanceMap.put("SE", distanceMenToSE);

        String minAngle = "";
        double minDistance = Double.MAX_VALUE;

        for (Map.Entry<String, Double> entry : distanceMap.entrySet()) {
            if (entry.getValue() < minDistance) {
                minDistance = entry.getValue();
                minAngle = entry.getKey();
            }
        }
        System.out.println(minAngle);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
