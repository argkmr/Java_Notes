package folder1.folder2;
import folder1.folder2.folder3.ThreeLevelPackage;

class subclass extends ThreeLevelPackage{
    public void vals(){
        //System.out.println(a); --> error: Default
        System.out.println(b);
    }

}

public class Access{
    public static void main(String[] args){
        subclass s = new subclass();
        s.vals();
    }
}