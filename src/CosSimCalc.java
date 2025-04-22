import java.util.ArrayList;

public class CosSimCalc {
    public static void main (String [] args) {
        double[] vecA = {0.222, 0};
        double[] vecB = {0.222, 0};
        double[] vecC = {0, 0};
        double[] vecD = {0, 0.398};
        double[] vecElfAlice = {0.222, 0.398};

        double [] vecA2 = {0.301, 1.204, 0.602, 0, 0};
        double [] vecC2 = {0, 0, 0.301, 0.301, 0};
;

        System.out.println ("Problem d: "+ cosSim(vecA2, vecC2));

        System.out.println ("Vec a: " + cosSim(vecA, vecElfAlice));
        System.out.println ("Vec b: " + cosSim(vecB, vecElfAlice));
        System.out.println ("Vec c: " + cosSim(vecC, vecElfAlice));
        System.out.println ("Vec d: " + cosSim(vecD, vecElfAlice));
    }

    public static double cosSim(double[] vec1, double[] vec2) {
        if (vec1.length != vec2.length) {
            throw new IllegalArgumentException("Vectors must be same size");
        }
        double numerator = 0;
        for (int i = 0; i < vec1.length; i++) {
            numerator += vec1[i] * vec2[i];
        }
        double denom1 = 0;
        for (Double val : vec1) {
            denom1 += val*val;
        }
        denom1 = Math.sqrt(denom1);
        double denom2 = 0;
        for (Double val : vec2) {
            denom2 += val*val;
        }
        denom2 = Math.sqrt(denom2);
        double denom = denom1*denom2;

        return (numerator/denom);
    }
}
