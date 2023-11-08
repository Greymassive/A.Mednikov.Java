public class Main {
    public static void main(String[] args) {
        int number = 9;

        if (number > 7) {
            System.out.println("Привет");
        }


        String name = "Пётр";

        if (name == "Вячеслав") {
            System.out.println("Привет " + name);
        } else {
            System.out.println("Нет такого имени");
        }


        int[] numbers = {5, 9, 3, 6, 2, 15, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
