import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String soz=scanner.nextLine();

       Week days=Week.valueOf(soz);
        switch(days){
            
            case DUISHOMBU :
                System.out.println("Дуйшомбу куну жава окуйм");
                break;
            case SHEISHEMBI:
                System.out.println("Практика сабагы болот");
                break;
            case SHARSHEMBI:
                System.out.println("Шаршемби кунун жава окуйм");
                break;
            case BEISHEMBI:
                System.out.println("Практика сабагы болот");
                break;
            case JUMA:
                System.out.println("Жума кунун жава окуйм");
                break;
            case ISHEMBI:
                System.out.println("Практика сабагы болот");
                break;
            case JERSHEMBI:
                System.out.println("Выходной");
            default:
                System.out.println("Мындай кун жок");

        }
    }
}