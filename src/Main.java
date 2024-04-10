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
        } else {
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
        boolean cond3 = currentYear <= 1584;
        boolean cond4 = ((currentYear % 400) == 0);
        if (cond3) {
            System.out.println("В это время ещё не было понятия високосности");
        }
        //такой пример ведь не является двойным вложением? Если первая проверка не прошла, то приступаем к блоку else
        // и уже внутри него проверяем условия високосности.
        else {
            if (cond1 && cond2) {
                System.out.println("Указан " + currentYear + "й год, и он является високосным");
            } else
                System.out.println("указанный " + currentYear + "й год, и он не является високосным.");
            if (cond4) {
                System.out.println("Указан " + currentYear + "й год, и он является високосным");
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
        if (deliveryPossible) {
            if (close) {
                estimate += 1;
                System.out.println("потребуется дней " + estimate);
            } else {
                if (middle) {
                    estimate += 2;

                    System.out.println("Потребуется дней " + estimate);
                } else if (far)
                    estimate += 3;
                System.out.println("потребуется дней " + estimate);
            }
        } else {
            System.out.println("Доставка в ваш регион не осуществляется");
        }
        System.out.println(" ");
        System.out.println("Задача 5");
        byte monthNumber = 12;
        boolean spring = (monthNumber >= 3) && (monthNumber <= 5);
        boolean summer = (monthNumber >= 6) && (monthNumber <= 8);
        boolean fall = (monthNumber >= 9) && (monthNumber <= 11);
        boolean winter = (monthNumber <= 2 || monthNumber == 12);
        boolean impossible = monthNumber > 12;
        if (!impossible) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь - это Зима!");
                    break;
                case 2:
                    System.out.println("Февраль - это Зима!");
                    break;
                case 3:
                    System.out.println("Март - это Весна!");
                    break;
                case 4:
                    System.out.println("Апрель - это Весна!");
                    break;
                case 5:
                    System.out.println("Май - это Весна!");
                    break;
                case 6:
                    System.out.println("Июнь - это Лето!");
                    break;
                case 7:
                    System.out.println("Июль - это Лето!");
                    break;
                case 8:
                    System.out.println("Август - это Лето!");
                    break;
                case 9:
                    System.out.println("Сентябрь - это Осень!");
                    break;
                case 10:
                    System.out.println("Октябрь - это Осень!");
                    break;
                case 11:
                    System.out.println("Ноябрь - это Осень!");
                    break;
                case 12:
                    System.out.println("Декабрь - это Зима!");
                    break;
            }
        } else {
            System.out.println("Такого Месяца не существует");
        }

    }
}

