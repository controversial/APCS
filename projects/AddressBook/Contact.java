/** <<< THIS CODE IS COMPLETE >>>
 *  a contact on an email list has a first name, last name,
 *  and email address.
 */
public class Contact
{
    private String firstName;
    private String lastName;
    private String email;

    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirst() { return firstName; }
    public String getLast() { return lastName; }
    public String getEmail()  { return email; }
}
