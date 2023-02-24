import stateofplane.Avion;
import stateofplane.AvionImpl;

public class Main {
    public static void main(String[] args) {
        Avion avion=new AvionImpl(); 
        avion.doActivity();
        avion.sortirduguareage();
        avion.entreraugarage();
    }
    
}
