package chainofresp;

public class YoutubeHandler implements Ihandler {

    Ihandler ihandler;
    @Override
    public void SetNextHandler(Ihandler ihandler) {
        // TODO Auto-generated method stub
        ihandler=ihandler;
      
    }

    @Override
    public void handleLink(Video video) {
        // TODO Auto-generated method stub
        if(video.getLink().contains("youtube")){
            System.out.println("Hey i m youtube i can handle it ");
        }
        else{
            System.out.println("Im youtube sorry i cant handle it i ll passe it to my next friend");
            ihandler.handleLink(video);

        }
       
    }
    
}
