
/** <<< This Code Is Not Complete >>>
 * An AddressBook is a list of contacts in alphabetical order by last name.
 */
import java.util.*;

public class AddressBook {

    private ArrayList<Contact> list;

    public AddressBook() {
        list = new ArrayList<Contact>();
    }

    /**  <<< Code Not Complete >>>
     * 1) checks to see if first and last name is on list
     * 2) if not already on the list the new contact is added
     * 3) maintains the alphabetical order of the list
     */
    public void addContact(String first, String last, String email) {
        for (Contact i : list) {
            if (i.getFirst() == first && i.getLast() == last) {
                return;
            }
        }
        for (int i=0; i<list.size()-1; i++) {
            Contact current = list.get(i);
            if (last.compareTo(current.getLast()) < 0) {
                list.add(i, new Contact(first, last, email));
                return;
            }
        }
        list.add(new Contact(first, last, email));
    }


    /** <<< Code Not Complete  >>>
     * looks for first and last name match and removes it if found
     */
    public void removeContact(String first, String last) {
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getFirst() == first && list.get(i).getLast() == last) {
                list.remove(i);
            }
        }
    }


    /** <<< Code Not Complete >>>
     * adds the contants from: AddressBook otherBook,
     * to: this AddressBook
     * maintains the alphabetical order and does not
     * add duplicates
     */
    public void mergeBooks(AddressBook otherBook) {
        ArrayList<Contact> otherList = otherBook.getList();
        for (Contact i : otherList) {
            this.addContact(i.getFirst(), i.getLast(), i.getEmail());
        }
    }

    /**
     * <<< Code Not Complete >>>
     * returns list of contacts: first name, last name, email address
     */
    public String toString() {
        String out = "";
        for (Contact i : this.list) {
            out += i.getFirst() + " " + i.getLast() + " (" + i.getEmail() + ")\n";
        }
        return out.substring(0, out.length() - 2) + "]";
    }

    public ArrayList<Contact> getList() {
        return this.list;
    }
}
