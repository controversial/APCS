import java.util.Arrays;
/****
 * <<< This code is complete >>>
 *
 * Below is the expected output. Note that Harding and Polk both
 * have November 2nd birthdays so are sorted by last name.
 *
 * 0)Millard Fillmore: January 7, 1800
 * 1)Richard M. Nixon: January 9, 1913
 * 2)William McKinley: January 29, 1843
 * 3)Franklin D. Roosevelt: January 30, 1882
 * 4)Ronald Reagan: February 6, 1911
 * 5)William Henry Harrison: February 9, 1773
 * 6)Abraham Lincoln: February 12, 1809
 * 7)George Washington: February 22, 1732
 * 8)Andrew Jackson: March 15, 1767
 * 9)James Madison: March 16, 1751
 * 10)Grover Cleveland: March 18, 1837
 * 11)John Tyler: March 29, 1790
 * 12)Thomas Jefferson: April 13, 1743
 * 13)James Buchanan: April 23, 1791
 * 14)Ulysses S. Grant: April 27, 1822
 * 15)James Monroe: April 28, 1758
 * 16)Harry S Truman: May 8, 1884
 * 17)John Kennedy: May 29, 1917
 * 18)George H. W. Bush: June 12, 1924
 * 19)Calvin Coolidge: July 4, 1872
 * 20)George W. Bush: July 6, 1946
 * 21)John Quincy Adams: July 11, 1767
 * 22)Gerald R. Ford: July 14, 1913
 * 23)Barack Hussein Obama: August 4, 1961
 * 24)Herbert Hoover: August 10, 1874
 * 25)William J. Clinton: August 19, 1946
 * 26)Benjamin Harrison: August 20, 1833
 * 27)Lyndon B. Johnson: August 27, 1908
 * 28)William Howard Taft: September 15, 1857
 * 29)Jimmy Carter: October 1, 1924
 * 30)Rutherford B. Hayes: October 4, 1822
 * 31)Chester A. Arthur: October 5, 1829
 * 32)Dwight D. Eisenhower: October 14, 1890
 * 33)Theodore Roosevelt: October 27, 1858
 * 34)John Adams: October 30, 1735
 * 35)Warren G. Harding: November 2, 1865
 * 36)James K. Polk: November 2, 1795
 * 37)James A. Garfield: November 19, 1831
 * 38)Franklin Pierce: November 23, 1804
 * 39)Zachary Taylor: November 24, 1784
 * 40)Martin VanBuren: December 5, 1782
 * 41)Woodrow Wilson: December 28, 1856
 * 42)Andrew Johnson: December 29, 1808
 *
 ***/
public class SortingPresidents
{
    public static void main(String[] args)
    {

        /**
         * array of all presidents with names and birthdays
         */
        President[] pres = new President[43];
        pres[0] = new President("George", "Washington", "February", 22, 1732);
        pres[1] = new President("John", "Adams", "October", 30, 1735);
        pres[2] = new President("Thomas", "Jefferson", "April", 13, 1743);
        pres[3] = new President("James", "Madison", "March", 16, 1751);
        pres[4] = new President("James", "Monroe", "April", 28, 1758);
        pres[5] = new President("John Quincy", "Adams", "July", 11, 1767);
        pres[6] = new President("Andrew", "Jackson", "March", 15, 1767);
        pres[7] = new President("Martin", "VanBuren", "December", 5, 1782);
        pres[8] = new President("William Henry", "Harrison", "February", 9, 1773);
        pres[9] = new President("John", "Tyler", "March", 29, 1790);
        pres[10] = new President("James K.", "Polk", "November", 2, 1795);
        pres[11] = new President("Zachary", "Taylor", "November", 24, 1784);
        pres[12] = new President("Millard", "Fillmore", "January", 7, 1800);
        pres[13] = new President("Franklin", "Pierce", "November", 23, 1804);
        pres[14] = new President("James", "Buchanan", "April", 23, 1791);
        pres[15] = new President("Abraham", "Lincoln", "February", 12, 1809);
        pres[16] = new President("Andrew", "Johnson", "December", 29, 1808);
        pres[17] = new President("Ulysses S.", "Grant", "April", 27, 1822);
        pres[18] = new President("Rutherford B.", "Hayes", "October", 4, 1822);
        pres[19] = new President("James A.", "Garfield", "November", 19, 1831);
        pres[20] = new President("Chester A.", "Arthur", "October", 5, 1829);
        pres[21] = new President("Grover", "Cleveland", "March", 18, 1837);
        pres[22] = new President("Benjamin", "Harrison", "August", 20, 1833);
        pres[23] = new President("William", "McKinley", "January", 29, 1843);
        pres[24] = new President("Theodore", "Roosevelt", "October", 27, 1858);
        pres[25] = new President("William Howard", "Taft", "September", 15, 1857);
        pres[26] = new President("Woodrow", "Wilson", "December", 28, 1856);
        pres[27] = new President("Warren G.", "Harding", "November", 2, 1865);
        pres[28] = new President("Calvin", "Coolidge", "July", 4, 1872);
        pres[29] = new President("Herbert", "Hoover", "August", 10, 1874);
        pres[30] = new President("Franklin D.", "Roosevelt", "January", 30, 1882);
        pres[31] = new President("Harry S", "Truman", "May", 8, 1884);
        pres[32] = new President("Dwight D.", "Eisenhower", "October", 14, 1890);
        pres[33] = new President("John", "Kennedy", "May", 29, 1917);
        pres[34] = new President("Lyndon B.", "Johnson", "August", 27, 1908);
        pres[35] = new President("Richard M.", "Nixon", "January", 9, 1913);
        pres[36] = new President("Gerald R.", "Ford", "July", 14, 1913);
        pres[37] = new President("Jimmy", "Carter", "October", 1, 1924);
        pres[38] = new President("Ronald", "Reagan", "February", 6, 1911);
        pres[39] = new President("George H. W.", "Bush", "June", 12, 1924);
        pres[40] = new President("William J.", "Clinton", "August", 19, 1946);
        pres[41] = new President("George W.", "Bush", "July", 6, 1946);
        pres[42] = new President("Barack Hussein", "Obama", "August", 4, 1961);

        /**
         * sorts presidents by birthday, or by last name if same birthday
         */
        Arrays.sort(pres);

        /**
         * Prints out sorted list of presidents
         */
        for (int i=0; i<pres.length; i++) {
            System.out.println(i+")"+pres[i]);
        }
    }
}
