package AverageCalc;

public class AverageFinder {
    public double computeAverage(int[] intArray) {
        double num = 0.0;
        for(int i = 0 ; i < intArray.length ; i++) {
            num += intArray[i];
        }
        num = num / intArray.length;
        return num;
    }
}
