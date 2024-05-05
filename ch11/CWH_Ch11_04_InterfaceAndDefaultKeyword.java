/* So from the concepts of interfaces we saw that if you are defining any methods inside the interface then
you have to implement those methods inside your class and this you have to do for each methods inside the interface.
Now let's imagine a situation in which you have so many interfaces and so many classes at the same time plus
you have so many methods as well in that senario if you wish to add some methods inside the interface then
you have to implement those methods inside the classes as well, this will become very tediouds and hectic.
That is why java provides a solution for this via using the default keyword. */

/* If you are using the default keyword in that case you need not go an implement the new methods you
defined inside the interface and you can access those methods directly from the main() using the objects.
 */

interface example{
    void method1();
    void method2();
    default void method3(){
        System.out.println("This method has been implemented using the default keyword....");
    }
//    default greet(); --> Once the keyword used you have to give the body

/* We can also make private methods as well but then we won't be able to use it as it is private so no use
    making any private methods inside the interface. You can use the private methods only via using them
    inside the default methods */
}

class defaultExample implements example{
    public void method1(){ System.out.println("This is method 1.."); }
    public void method2(){ System.out.println("This is mehthod 2.."); }
//    public void method3(){ System.out.println("This is overridden method 3...");} // default methods can also be overridden
}

public class CWH_Ch11_04_InterfaceAndDefaultKeyword {
    public static void main(String[] args) {

        defaultExample de = new defaultExample();
        de.method3();

    }
}
