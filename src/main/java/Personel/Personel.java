package Personel;

public class Personel {
    String name;
    String surname;
    int tc;
    int gsm;
    String departman;
    String title;
    String superviser;

    void add () {
        System.out.println(tc + " numaralı personel sisteme eklendi.");
    }

    void show(int tc){
        System.out.println(tc + " numaralı personele ait bilgiler:" + name + " " + surname + "," + gsm + "," + departman + "," + title + "," + superviser);
    }

    void list(String departman){
        System.out.println(departman + " departmanına ait personellerin listesi: "+ name +" "+ surname);

    }
}
