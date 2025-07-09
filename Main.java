import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Utente Pippo = new Utente("Pippo");
    Utente Topolino = new Utente("Topolino");
    Utente Paperino = new Utente("Paperino");


    Scanner scannerStr = new Scanner(System.in);

    System.out.print("Inserire messaggio: ");

    // Oggetto base
    //MessaggioBase myMessaggioBase = new MessaggioBase(scannerStr.nextLine());

    // Decoratore
    //DecoratoreMaiuscolo myDecoratoreMaiuscolo = new DecoratoreMaiuscolo(myMessaggioBase);

    //System.out.println("Messaggio originale: " + myMessaggioBase.getMessaggio() + "\nMessaggio decorato: " + myDecoratoreMaiuscolo.getMessaggio());



    scannerStr.close();
  }
}
