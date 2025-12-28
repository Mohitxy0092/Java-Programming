class Phone{
  public void Call(){
    System.out.println("Call");
  }
  public void Sms(){
    System.out.println("Sms");
  }
}
interface camera{
  void capture();
  void RecordVideo();
}
interface MusicPlayer{
  void play();
  void pause();
  void changeSong();
}

class SmartPhone extends Phone implements camera, MusicPlayer{
  public void VideoCall(){
    System.out.println("Video calling via smart phone....");
  }
  @Override
  public void capture(){
    System.out.println("Capturing image...");
  }
  @Override
  public void RecordVideo(){
    System.out.println("recording A video...");
  }
  @Override
  public void play(){
    System.out.println("Playing a music....");
  }
  @Override
  public void pause(){
    System.out.println("Music has been paused...");
  }
  @Override
  public void changeSong(){
    System.out.println("Song changed...");
  }
}

public class device{
  public static void main(String []args){
    SmartPhone s1= new SmartPhone();
    camera s=s1;
    s.capture();
  }
}