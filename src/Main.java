public class Main {
    public static <string> void main(String[] args) {
        System.out.println("Задача 1");
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Ваш смартфон работает под управлением iOS");
                System.out.println("Для вашего устройства установите приложение для iOS по следующей ссылке");
                break;
            case 1:
                System.out.println("Ваш смартфон работает под управлением Adroid");
                System.out.println("Для вашего устройства установите приложение для Android по следующей ссылке");
                break;
            default:
                System.out.println("ваша OS не поддерживается приложением");
        }
        System.out.println(" ");
        System.out.println("Задача 2");
        short clientDeviceYear = 2015;
        clientOS = 1;
        if (clientDeviceYear <= 2015) {
            System.out.println("Ваш аппарат выпущен в 2015 году или ранее");
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по следующей ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для android по следующей ссылке");
                    break;
                default:
                    System.out.println(" ваш аппарат не поддерживает актуальную версию приложения");
            }
            switch (clientOS) {
                case 0:
                    System.out.println("Ваш смартфон работает под управлением iOS");
                    System.out.println("Для вашего устройства установите приложение для iOS по следующей ссылке");
                    break;
                case 1:
                    System.out.println("Ваш смартфон работает под управлением Adroid");
                    System.out.println("Для вашего устройства установите приложение для Android по следующей ссылке");
                    break;
                default:
                    System.out.println("ваша OS не поддерживает приложение");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        short currentYear = 2024;
        boolean cond1 = ((currentYear % 4) == 0);
        boolean cond2 = ((currentYear % 100) != 0);
        boolean cond3 = currentYear < 1584;
        if (cond3) {
            System.out.println("В это время ещё не было понятия високосности");
        }
        //такой пример ведь не является двойным вложением? Если первая проверка не прошла, то приступаем к блоку else
        // и уже внутри него проверяем условия високосности.
        else {
            if (cond1 && cond2) {
                System.out.println("Указан " + currentYear + "й год, и он является високосным");
            } else {
                System.out.println("указанный " + currentYear + "й год, и он не является високосным.");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        byte estimate = 0;
        int deliveryDistance = 95;
        boolean close = deliveryDistance < 20;
        boolean middle = (deliveryDistance >= 20) && (deliveryDistance < 60);
        boolean far = (deliveryDistance >= 60) && (deliveryDistance <= 100);
        boolean deliveryPossible = deliveryDistance <= 100;
        if(deliveryPossible){
        if (close) {
            estimate += 1;
            System.out.println("потребуется дней " + estimate);
        } else {
            if (middle) {
                estimate += 1;
                estimate +=1;
                System.out.println("Потребуется дней " + estimate);}

                else  if (far)
            estimate += 1;
                estimate +=1;
                estimate +=1;
        System.out.println("потребуется дней " + estimate);}}
        else
            {
                System.out.println("Доставка в ваш регион не осуществляется");
    }
        System.out.println(" ");
        System.out.println("Задача 5");
byte monthNumber = 12;
byte season = 0;
boolean spring=(monthNumber>=3)&&(monthNumber<=5);
boolean summer=(monthNumber>=6)&&(monthNumber<=8);
boolean fall=(monthNumber>=9)&&(monthNumber<=11);
boolean winter=(monthNumber<=2||monthNumber==12);
boolean impossible=monthNumber>12;
if (winter) {season=4;}
else {
    if (spring) {season = 1;}
    else if (summer) {season = 2;}
    else if (fall) {season = 3;}
    else if(impossible) {
        System.out.println("нет такого месяца");
    }
}
switch (season) {
    case 1:
        System.out.println("Весна!");
        break;
    case 2:
        System.out.println("Лето!");
        break;
    case 3:
        System.out.println("Осень!");
        break;
    case 4:
        System.out.println("Зима!");
        break;
    }


        }
    }

