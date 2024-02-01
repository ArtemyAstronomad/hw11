import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkIsLeap(2020);
        checkIsLeap(2023);
        defineAppVersion(1, 2020);
        defineAppVersion(0, 2024);
        defineAppVersion(1, 2024);
        defineAppVersion(0, 2017);
        deliveryOption(20);
        deliveryOption(100);
        deliveryOption(50);
        deliveryOption(250);
    }

    public static void checkIsLeap(int year){
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year >= 1584){
            System.out.println("Этот год является високосным");
        } else {
            System.out.println("Это не високосный год");
        }
    }
    private static void defineAppVersion(int mobileOs, int mobileYear) {
       String mobileOsName;

        switch (mobileOs){
            case 0:
                mobileOsName = "iOs";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "Неизвестная ОС";
                break;

        }
        int currentYear = LocalDate.now().getYear();

        if (mobileYear != currentYear){
            System.out.println("Для ОС " + mobileOsName + " установите lite-версию ОС.");
        }
        else {
            System.out.println("Для ОС " + mobileOsName + " установите обычную версию ОС.");
        }
    }
    private static void deliveryOption(int deliveryDistance){
        int delTime = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + delTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + (delTime+1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + (delTime+2));
        } else {
            System.out.println("Доставка свыше 100 км не производится");
        }
    }
    }