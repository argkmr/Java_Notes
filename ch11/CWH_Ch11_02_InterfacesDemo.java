// everything inside the interface is public by default so mention or not does not matter
interface YouTube{

// Once created can not be modified, it's permanent. It is also not mandatory
    int videos_today = 4543;

// void greet(){ System.out.println("How you doin??"); } --> error, methods inside the interface can't have body
    void showFeed(int feedcout);
    void playVideo();
    void maxQulality(int qulality);
    void minVideoLenght(int minLength);

}

interface GoogleDrive{
    int max_space_GB = 15;
    void showFiles();
    void showFolder();
    void maxFileCount(int maxfile);
    void maxFolderCount(int maxfolder);
}


// So we saw that we can make multiple interfaces and implement all in a class, and that is the basic difference between the abstract class and the interfaces. You can not make multiple abstract classes.
class GoogleServices implements YouTube, GoogleDrive{
//    we can override the properties inside the interfaces here but it is not necessary
//    In all the methods we defined right now, the PUBLIC acess modifire is very important

    public void showFeed(int feedcout){
        System.out.println("Today's feed count was: "+feedcout);
    }
    public void playVideo(){
        System.out.println("The video is now playing, enjoy!");
    }
    public void maxQulality(int quality){
        System.out.println("The max video quality availabe is "+quality+"p");
    }
    public void minVideoLenght(int minLength){ System.out.println("Minimum video length allowed is "+minLength+" mins"); }

    public void showFiles(){
        System.out.println("The files are showign....");
    }
    public void showFolder(){
        System.out.println("The folders are showing....");
    }
    public void maxFileCount(int maxfile){
        System.out.println("The max files count for today was: "+maxfile);
    }
    public void maxFolderCount(int maxfolder){
        System.out.println("The max folder coutn for today was: "+maxfolder);
    }

}

public class CWH_Ch11_02_InterfacesDemo {
    public static void main(String[] args) {

//        We can use the interface as the refrence but we can not create its the object
        YouTube yt = new GoogleServices();

//        We can define and use the properties in the interface
        System.out.println("YouTube inteface attribute is running: "+yt.videos_today); // output:4543
//        We can't modify the properties of the interface
//        yt.videos_today = 34; --> error
//        But we can modify the properties of the interface in the class itself (Obvioulsy)

        yt.maxQulality(1080);
        yt.minVideoLenght(3);
        yt.showFeed(1500);
//        yt.maxFolderCount(45); --> error as yt is YouTube interface refrenced not GoogleDrive.
        yt.playVideo();

        System.out.println();

        GoogleDrive gd = new GoogleServices();
//        gd.maxQulality(720) --> error as gd is GoogleDrive interface refranced not YouTube
        gd.maxFileCount(5647);
        gd.maxFolderCount(234);
        gd.showFiles();
        gd.showFolder();
        System.out.println();

//        Now, the general way of making the object is also true (obviously)
        GoogleServices gs = new GoogleServices();
//        Now i can access any method I wish cuz now the object is of GoogleServices class and also refrnced
//        as GoogleServices
        gs.maxFileCount(5643);
        gs.playVideo();
        System.out.println("Modified propertiy via class: "+gs.videos_today); // Here the refrance is of GoogleServices that's why here the result is going to be 4543 only

//        gs.videos_today = 98;  No it is not allowed final value cannot be modified


/*        so the basic difference between the abstract classes and the interfaces is that:
            1. you can not make multiple abstract classes but interface you can.
            2. you can give the body of the method used inside the abstract class (only when the
               method is not marked abstract), but not in interface */

    }
}
