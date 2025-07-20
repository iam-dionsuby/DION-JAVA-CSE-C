class Box{
    double width;
    double height;
    double length;
}
public class  Volume{
    public static void main(String args[]){

     Box kBox=new Box();
     double volume;
    kBox.width=10;
    kBox.height=10;
    kBox.length=10;
    volume=kBox.height*kBox.width*kBox.length;

      System.out.println("The volume is "+volume);
    }
    


}