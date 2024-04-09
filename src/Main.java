public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte clientOS=1;
        switch (clientOS){
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
        short clientDeviceYear=2015;
        clientOS=1;
        if(clientDeviceYear<=2015){
            System.out.println("Ваш аппарат выпущен в 2015 году или ранее");
        switch (clientOS){
            case 0:
                System.out.println("Установите облегченную версию приложения для iOS по следующей ссылке");
                break;
            case 1:
                System.out.println("Установите облегченную версию приложения для android по следующей ссылке");
                break;
            default:
                System.out.println(" ваш аппарат не поддерживает актуальную версию приложения");
        }
            switch (clientOS){
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
        short currentYear=2024;
        boolean cond1=((currentYear%4)==0);
        boolean cond2=((currentYear%100)!=0);
        if (cond1&&cond2){
            System.out.println("Указан "+currentYear+"й год, и он является високосным");
        }
        else {
            System.out.println("указанный "+currentYear+"й год не является високосным.");
        }
    }
}