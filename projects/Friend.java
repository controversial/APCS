/****
 * Class Friend has a name, email address,
 * and up to 3 friends (other Friend objects)
 *
 * Below is the expected output of the complete program
 * -----------------------------------------------------
 * Name: Kenny Bania, Email: Ovaltine376@yahoo.com
 *  SueEllen Mischke
 *  Sally Weaver
 *  Jake Jarmel
 *
 * Name: Jake Jarmel, Email: SniffingAccountant812.gmail.com
 *  Sally Weaver
 *  SueEllen Mischke
 *  Newman
 *
 * Name: Sally Weaver, Email: LifeOnDList@aol.com
 *  SueEllen Mischke
 *  Jack Klompus
 *  Jake Jarmel
 *
 * Name: Jack Klompus, Email: CaddieMan@gmail.com
 *  Newman
 *  Sally Weaver
 *
 * Name: SueEllen Mischke, Email: CandieBarGoddess@yahoo.com
 *  J Peterman
 *  Newman
 *  David Puddy
 *
 * Name: David Puddy, Email: GreaseMonkey1@gmail.com
 *  Newman
 *  SueEllen Mischke
 *
 * Name: Newman, Email: EvilGenius@gmail.com
 *  J Peterman
 *  David Puddy
 *  Jack Klompus
 *
 * Name: J Peterman, Email: worldTraveler@gmail.com
 *  Newman
 *  SueEllen Mischke
 *
 * Friends of Kenny Bania's friends are
 *  J Peterman
 *  Newman
 *  David Puddy
 *  SueEllen Mischke
 *  Jack Klompus
 *  Jake Jarmel
 *  Sally Weaver
 *  SueEllen Mischke
 *  Newman
 *
 * Friends of SueEllen Mischke's friends are
 *  Newman
 *  SueEllen Mischke
 *  J Peterman
 *  David Puddy
 *  Jack Klompus
 *  Newman
 *  SueEllen Mischke
 *
 * Mutual friends of Kenny Bania and Jake Jarmel
 * SueEllen Mischke
 * Sally Weaver
 *
 * Mutual friends of Sally Weaver and Newman
 * Jack Klompus
 *
 ***/
public class Friend
{
    private String name;
    private String email;
    Friend friend1;
    Friend friend2;
    Friend friend3;

    /**
     *  Construct a Friend
     */
    public Friend(String n, String e)  {
        name = n;
        email = e;
        friend1 = null;
        friend2 = null;
        friend3 = null;
    }

    /**
     * Add a new friend to the list as follows.
     *   1) Check to make sure friend is not already on the list.
     *   2) If not already on the list the new friend gets added as
     *      friend1, the previous friend1 becomes friend2,
     *      and friend2 is moved down the list to friend3.
     *   3) Adds "this" Friend to fnd's friends list,
     *      following rules 1 and 2 above.
     */
    public void addFriend(Friend fnd) {
        String n = fnd.getName();
        if ((this.friend1 == null || !n.equals(this.friend1.getName())) &&
                (this.friend2 == null || !n.equals(this.friend2.getName())) &&
                (this.friend3 == null || !n.equals(this.friend3.getName()))) {
            this.friend3 = this.friend2;
            this.friend2 = this.friend1;
            this.friend1 = fnd;
            fnd.addFriend(this);
        }
    }

    /**
     * Return a list of the names of all friends:
     *  friend1's name
     *  friend2's name
     *  friend3's name
     */
    public String getFriends() {
        if (this.friend3 != null) {
            return "  " + this.friend1.getName() + "\n  " + this.friend2.getName() + "\n  " + this.friend3.getName();
        } else if (this.friend2 != null) {
            return "  " + this.friend1.getName() + "\n  " + this.friend2.getName();
        } else if (this.friend1 != null) {
            return "  " + this.friend1.getName();
        } else {
            return "(no friends)";
        }
    }

    /**
     * Return a list of the names of all of the friends of friends
     * (the same name repeated is ok)
     * Hint: use the getFriends method you already wrote
     */
    public String friendsOfFriends() {
        return this.friend1.getFriends() + "\n" + this.friend2.getFriends() + "\n" + this.friend3.getFriends();
    }

    /**
     * Return a list of the names of friends that this
     * Friend and fnd have in common
     */
    public String getFriendsInCommon(Friend fnd) {
        String out = "\n  ";
        if (this.getFriends().contains(fnd.friend1.getName())) out += fnd.friend1.getName() + "\n  ";
        if (this.getFriends().contains(fnd.friend2.getName())) out += fnd.friend2.getName() + "\n  ";
        if (this.getFriends().contains(fnd.friend3.getName())) out += fnd.friend3.getName() + "\n  ";
        return out.substring(0, out.length()-3);
    }

    /**
     * Return information about the Friend:
     * name, phone number, and list of friends names
     */
    public String toString() {
        return this.name + " (" + this.email + ")\n" + this.getFriends();
    }

    public String getName() {
        return name;
    }

    /***********************************************************
     <<< the main method is complete and tests the above code >>>
     ************************************************************/
    public static void main(String[] args) {
        Friend c1 = new Friend("Kenny Bania","Ovaltine376@yahoo.com");
        Friend c2 = new Friend("Jake Jarmel","SniffingAccountant812.gmail.com");
        Friend c3 = new Friend("Sally Weaver","LifeOnDList@aol.com");
        Friend c4 = new Friend("Jack Klompus","CaddieMan@gmail.com");
        Friend c5 = new Friend("SueEllen Mischke","CandieBarGoddess@yahoo.com");
        Friend c6 = new Friend("David Puddy","GreaseMonkey1@gmail.com");
        Friend c7 = new Friend("Newman","EvilGenius@gmail.com");
        Friend c8 = new Friend("J Peterman","worldTraveler@gmail.com");
        Friend c9 = new Friend("Crazy Joe Davola","PagliacciCrazy.gmail.com");

        c1.addFriend(c2);
        c1.addFriend(c3);
        c1.addFriend(c5);

        c2.addFriend(c7);
        c2.addFriend(c5);
        c2.addFriend(c3);

        c3.addFriend(c4);
        c3.addFriend(c5);

        c5.addFriend(c6);
        c5.addFriend(c7);
        c5.addFriend(c8);

        c7.addFriend(c4);
        c7.addFriend(c6);
        c7.addFriend(c8);

        /**
         * print out information about customers
         */
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);

        System.out.println("\nFriends of " + c1.getName() +
                "'s friends are \n" + c1.friendsOfFriends());

        System.out.println("\nFriends of " + c5.getName() +
                "'s friends are \n" + c5.friendsOfFriends());

        System.out.println("\nMutual friends of " + c1.getName() +
                " and " + c2.getName() + c1.getFriendsInCommon(c2));

        System.out.println("\nMutual friends of " + c3.getName() +
                " and " + c7.getName() + c3.getFriendsInCommon(c7));
    }
}
