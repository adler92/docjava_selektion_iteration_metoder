public class selektion5 {

    public static void main(String[] args) {

        int x = 25;

        if(x >= 0 && x <= 9){
            System.out.println(x + "tilhører [0:9]");
        }

        if(x >= 10 && x <= 19){
            System.out.println(x + "tilhører [10:19]");
        }

        if(x >= 20 && x <= 29){
            System.out.println(x + "tilhører [20:29]");
        }

        if(x >= 30 && x <= 39){
            System.out.println(x + "tilhører [30:39]");
        }

        if(x >= 40 && x <= 49){
            System.out.println(x + "tilhører [40:49]");
        }

        if(x >= 50 && x <= 59){
            System.out.println(x + "tilhører [50:59]");
        }
        if(x >= 60 && x <= 69){
            System.out.println(x + "tilhører [60:69]");
        }

        if(x >= 70 && x <= 79){
            System.out.println(x + "tilhører [70:79]");
        }

        if(x >= 80 && x <= 89){
            System.out.println(x + "tilhører [80:89]");
        }

        if(x >= 90 && x <= 99){
            System.out.println(x + "tilhører [90:99]");
        }

        else if(x <= 0 || x >= 99){
            System.out.println("Tallet tilhører ikke et interval");
        }


        //Test
        System.out.println("---test---");
        x = -41;
        if(x >= 0 && x <= 9){
            System.out.println(x + "tilhører [0:9]");
        }

        if(x >= 10 && x <= 19){
            System.out.println(x + "tilhører [10:19]");
        }

        if(x >= 20 && x <= 29){
            System.out.println(x + "tilhører [20:29]");
        }

        if(x >= 30 && x <= 39){
            System.out.println(x + "tilhører [30:39]");
        }

        if(x >= 40 && x <= 49){
            System.out.println(x + "tilhører [40:49]");
        }

        if(x >= 50 && x <= 59){
            System.out.println(x + "tilhører [50:59]");
        }
        if(x >= 60 && x <= 69){
            System.out.println(x + "tilhører [60:69]");
        }

        if(x >= 70 && x <= 79){
            System.out.println(x + "tilhører [70:79]");
        }

        if(x >= 80 && x <= 89){
            System.out.println(x + "tilhører [80:89]");
        }

        if(x >= 90 && x <= 99){
            System.out.println(x + "tilhører [90:99]");
        }

        else if(x <= 0 || x >= 99){
            System.out.println("Tallet tilhører ikke et interval");
        }
    }
}
