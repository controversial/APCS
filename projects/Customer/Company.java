public class Company
{
    // fills result with customers merged from list1 and list2
    // result contains no duplicates and is sorted order
    // precondition:
    //      result.length > 0;
    //      list1.length >= result.length;
    //      list2.length >= result.length;
    //      list1 and list2 contains no duplicates;
    //
    // postcondition: list1, list2 are not modified
    public static void prefixMerge(Customer[] list1, Customer[] list2,
                                   Customer[] result)
    {
        int index1 = 0;
        int index2 = 0;
        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            Customer a = list1[index1];
            Customer b = list2[index2];
            if (a.compareCustomer(b) < 0) {
                result[resultIndex] = a;
                index1++;
            } else if (a.compareCustomer(b) > 0) {
                result[resultIndex] = b;
                index2++;
            } else { // same customer
                result[resultIndex] = a;
                index1++; index2++;
            }
        }
    }
}
