
public class SumOfTwoDice {
    public static void main(String[] args) {

        int dice1 = 1 + (int) (Math.random() * 6);
        int dice2 = 1 + (int) (Math.random() * 6);
        int sum = dice1 + dice2;

        System.out.println("Xúc xắc 1: " + dice1);
        System.out.println("Xúc xắc 2: " + dice2);
        System.out.println("Tổng: " + sum);
    }
}
