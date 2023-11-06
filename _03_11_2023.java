public class _03_11_2023 {
    public static int counter = 0;

    public static int numberOfSteps(int num) {
        while (num != 0) {
            System.out.println(num);
            if ((num % 2) != 0) {
                num = num - 1;
                counter++;
            }
            else {
                num = num / 2;
                counter++;
            }
        }
        return (counter);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
