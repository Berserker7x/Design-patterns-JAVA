package stateofplane;

public interface Avion {
    //des operations tres courtes font que passer l objet dun etat a un autre//transition d etat 
    void sortirduguareage();
    void entreraugarage();
    void decoller();
    void atterir();
    void doActivity();//acitvite duree obsevable 
    
}
