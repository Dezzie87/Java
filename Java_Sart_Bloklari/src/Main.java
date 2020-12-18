public class Main {

    public static void main(String[] args) {
        //Örnek yazan yer.
        //String x = "Z3DX";
        //String y = "Software";
        //if(x.equals(y)){ //return false çünkü farklı stringler
        //}


        //Koşul sağlayan durum
        //int x = 3;
        //if(x>0){ // x>0 koşulu true döneceği için
        //   int z = x*5;
            //System.out.println("z değeri : "+z);
        //}
            //konsol çıktısı : z değeri :15


        //Koşul sağlamayan durum
        //int x = 0;
        //if(x>0){ // x>0 koşulu false döneceği için
            //int z = x*5;
            //System.out.println("z değeri : "+z);
        //}
        //Herhangi konsol çıktısı olmuyacaktır.


        //
        int x = 55;

        if(x>90){
            System.out.println("x 90'dan büyüktür");

        }else if(x>=80){
            System.out.println("x 90 ile 80 arasında");

        }else if(x>=70){
            System.out.println("x 80 ile 70 arasında");

        }else if(x>=60){
            System.out.println("x 70 ile 60 arasında");

        }else if(x>=50){
            System.out.println("x 60 ile 50 arasında");

        }else if(x>=40){
            System.out.println("x 50 ile 40 arasında");

        }else if(x>=30){
            System.out.println("x 40 ile 30 arasında");

        }else if(x>=20){
            System.out.println("x 30 ile 20 arasında");

        }else if(x>=10){
            System.out.println("x 20 ile 10 arasında");

        }else if(x>=0){
            System.out.println("x 10 ile 0 arasında");

        }else{
            System.out.println("x 0 'dan küçüktür");
        }

//Konsol çıktısı : x 60 ile 50 arasında


    }
}
