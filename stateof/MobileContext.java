package stateof;
// hna kdefini curent state u tswitchi mn state l state 
public class MobileContext{

    private MoibleAlertState currentState;
    public MobileContext(){
        //default staate
        currentState=new Ringing();
    }
    public void setState(MoibleAlertState state){
        currentState=state;

    }
    public void alert(){
        currentState.alert();
    }


}