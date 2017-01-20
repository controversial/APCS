/******
 * <<< THIS CODE IS COMPLETE --- output of tester >>
 *
 * <<< mylist >>>
 * Zoe Bell belly12@gmail.com
 * Gladys Bell gbell23@gmail.com
 * Lisa Brown brownie21@gmail.com
 * Sandy Brown brwnsgr@gmail.com
 * Lori Hart lhart8726@gmail.com
 * Mary Jones sushigirl@gmail.com
 * Carla Lewis carlawl89@gmail.com
 * Suzzy Martin martini23@gmail.com
 * Arnold Smith bigA09823@gmail.com
 * Jim Smith jimbo7687@gmail.com
 *
 * <<< mylist >>>
 * Gladys Bell gbell23@gmail.com
 * Lisa Brown brownie21@gmail.com
 * Sandy Brown brwnsgr@gmail.com
 * Lori Hart lhart8726@gmail.com
 * Mary Jones sushigirl@gmail.com
 * Carla Lewis carlawl89@gmail.com
 * Suzzy Martin martini23@gmail.com
 * Arnold Smith bigA09823@gmail.com
 *
 * <<< otherlist >>>
 * Zoe Bell belly456@gmail.com
 * Sandy Brown brwnsgr@gmail.com
 * Chip Larr pizzaman@gmail.com
 * Suzzy Martin martini23@gmail.com
 * Lucy Morris icollectstuff@gmail.com
 * Borris Smith jimbo7687@gmail.com
 *
 * <<< mergedList >>>
 * Zoe Bell belly456@gmail.com
 * Gladys Bell gbell23@gmail.com
 * Sandy Brown brwnsgr@gmail.com
 * Lisa Brown brownie21@gmail.com
 * Lori Hart lhart8726@gmail.com
 * Mary Jones sushigirl@gmail.com
 * Chip Larr pizzaman@gmail.com
 * Carla Lewis carlawl89@gmail.com
 * Suzzy Martin martini23@gmail.com
 * Lucy Morris icollectstuff@gmail.com
 * Borris Smith jimbo7687@gmail.com
 * Arnold Smith bigA09823@gmail.com
 ****/
import java.util.*;
public class Tester {
    public static void main(String args[]) {
        AddressBook myList = new AddressBook();
        myList.addContact("Sandy","Brown","brwnsgr@gmail.com");
        myList.addContact("Jim","Smith","jimbo7687@gmail.com");
        myList.addContact("Arnold","Smith","bigA09823@gmail.com");
        myList.addContact("Mary","Jones","sushigirl@gmail.com");
        myList.addContact("Jim","Smith","jimbo7687@gmail.com");
        myList.addContact("Gladys","Bell","gbell23@gmail.com");
        myList.addContact("Lori","Hart","lhart8726@gmail.com");
        myList.addContact("Suzzy","Martin","martini23@gmail.com");
        myList.addContact("Lisa","Brown","brownie21@gmail.com");
        myList.addContact("Carla","Lewis","carlawl89@gmail.com");
        myList.addContact("Arnold","Smith","bigA09823@gmail.com");
        myList.addContact("Zoe","Bell","belly12@gmail.com");

        System.out.println("<<< mylist >>> \n" + myList);

        myList.removeContact("Jim","Smith");
        myList.removeContact("Pam","Harris");
        myList.removeContact("Zoe","Bell");

        System.out.println("<<< mylist >>> \n" + myList);

        AddressBook otherList = new AddressBook();
        otherList.addContact("Sandy","Brown","brwnsgr@gmail.com");
        otherList.addContact("Chip","Larr","pizzaman@gmail.com");
        otherList.addContact("Lucy","Morris","icollectstuff@gmail.com");
        otherList.addContact("Suzzy","Martin","martini23@gmail.com");
        otherList.addContact("Zoe","Bell","belly456@gmail.com");
        otherList.addContact("Borris","Smith","jimbo7687@gmail.com");

        System.out.println("<<< otherlist >>> \n" + otherList);

        myList. mergeBooks(otherList);
        System.out.println("<<< mergedList >>> \n" + myList);
    }
}
