public class RouteCipher
{
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    /** Places a string into letterBlock in row-major order.
     * @param str the string to be processed
     * Postcondition:
     * if str.length() < numRows * numCols, "A" is placed in each unfilled cell
     * if str.length() > numRows * numCols, trailing characters are ignored
     */
    private void fillBlock(String str) {
        while (str.length() < numRows * numCols)
            str += 'A';

        int strIndex = 0;

        for (int row = 0; row < letterBlock.length; row++) {
            for (int col = 0; col < letterBlock[0].length; col++) {
                letterBlock[row][col] = str.substring(strIndex, strIndex + 1);
                strIndex++;
            }
        }
        printLetterBlock();
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     * Precondition: letterBlock has been filled
     * @return the encrypted string from letterBlock
     */
    private String encryptBlock()
    {
        String out = "";
        for (int col = 0; col < letterBlock[0].length; col++)
            for (int row = 0; row < letterBlock.length; row++)
                out += letterBlock[row][col];
        return out;
    }

    /** Encrypts a message.
     * @param message the string to be encrypted
     * @return the encrypted message;
     * if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message)
    {
        if (message.equals("")) return "";

        String out = "";
        for (int i = 0; i < message.length(); i += numRows * numCols) {
            fillBlock(message.substring(i, Math.min(i + numRows * numCols, message.length())));
            out += encryptBlock();
        }
        return out;
    }

    public void printLetterBlock() {
        for (int row = 0; row < letterBlock.length; row++) {
            for(int col = 0; col < letterBlock[0].length; col++) {
                System.out.print(letterBlock[row][col] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main (String[] args)
    {
        RouteCipher c = new RouteCipher();
        c.numRows = 2;
        c.numCols = 3;
        c.letterBlock = new String[c.numRows][c.numCols];
        System.out.println("[" + c.encryptMessage("Meet at midnight") +"]");
    }
}
