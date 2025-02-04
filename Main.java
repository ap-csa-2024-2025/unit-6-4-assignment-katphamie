import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = {3,4,5,6,3,3,6,3,4};

  }

  public static int countLength(String[] arr, int targetLength)
  {
    int counter = 0;
    for (int i=0;i<arr.length; i++)
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
    for (int i=0; i< arr.length; i++)
    {
      int elem = arr[i];
      for (int j=i+1;j<arr.length;j++)
      {
        if (arr[j] == elem)
        {
          return true;
        }
      }
    }
    return false;
  }

  public static int findMode(int[] arr)
  {
    int max = 0;
    int count = 0;
    int mode = arr[0];
    for (int i=0; arr.length; i++)
    {
      int target = arr[i];
      for (j=0;j < arr.length; j++)
      {
        if (arr[j] ==arr[i])
        {
          count++;
        }
        if (count > max)
        {
          max = count;
          mode = arr[i];
        }
      }
    }
    return mode;
  }
}
