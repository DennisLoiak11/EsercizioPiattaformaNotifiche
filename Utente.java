// Interfaccia Observer
interface Observer {
  void update(String message);
}

public class Utente implements Observer {

  String nome;

  Utente(String nome) {
    this.nome = nome;
  }

  public void update(String message) {
    System.out.println("L'utente " + this.nome + " Ha ricevuto il messagio:");
    System.out.println(message);
  }


}

/*
Utente Pippo = new Utente("Pippo");
Utente 


 */


