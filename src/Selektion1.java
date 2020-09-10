public class Selektion1 {

    public static void main(String[] args) {

        //Variabler og værdier
        int x = 5;
        int y = 8;
        int z = 3;

        //A
        if(x <= 5 && z != y) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //B
        if(x == 5 || x == y && z == 3) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //C
        if(x / y > z / x) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //D
        if(!(x != y - z)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //E
        if(2 * x != x || x == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //F
        if(! true || ! false) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // Man kan os bare nøjes med 1 "else" statement til sidst
    }
}
