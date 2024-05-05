import java.util.Scanner;

public class CWH_Ch3_StringsMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type anything you want: ");
        String name = sc.nextLine();

        int value = name.length(); // length()
        System.out.println("\nThe length of the string you entered is: "+value);

        String lower = name.toLowerCase(); // toLowerCase()
        System.out.println("\nLower case: "+lower);

        String upper = name.toUpperCase(); // toUpperCase()
        System.out.println("Upper case: "+upper);




        System.out.print("\nEnter the start index and end index: ");
        int Sidx = sc.nextInt(), Eidx = sc.nextInt();
        String indexedStrTillEnd  = name.substring(Sidx); // substring(index value)
        System.out.println("Indexed string till end: "+indexedStrTillEnd);
        String startEndIndexstring = name.substring(Sidx, Eidx); // substring(start index, end index)
        System.out.println("Indexed string form start index till index before the end index: "+startEndIndexstring);




        System.out.print("\nEnter old and new character respectively: ");
        char oldChar = sc.next().charAt(0), newChar = sc.next().charAt(0);
        String replacedStringChar = name.replace(oldChar, newChar); // replace(old char, new char)
        System.out.println("Replaced string (by character) is: "+replacedStringChar);
        System.out.print("Enter target and replacement string respectively: ");
        String tstr = sc.next(), rstr = sc.next();
        String replacedStringstr = name.replace(tstr, rstr); // replace(target string, replacemet string)
        System.out.println("Replaced string (by substring) is: "+replacedStringstr);





        System.out.print("\nEnter the character sequence you want to check for: ");
        String charseq = sc.next();
        System.out.println("Starts with the character sequence: "+name.startsWith(charseq)); // startswith(char/str)
        System.out.println("Ends with the character sequence: "+name.endsWith(charseq)); // endswith(char/str)





        System.out.print("\nEnter the index for which you want the character: ");
        int charidx = sc.nextInt();
        System.out.println("The character at the given index is: "+name.charAt(charidx)); // cahrAt(index)





        System.out.print("\nEnter the sub string for which you want the index: ");
        String substr1 = sc.next();
        System.out.println("The first occurance of the substring entered is: "+name.indexOf(substr1)); // indexOf(string)
        System.out.println("The last occurance of the substring entered is: "+name.lastIndexOf(substr1)); // lastIndexOf(string)





        System.out.print("Enter the sub string and the index form which you want the index: ");
        String substr2 = sc.next();
        int formalIdx = sc.nextInt();
        System.out.println("The first occurance of the substring entered is: "+name.indexOf(substr2, formalIdx)); // indexOf(str,index)
        System.out.println("The last occurance of the substring entered is: "+name.lastIndexOf(substr2, formalIdx)); // lastIndexOf(str, index)





        System.out.print("\nEnter the string to check whether it is equal to the one you entered first: ");
        String newName = sc.next();
        System.out.println("Not ignoring the case: "+name.equals(newName)); // equals(str)
        System.out.println("After ignoring the case: "+name.equalsIgnoreCase(newName)); // equalsIgnoreCase(str)






        String nonTrimmedString = "        Harry is a good boy        ";
        System.out.println("\nNon trimmed string is: "+nonTrimmedString);
        String trimmedString = nonTrimmedString.trim(); // trim()
        System.out.println("Trimmed string is: "+trimmedString);
    }
}
