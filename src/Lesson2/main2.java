package Lesson2;

public class main2 {

    public static void main(String[] args) {
        System.out.println(vPredelah10i20(6,12));
        System.out.println(vPredelah10i20(15,30));

        pologitelnoeIliOtricatelnoe(4);
        pologitelnoeIliOtricatelnoe(-7);

        System.out.println(ifOtricatelnoe(-3));
        System.out.println(ifOtricatelnoe(4));

        isPechatSlovoRaz("Hello", 5);
    }
    public static boolean vPredelah10i20 (int a, int b){

        return a + b >= 10 && a + b <=20;
    }
    public static void pologitelnoeIliOtricatelnoe(int chislo) {
        if (chislo >= 0) {
            System.out.println("Pologitelnoe chislo");
        } else {
            System.out.println("Otricatelnoe chislo");
        }
    }
    public static boolean ifOtricatelnoe (int chislo){
        return chislo < 0;
    }

    public static void isPechatSlovoRaz (String Slovo,int skolkoRaz){
        for (int i = 0; i < skolkoRaz; i++) {
            System.out.println(Slovo);
        }
    }
}
