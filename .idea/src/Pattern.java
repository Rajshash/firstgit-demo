public class Pattern{
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){

            for (int k=5-i; k>=1; k--){
                System.out.println(" ");
            }

            for (int j=0; j<=i; j++){
                System.out.println("*");
            }
        }
    }
}

public class Pattern2{
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}