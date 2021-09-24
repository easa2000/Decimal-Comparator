package ChallengeWithTim;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstVariable, double secondVariable) {
        int first = (int)(firstVariable * 1000);
        int second = (int)(secondVariable * 1000);
        if((first - second) == 0){
            return true;
        }else{
            return false;
        }
    }
}
