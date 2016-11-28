public class Friend
{
    private String name;
    private String email;
    Friend friend1;
    Friend friend2;
    Friend friend3;

    public Friend(String n, String e)  {
        name = n; 
        email = e;
        friend1 = null;
        friend2 = null;
        friend3 = null;
    }

    /** <<<< --- COMPLETE THIS METHOD --- >>>>
     * 
     * This method finds the position of 'fnd' on the 
     * current friends list.  It then swaps that friend 
     * with the friend at position friend1.
     * 
     * It then finds the 'this' friend on 'fnd's friend 
     * list and swaps that 'this' with the friend at 
     * position friend1.
     * 
     */ 
    public void bestFriend(Friend fnd) {
        if (this.friend1 != fnd && this.friend2 != fnd && this.friend3 != fnd) return;
        if (this.friend1 == fnd) {
            fnd.bestFriend(this);
            return;
        } else if (this.friend2 == fnd) {
            Friend swap = this.friend1;
            this.friend1 = this.friend2;
            this.friend2 = swap;
        } else if (this.friend3 == fnd) {
            Friend swap = this.friend1;
            this.friend1 = this.friend3;
            this.friend3 = swap;
        }
        fnd.bestFriend(this);
      }

     /** <<<< --- COMPLETE THIS METHOD --- >>>>
     * The toString method returns a formatted string with a friends
     * name, email, and the list of names of up to 3 friends. 
     */  
    public String toString() {
        return this.name + " (" + this.email + ") " + "\nFriends:\n  " + 
               (this.friend1 == null ? "" : (this.friend1.name + "\n  ")) + 
               (this.friend2 == null ? "" : (this.friend2.name + "\n  ")) +
               (this.friend3 == null ? "" : (this.friend3.name + "\n  "));
    }

    /** 
     * <<<< This code IS complete - do not change it >>>>
     * Tester for the Friend class
     */
    public static void main(String[] args)
    {
        Friend c1 = new Friend("Kenny Bania", " Ovaltine376@yahoo.com");
        Friend c2 = new Friend("Jake Jarmel", "SniffingAccountant812.gmail.com");
        Friend c3 = new Friend("Sally Weaver", "LifeOnDList@aol.com");
        Friend c4 = new Friend("Jack Klompus", "CaddieMan@gmail.com");
        c1.friend1 = c2;
        c1.friend2 = c3;
        c1.friend3 = c4;
        c2.friend1 = c1;
        c2.friend2 = c4;
        c2.friend3 = c3;
        c3.friend1 = c1;
        c3.friend2 = c2;
        c4.friend1 = c1;
        c4.friend2 = c2;
        System.out.println(c1); 
        System.out.println(c2); 
        System.out.println(c3); 
        System.out.println(c4); 
        System.out.println("\n --- " + c2.name + " becomes best friends with " + 
                            c3.name + " --- "); 
        c2.bestFriend(c3);
        System.out.println(c2); 
        System.out.println(c3); 
    }
}
