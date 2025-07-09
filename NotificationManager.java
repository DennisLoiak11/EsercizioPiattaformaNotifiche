import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
  // istanza privata e statica della classe NotificationManager
  private static NotificationManager instance;

  // lista di utenti registrati (Observer)
  private List<Observer> observers;

  // costruttore privato per sovrascrivere il costruttore di default di java e
  // impedire la creazione di istanze esterne alla classe
  private NotificationManager() {
    observers = new ArrayList<>();
  }

  // metodo pubblico statico per ottenere l’unica istanza
  public static NotificationManager getInstance() {
    if (instance == null) {
      instance = new NotificationManager();
    }
    return instance;
  }

  // metodo per registrare un osservatore (utente)
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  // metodo per rimuovere un osservatore (utente)
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  // metodo per inviare notifiche a tutti gli osservatori
  public void inviaNotifica(String messaggio) {

    // Il primo utente riceve timestamp e maiuscole
    observers.get(0).aggiorna(
        new MaiuscoloDecorator(
            new TimestampDecorator(
                new MessaggioBase(messaggio))));

    // Il secondo utente riceve il prefisso
    observers.get(1).aggiorna(
        new PrefissoDecorator(
            new MessaggioBase(messaggio), "Decoratore Prefisso: "));

    // Tutti gli altri ricevono un messaggio base
    for (int i = 2; i < observers.size(); i++) {
      observers.get(i).aggiorna(
        new MessaggioBase(messaggio));
    }
  }
}