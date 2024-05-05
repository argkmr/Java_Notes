abstract class PhoneAgain{
    int yearMade;
    String name;

    // So, abstract methods is nothing but just an overview for the future methods to be implemented
    abstract void getyear();
    abstract void getName();
    abstract void on();
    abstract void call();

//    public void hey(); here it is an error cuz either you declear it as abstract or you define
//    the body for the method, like:

    void greet(){ System.out.println("Hey how are you??"); }
}

class FeaturePhoneAgain extends PhoneAgain{

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

/* IMPORTANT NOTE:

Now if I make a class which inherits the Phone class and do not override all the abstract methods
then it will be an error. So if I am inheriting an abstract class I must override all the
abstract methods, otherwise you have to make that inherited class also an abstract class.

class Error extends PhoneAgain{
    void greet(){
        System.out.println("They are not going to the shoping so i will go");
    }

    @Override
    void getyear(){
        System.out.println("I don't know anything about the year");
    }
}
*/

class SmartPhoneAgain extends PhoneAgain{ // This class is perfectly fine as it has overrided all the abstract methods

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


public class CWH_Ch11_01_AbstractMethodsAndAbstractClass {
    public static void main(String[] args) {

// PhoneAgain pa1 = new PhoneAgain(); Error: You can't instantiate an object of an abstract class

        PhoneAgain pa = new FeaturePhoneAgain();
        pa.getyear();
        pa.getName();
        pa.on();
        pa.call();

        System.out.println();

        PhoneAgain pa2 = new SmartPhoneAgain();
        pa2.getyear();
        pa2.getName();
        pa2.on();
        pa2.call();
//        pa2.music();   Yes here it is error as mentioned earlier in dynamic dispatch file
//        pa2.camera();
//        pa2.pubg();

        System.out.println();

//        So yes if you want to make your smartphone to play music, capture some pics and also 
//        play pubg on it you need to make the object of the smartphone class explicitly.

        SmartPhoneAgain spa = new SmartPhoneAgain();
        spa.getyear();
        spa.getName();
        spa.on();
        spa.call();
        spa.music();
        spa.camera();
        spa.pubg();

/* SO BASICALLY:

1. YOU MUST OVERRIDE ALL THE ABSTRACT METHODS OF THE ABSTRACT CLASS. THOSE METHODS WHICH
   ARE NOT ABSTRACT THEY ARE ON YOUR CHOICE WEHTER YOU WANT THEM TO OVERRIDE OR NOT BUT YES THEY WILL BE INHERITED FOR SURE (OBVIOUSLY)

2. IF YOU HAVE MADE A METHOD INSIDE AN ABSTRACT CLASS AND YOU HAVE NOT PROVIDED ANY BODY TO IT,THEN IT IS AN ERROR. EITEHR YOU DEFINE THE METHOD OR YOU MAKE THAT METHOD AN ABSTACT METHOD

3.  IF YOU ARE NOT OVERRIDING ALL THE ABSTRACT METHODS AND OVERRIDING PARTIALLY OR NONE, IN THAT CASE YOU HAVE TO MAKE THE CLASS ABSTRACT TO WHICH YOU ARE INHERITING THE PARENT CLASS.

4.  YOU CAN NOT INSTANTIATE THE OBJECT OF THE ABSTRACT CLASS BUT YES YOU CAN TAKE THE REFRENCE OF THE ABSTRACT CLASS AND MAKE THE OBJECT OF ANY OF THE INHERITED CLASS, JUST LIKE WE DID ABOVE.

 */

    }
}
