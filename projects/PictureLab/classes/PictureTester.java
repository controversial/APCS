package classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("images/pizza.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  } 
  
  public static void testNegate()
  {
    Picture beach = new Picture("images/haas.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("images/NPHS.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testMirrorVertical()
  {
    Picture m = new Picture("images/desert.jpg");
    m.explore();
    m.mirrorVertical();
    m.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture m = new Picture("images/kitten.jpg");
    m.explore();
    m.mirrorVerticalRightToLeft();
    m.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture m = new Picture("images/redMotorcycle.jpg");
    m.explore();
    m.mirrorHorizontal();
    m.explore();
  }
    
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture p = new Picture("images/swan.jpg");
    p.explore();
    p.edgeDetection(10);
    p.explore();
  }
  
    
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    
    testZeroBlue();
    testKeepOnlyBlue();
    testNegate();
    testGrayscale();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorTemple();
    testEdgeDetection();
  }
}