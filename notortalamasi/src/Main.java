import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int mat,trk,fzk,kmy,trh,cgrfy,bylj;
        Scanner input = new Scanner(System.in);
        System.out.println("**Not Ortalamana Göre Geçtin mi? Kaldın mı?**");


      System.out.print("Matematik Notunuzu Giriniz: ");
      mat = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        trk = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fzk = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kmy = input.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz: ");
        bylj = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        trh = input.nextInt();

        System.out.print("Coğrafya Notunuzu Giriniz: ");
        cgrfy = input.nextInt();

        int  toplam = (mat+trk+fzk+kmy+bylj+trh+cgrfy);
        double sonuc = toplam/7.0;
        System.out.println("Not Ortalamanız: "+sonuc);

        System.out.println(sonuc>=60 ? "**GEÇTİN**" : "**KALDIN**");


    }
}