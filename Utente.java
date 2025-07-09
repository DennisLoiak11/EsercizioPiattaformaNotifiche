// Interfaccia Observer
interface Observer {
  void aggiorna(String message);
}

public class Utente implements Observer {

  String nome;

  Utente(String nome) {
    this.nome = nome;
  }

  public void aggiorna(String message) {
    System.out.println("L'utente " + this.nome + " Ha ricevuto il messagio:");
    System.out.println(message);
  }


}


