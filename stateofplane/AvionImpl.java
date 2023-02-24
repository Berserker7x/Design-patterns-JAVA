package stateofplane;

public class AvionImpl implements Avion {
     private State state;
     public AvionImpl(){
        state=new EtatEnpiste(this);
     }

    @Override
    public void sortirduguareage() {
        // TODO Auto-generated method stub
        state.executeSortirduguareage();
        
    }

    @Override
    public void entreraugarage() {
        // TODO Auto-generated method stub
        state.executeEntreraugarage();
        
    }

    @Override
    public void decoller() {
        // TODO Auto-generated method stub
        state.executeDecoller();
        
    }

    @Override
    public void atterir() {
        // TODO Auto-generated method stub
        state.executeAtterir();
        
    }

    @Override
    public void doActivity() {
        // TODO Auto-generated method stub
        state.executeDoActivity();
        
    }
    //delegation des operation a ce state 
    abstract class State {
        protected AvionImpl avion;

        public State(AvionImpl avion){
            this.avion=avion;

        }
        //operation de transition d etat 
        abstract void executeSortirduguareage();
        abstract void executeEntreraugarage();
        abstract void executeDecoller();
        abstract void executeAtterir();
        abstract void executeDoActivity();
         

    }
    class EtatEnpiste extends State{
       

        public EtatEnpiste(AvionImpl avion) {
            super(avion);
        }

        @Override
        void executeSortirduguareage() {
            // TODO Auto-generated method stub
            System.out.println("impossible de sortir ");
            
        }

        @Override
        void executeEntreraugarage() {
            // TODO Auto-generated method stub
            System.out.println("piste au garage ");
            avion.state=new EtatAugarage(avion);
        }

        @Override
        void executeDecoller() {
            // TODO Auto-generated method stub
            System.out.println("piste au decolage ");
            avion.state=new EtatEnLair(avion);
        }

        @Override
        void executeAtterir() {
            
            // TODO Auto-generated method stub
            System.out.println("non je suis deja en piste");
            
        }

        @Override
        void executeDoActivity() {
            // TODO Auto-generated method stub
            System.out.println("activite de etat en piste ............100% ");
            
        }

    }
    class EtatAugarage extends State{
        public EtatAugarage(AvionImpl avion) {
            super(avion);
        }


        @Override
        void executeSortirduguareage() {
            // TODO Auto-generated method stub
            System.out.println("garage au piste ");
            avion.state=new EtatEnLair(avion);
            
        }

        @Override
        void executeEntreraugarage() {
            // TODO Auto-generated method stub
            System.out.println("je suis deja au garage non je peux pas ");
            
        }

        @Override
        void executeDecoller() {
            // TODO Auto-generated method stub
            System.out.println("impossible je suis au garage ");
            
        }

        @Override
        void executeAtterir() {
            // TODO Auto-generated method stub
            System.out.println("impossible je suis au garasge");
        }

        @Override
        void executeDoActivity() {
            // TODO Auto-generated method stub
              // TODO Auto-generated method stub
              System.out.println("activite de etat en garage ............100% ");
            
            
        }

    }
    class EtatEnLair extends State{
        public EtatEnLair(AvionImpl avion) {
            super(avion);
        }


        @Override
        void executeSortirduguareage() {
            // TODO Auto-generated method stub
            System.out.println("impossible de sortir  ");
            
        }

        @Override
        void executeEntreraugarage() {
            // TODO Auto-generated method stub
            System.out.println("impossible de entrer je suis en air  ");

            
        }

        @Override
        void executeDecoller() {
            // TODO Auto-generated method stub
            System.out.println("impossible de decoller je suis en air  ");
            
        }

        @Override
        void executeAtterir() {
            // TODO Auto-generated method stub
            System.out.println("air au piste ");
            avion.state=new EtatEnpiste(avion);
            
        }

        @Override
        void executeDoActivity() {
            // TODO Auto-generated method stub
            System.out.println("activite de etat en aire ............100% ");
            
        }

    }
    
    
}
