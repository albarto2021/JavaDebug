package debugTutorial;

public class Debug01 {
    static int global = 5;
    public static void main(String[] args) {
        dongu1();
    }

    public static void  dongu1(){
        int y=0;
        global++;
        for (int i= 1; i<=10 ; i++){
            System.out.print(i + " ");
            y += i*2;
        }
        dongu2();
        dongu3();
    }
    public static void  dongu2(){
        global+=3;
        for (int x = 1; x<=5 ; x++){
            System.out.print(x + " ");
        }
    }
    public static void  dongu3(){
        global-=1;
        for (int y = 1; y<=2 ; y++){
            System.out.print(y + " ");
        }
    }
}