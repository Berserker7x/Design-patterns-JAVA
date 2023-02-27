package chainofresp;
// this is an exemple of a web apk that can downlowd links from different plateforms facebbok ,ig,...


public class Main {
    public static void main(String[] args) {
        Ihandler handler1=new YoutubeHandler();
        Ihandler handler2=new InsragramHandler();
        Ihandler handeler3=new FacebookHandler();
        Video video = new Video();
        String Link1="https://www.youtube.com/watch?v=IKRVX3c8HuU";
        String Link2="https://www.instagram.com/";
        String Link3="https://www.facebook.com/";

        video.setLink(Link2);

        handler1.SetNextHandler(handler2);
        handler2.SetNextHandler(handeler3);
        handeler3.handleLink(video);



    }
    
}
