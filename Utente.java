// Interfaccia Observer
interface Observer {
  void aggiorna(Messaggio msg);
}

public class Utente implements Observer {

  String nome;

  Utente(String nome) {
    this.nome = nome;
  }

  public void aggiorna(Messaggio msg) {
    System.out.println("L'utente " + this.nome + " Ha ricevuto il messagio:");
    System.out.println(msg.getMessaggio());
  }


}


