import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int mat,kimya,fizik,biyo,turkce;
        int notTop = 0, dersSayisi = 0;
        double ortalama;
 Scanner inp = new Scanner(System.in);
    System.out.print("Matematik Notunu Giriniz:");
    mat = inp.nextInt();
    if( mat < 0 || mat > 100){
        System.out.println("0 ile 100 arasında bir değer giriniz. Notunuz ortalamaya dahil edilmeyecektir.");
    }else {
        notTop += mat;
        dersSayisi += 1;
    }
    System.out.print("Kimya Notunu Giriniz:");
    kimya = inp.nextInt();
    if (kimya < 0 || kimya > 100){
        System.out.println("0 ile 100 arasında bir değer giriniz. Notunuz ortalamaya dahil edilmeyecektir.");
    }else {
        notTop += kimya;
        dersSayisi += 1;
    }
    System.out.print("Fizik Notunu Giriniz:");
    fizik = inp.nextInt();
    if(fizik < 0 || fizik > 100){
        System.out.println("0 ile 100 arasında bir değer giriniz. Notunuz ortalamaya dahil edilmeyecektir");
    }else{
    notTop += fizik;
    dersSayisi += 1;
    }
    System.out.print("Biyoloji Notunu Giriniz:");
    biyo = inp.nextInt();
    if(biyo < 0 || biyo > 100){
        System.out.println("0 ile 100 arasında bir değer giriniz. Notunuz ortalamaya dahil edilmeyecektir");
    }else{
    notTop += biyo;
    dersSayisi += 1;
    }
    System.out.print("Türkçe Notunu Giriniz:");
    turkce = inp.nextInt();
    if(turkce < 0 || turkce >100){
        System.out.println("0 ile 100 arasında bir değer giriniz. Notunuz ortalamaya dahil edilmeyecektir");
    }else{
        notTop += turkce;
        dersSayisi += 1;
    }
    ortalama = notTop / dersSayisi;
    System.out.println("Ortalamanız:" + ortalama);
    if(ortalama >= 50){
    System.out.print("Geçtiniz.");
    }else{
        System.out.print("Kaldınız");
    }



    }
}