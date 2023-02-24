package stateof;

public class Main
{
    public static void main(String[] args) {
        MobileContext mobileContext=new MobileContext();
        mobileContext.alert();
        mobileContext.setState(new Silent());
        mobileContext.alert();
        mobileContext.setState(new Off());
        mobileContext.alert();
    }
}
