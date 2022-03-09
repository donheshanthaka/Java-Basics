public class Main {
    public static void main(String[] args){
        System.out.println((calcFeetAndInchesToCentimeters(0, 0)));
        System.out.println((calcFeetAndInchesToCentimeters(157)));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        inches += feet * 12;
        return inches * 2.54;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches /12d;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
