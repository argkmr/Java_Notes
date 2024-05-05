interface camera{
    void takeSnap();
    void recordVideo();
}

interface wifi{
    String [] getNetwork();
    void connectToNetwork();

}

class cellPhone{
    void callNumber(int number){ System.out.println("Calling...."+number); }
    void endCall(){ System.out.println("The call has been ended...."); }
}

class MySmartPhone extends cellPhone implements camera, wifi{
    public void takeSnap(){ System.out.println("Taking snap 3..2..1....."); }
    public void recordVideo(){ System.out.println("Recording video....."); }
    public String [] getNetwork(){
        String [] networks = {"Harry", "Tony", "Jarvis", "Virus"};
        return networks;
    }
    public void connectToNetwork(){ System.out.println("Connecting to the network please wait...."); }
}

public class CWH_Ch11_03_InterfaceAsMultipleInheritance {
    public static void main(String[] args) {

        MySmartPhone msp = new MySmartPhone();
        String [] netlst = msp.getNetwork();
        for (String n:netlst) {
            System.out.println(n);
        }
        msp.connectToNetwork();
    }
}
