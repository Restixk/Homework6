public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {//Задача 1
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 10; i >= 1; i = i - 1) {// задача 2
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 1; i <= 17; i = i + 1) {// задача 3
            if (i % 2 == 0) {
                System.out.println("Итерация цикла четное " + i);
            }
        }
        for (int i = 10; i >= -10; i = i - 1) {// задача 4
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 1904; i <= 2096; i = i + 4) {//Задача 5
            System.out.println("Весокосный год " + i);
        }
        for (int i = 7; i <= 98; i = i + 7) {//Задача 6
            System.out.println("число последовательности " + i);
        }
        for (int i = 1; i <= 512; i = i * 2) {//Задача 7
            System.out.println("число последовательности " + i);
        }
        int deferred = 29000;//задача 8
        int deferredTotal = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            deferredTotal = deferredTotal + deferred;
            System.out.println("Месяц " + i + ", cумма накоплений равна " + deferredTotal + " рублей");
        }
        int deferredNew = 29000;//задача 9
        double deferredTotalNew = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            deferredTotalNew = (deferredTotalNew + deferredNew) * 1.01;
            System.out.println("Месяц " + i + ", cумма накоплений равна " + deferredTotalNew + " рублей");
        }
        int result = 0;
        for (int i = 1; i <= 10; i = i + 1) {//Задача 10
            result = 2 * i;
            System.out.println("2*" + i + "=" + result);
        }

    }
}