// Interfaccia Observer
interface Observer {
  void aggiorna(Messaggio msg);
}

public class Utente extends DecoratoreMessaggioAstratto implements Observer {

  String nome;
  //Messaggio tipoMessaggio;

  Utente(String nome, Messaggio messaggio) {
    super(messaggio);
    this.nome = nome;
    //this.tipoMessaggio = tipoMessaggio;
  }

  @Override
  public String getMessaggio() {
    return messaggio.getMessaggio();
  }

  public void aggiorna(Messaggio msg) {
    //tipoMessaggio.setMessaggio(msg);
    System.out.println("L'utente " + this.nome + " ha ricevuto il messagio:");
    System.out.println(msg.getMessaggio());
  }


}

/*
Public abstract class UserDecorator implements Observer {
    protected Observer utenteDecorato;

    public UserDecorator(Observer utente) {
        this.utenteDecorato = utente;
    }

    public abstract void update(String messaggio);  // da implementare nei sottotipi
}
- Concetti:
È un decoratore astratto.

Riceve un oggetto Observer (es: User) da decorare.

Permette di estendere dinamicamente il comportamento di update().
 */


