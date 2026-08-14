import java.lang.annotation.Annotation;
@interface About{
  String Author();
  String BookName();
  String PublishDate();
  String version();
  //to provide by default
  String date() default "10";
}

@About(Author = "Mohit",BookName="Java",PublishDate = "20-10-2023",version = "1.O")
public class BuildAno {
  @About(Author = "Mohit",BookName="Java",PublishDate = "20-10-2023",version = "1.O")
  int cnt=0;
  public static void main(String[] args){
    System.out.println("Hello");
  }
}
