public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppg A");
        int tal1 = 23;
        int tal2 = 45;
        int summa;
        int produkt;
        summa = tal1 + tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);
        summa = tal1 - tal2;
        System.out.println(tal1+"-"+tal2+"="+summa);

        System.out.println("Uppg B");
        int tal3 = 234232;
        int tal4 = 3424;
        produkt = tal3 * tal4;
        System.out.println(tal3+"*"+tal4+"="+produkt);

        System.out.println("Uppg C");
        double kvot;
        kvot = tal1/tal2;
        System.out.println(tal1+"/"+tal2+"="+kvot);
        int tal5 = 10;
        int tal6 = 3;
        kvot = tal5/tal6;
        System.out.println(tal5+"/"+tal6+"="+kvot);

        System.out.println("Uppg D");
        kvot = tal5 % tal6;
        System.out.println("Resten av 10/3 är "+kvot);
        kvot = 12%4;
        System.out.println("Resten av 12/4 är "+kvot);
    }
}
