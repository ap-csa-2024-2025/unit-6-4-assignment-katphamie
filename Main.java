import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int counter = 0;
    for (i = 0; i < arr.length; i++)
    {
      if (arr[i].length == targetLength)
      {
        counter++;
      }
    }
    return 0;
  }

  public static int indexOf(double[] arr, double target)
  {
    int i = 0;
    while (i < arr.length)
    {
      if (arr[i].length == target)
      {
        return i;
      }
      i++;
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (i=0; i < arr.length; i++)
    {
      int elem = arr[i];
      for (j = i; j < arr.length; j++)
      {
        if (arr[j] == elem)
        {
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    // replace with your code
    return null;
  }
}
