// creare decoratori per modificare il messaggio utente prima della stampa 
// timestamp, aggiunta maiuscolo minuscolo e aggiunta emoji e prefissi 
import java.time.LocalDateTime;
interface Messaggio {
    String getMessaggio();
}

class MessaggioBase {

    String messaggio;
    // costruttore 
      public MessaggioBase(String messaggio) {
        this.messaggio = messaggio;
      }

     String getMessaggio() {
        return this.messaggio;
    }
}


// decoratore astratto 

abstract class DecoratoreMessaggioAstratto {

    protected Messaggio messaggio; // wrap messaggio 

    public DecoratoreMessaggioAstratto(Messaggio messaggio)  {

        this.messaggio = messaggio; 
    }

     public abstract String getMessaggio();
    

    }

// decoratore concreto per timestamp 

class TimestampDecorator extends DecoratoreMessaggioAstratto {
    public TimestampDecorator(Messaggio messaggio) {
        super(messaggio);
    }

    public String getMessaggio() {
        return "[" + LocalDateTime.now() + "] " + messaggio.getMessaggio();
    }
}

// secondo decoratore uppercase

class MaiuscoloDecorator extends DecoratoreMessaggioAstratto {
    public MaiuscoloDecorator(Messaggio messaggio) {
        super(messaggio);
    }

    public String getMessaggio() {
        return messaggio.getMessaggio().toUpperCase();
    }
}

// terzo decoratore  minuscolo 

class MinuscoloDecorator extends DecoratoreMessaggioAstratto {
    public MinuscoloDecorator(Messaggio messaggio) {
        super(messaggio);
    }

    public String getMessaggio() {
        return messaggio.getMessaggio().toLowerCase();
    }
}
// decoratore emoji 
class EmojiDecorator extends DecoratoreMessaggioAstratto {
    public EmojiDecorator(Messaggio messaggio) {
        super(messaggio);
    }

    public String getMessaggio() {
        return "📩 " + messaggio.getMessaggio();
    }
}

// decoratore con prefisso 

class PrefissoDecorator extends DecoratoreMessaggioAstratto {
    private String prefisso;

    public PrefissoDecorator(Messaggio messaggio, String prefisso) {
        super(messaggio);
        this.prefisso = prefisso;
    }

    public String getMessaggio() {
        return prefisso + " " + messaggio.getMessaggio();
    }
}



 
