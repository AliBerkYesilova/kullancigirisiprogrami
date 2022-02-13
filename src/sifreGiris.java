import java.util.Scanner;

public class sifreGiris {
    public static void main(String[] args) {


        String kullanciAdi, Sifre;


        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        kullanciAdi = input.nextLine();

        System.out.print("Şifreniz : ");
        Sifre = input.nextLine();

        if (kullanciAdi.equals("patika") && Sifre.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Şifreniz Yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? ");
            System.out.println("1-Şifremi sıfırla\n2-İstemiyorum ");

            int sifreSec;
            sifreSec = input.nextInt();


            switch (sifreSec) {
                case 1:
                    System.out.print("Yeni şifreniz : " + input.nextLine());
                    String yeniSifre = input.nextLine();

                    if (yeniSifre.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");

                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }

                    break;

                case 2:
                    System.out.println("İyi günler. :)");
                    break;
            }


        }


    }
}










