package chainofresp;

public interface Ihandler {
    void SetNextHandler(Ihandler ihandler);
    void handleLink(Video video);
    
}
