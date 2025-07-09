import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Utente Pippo = new Utente("Pippo");
    Utente Topolino = new Utente("Topolino");
    Utente Paperino = new Utente("Paperino");

    //creazione istanza singleton della classe NotificationManager
    NotificationManager manager = NotificationManager.getInstance();


    manager.registerObserver(Pippo);
    manager.registerObserver(Topolino);
    manager.registerObserver(Paperino);

    Scanner scannerStr = new Scanner(System.in);
    System.out.print("Inserire messaggio 1: ");
    String messaggio = scannerStr.nextLine();

    //metodo per inviare il messaggio a tutti gli osservatori
    manager.inviaNotifica(messaggio);

    

    // Oggetto base
    //MessaggioBase myMessaggioBase = new MessaggioBase(scannerStr.nextLine());

    // Decoratore
    //DecoratoreMaiuscolo myDecoratoreMaiuscolo = new DecoratoreMaiuscolo(myMessaggioBase);

    //System.out.println("Messaggio originale: " + myMessaggioBase.getMessaggio() + "\nMessaggio decorato: " + myDecoratoreMaiuscolo.getMessaggio());


    System.out.print("Inserire messaggio 2: ");
    messaggio = scannerStr.nextLine();
    

    manager.removeObserver(Paperino);



    // metodo per inviare il messaggio a tutti gli osservatori
    manager.inviaNotifica(messaggio);



    scannerStr.close();
  }
}