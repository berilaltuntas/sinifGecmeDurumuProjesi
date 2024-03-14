import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double average;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik=input.nextInt();

        if ((mat >= 0 && mat <= 100) && (turkce >= 0 && turkce <= 100) &&
                (fizik >= 0 && fizik <= 100) && (muzik >= 0 && muzik <= 100)) {
            average = (mat + fizik + turkce + kimya + muzik) / 5;
            System.out.println("Ortalamanız: " + average);

            if (average <= 55) {
                System.out.println("Sınıfta kaldınız. Tekrar görüşmek üzere!");
            } else {
                System.out.println("Tebrikler.Sınıfı geçtiniz.");
            }
        }
        else {
            System.out.println("Notlarınızın aralığı 0 ile 100  olmalıdır.");

        }

    }
}