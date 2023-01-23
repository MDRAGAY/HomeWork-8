public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int[] cars = new int[3];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = i + 1;}

        double[] nums = {1.57, 7.654, 9.986};

        boolean[] booleans = {true, false};

        System.out.println("Задача2");
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]);
            if (i != cars.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i != booleans.length - 1) {
                System.out.print(", ");
            }
        }


    }
}