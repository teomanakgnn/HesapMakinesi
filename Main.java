public class Main {
    public static int toplama(int x,int y){
        return x+ y;
    }

    public static void bolme(int x,int y) {
        try {
            System.out.println( x /y);
        } catch (ArithmeticException e) {
            System.out.println("İşlem hatalı.");
        }
    }

    public static void main(String[] args) {
        //bolme(5,0); 
    }
}      