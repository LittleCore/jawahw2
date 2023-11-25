public class Main {
    public static void main(String[] args) {
        int price = 17239;
        int bonusMileDivisor = 20;

        int bonusMiles = price / bonusMileDivisor;
        System.out.println("Стоимость Вашего билета составляет = " + price);
        System.out.println("Вам начислено " + bonusMiles + " бонусных миль. Поздравляем!");
    }
}
