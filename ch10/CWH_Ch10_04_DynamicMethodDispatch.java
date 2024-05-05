class Phone{
    int yearMade;
    String name;

    void getyear(){
        System.out.println("The year of manufacture is ....");
    }

    void getName(){
        System.out.println("The name of the phone is ....");
    }

    void on(){
        System.out.println("Switch on the Phone");
    }

    void call(){
        System.out.println("Calling ....");
    }

}

class FeaturePhone extends Phone{

    @Override
    void getyear(){
        System.out.println("The year of manufacture is 2005");
    }

    @Override
    void getName(){
        System.out.println("The name of the model is Nokia3310");
    }

    @Override
    void on(){
        System.out.println("Switch on Nokia3310");
    }

    @Override
    void call(){
        System.out.println("Calling from Nokia3310");
    }
}

class SmartPhone extends Phone{

    @Override
    void getyear(){
        System.out.println("The year of manufacture is 2019");
    }

    @Override
    void getName(){
        System.out.println("The name of the model is SamsungM20");
    }

    @Override
    void on(){
        System.out.println("Switch on SamsungM20");
    }

    @Override
    void call(){
        System.out.println("Calling from SamsungM20");
    }

    void music(){
        System.out.println("Play music");
    }

    void camera(){
        System.out.println("Take pictures in 4K");
    }

    void pubg(){
        System.out.println("Launch PUBG");
    }
}

public class CWH_Ch10_04_DynamicMethodDispatch {
    public static void main(String[] args) {

        // This is allowed
        Phone ph = new FeaturePhone();
        /* What it means is that we took the refrence of the Phone class but we made the object
        of FeaturePhone class Similarly */
        Phone ph2 = new SmartPhone();

        ph.getName();
        ph.getyear();
        ph.call();
        ph.on();
//        ph.music();   These are errors as, yes feature phones are phones but they are not
//        ph.camera();  smart phones, that's why they can not support the features of
//        ph.pubg();    smart phones. The other reason is mention below which is the actual one ;)

        System.out.println();

        ph2.getName();
        ph2.getyear();
        ph2.call();
        ph2.on();
//        ph2.music();   Yes, these are also errors because the refrence is phone
//        ph2.camera();  and in phone there are no such methods like music, camera and pubg
//        ph2.pubg();

        System.out.println();

//        So in ordre to access the features of the smartphone you need to make it's object
//        taking the refrence of the smartphone only

        SmartPhone sm = new SmartPhone();
        sm.getName();
        sm.getyear();
        sm.call();
        sm.on();
        sm.music();
        sm.camera();
        sm.pubg();

    }
}
