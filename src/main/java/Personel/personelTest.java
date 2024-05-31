package Personel;

public class personelTest {
    public static void main(String[] args) {
        Personel p1 = new Personel();
        Personel p2 = new Personel();
        Personel p3 = new Personel();
        Personel p4 = new Personel();
        Personel p5 = new Personel();

        p1.tc = 1234;
        p1.name = "Jhon";
        p1.surname = "Smith";
        p1.gsm = 4561;
        p1.departman = "Technology";
        p1.title = "Frontend Developer";
        p1.superviser = "Mrs. Smith";

        p2.tc = 567;
        p2.name = "Smith";
        p2.surname = "Bye";
        p2.gsm = 4562;
        p2.departman = "Technology";
        p2.title = "Engieer Manager";
        p2.superviser = "Mrs. Adam";

        p3.tc = 890;
        p3.name = "Eli";
        p3.surname = "Myle";
        p3.gsm = 4563;
        p3.departman = "Product";
        p3.title = "Product Manager";
        p3.superviser = "Ms. Marie";

        p4.tc = 3567;
        p4.name = "Sara";
        p4.surname = "Lov";
        p4.gsm = 4564;
        p4.departman = "Technology";
        p4.title = "Backend Developer";
        p4.superviser = "Mrs. Smith";

        p5.tc = 6789;
        p5.name = "Daisy";
        p5.surname = "Flower";
        p5.gsm = 4565;
        p5.departman = "Data";
        p5.title = "Data Engineer";
        p5.superviser = "Ms. Kyle";

        System.out.println("Bugün sisteme eklenen personeller: ");
        p1.add();
        p2.add();
        p3.add();
        p4.add();
        p5.add();

        System.out.println("-------------");

        System.out.println("TC bilgileri girilen personeller: ");
        p1.show(1234);
        p3.show(3567);

        System.out.println("-------------");

        System.out.println("İstenilen departmanda bulunan personeller: ");

        p1.list("Technology");
        p2.list("Technology");
        p4.list("Technology");

    }
}
