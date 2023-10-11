import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Uppgift a */
        Scanner tb = new Scanner(System.in);
        System.out.print("Skriv in ett tusental: ");
        int talet = tb.nextInt();
        talet /= 1000;
        Math.round(talet);
        System.out.println(talet*1000);
        
        /*Uppgift b */
        System.out.println("Skriv in täljare : ");
        int tälj = tb.nextInt();
        System.out.println("Skriv in en nämnare: ");
        int nämn = tb.nextInt();

        System.out.println((tälj/nämn)+" "+(tälj%nämn)+"/"+nämn);

         





    }
}

