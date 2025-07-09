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
    for (Observer observer : observers) {
      observer.aggiorna(messaggio);
    }
  }
}