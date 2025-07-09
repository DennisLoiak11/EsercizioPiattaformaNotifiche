import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Creazione utenti
    Utente Pippo = new Utente("Pippo");
    Utente Topolino = new Utente("Topolino");
    Utente Paperino = new Utente("Paperino");

    //creazione istanza singleton della classe NotificationManager
    NotificationManager manager = NotificationManager.getInstance();

    // Registro Observers
    manager.registerObserver(Pippo);
    manager.registerObserver(Topolino);
    manager.registerObserver(Paperino);

    // Input 1
    Scanner scannerStr = new Scanner(System.in);
    System.out.print("Inserire messaggio 1: ");
    String messaggio = scannerStr.nextLine();

    //metodo per inviare il messaggio a tutti gli osservatori
    manager.inviaNotifica(messaggio);

    // Input 2
    System.out.print("\nInserire messaggio 2: ");
    messaggio = scannerStr.nextLine();
    
    // Utente escluso dalle notifiche
    manager.removeObserver(Paperino);

    // metodo per inviare il messaggio a tutti gli osservatori di nuovo
    manager.inviaNotifica(messaggio);

    scannerStr.close();
  }
}