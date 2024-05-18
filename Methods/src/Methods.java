import java.util.Arrays;
import java.util.List;

public class Methods {
    public static void main(java.lang.String[] args) {
      String name = "Ryan Gosling Gangster  ";

      System.out.println("Hello, " + name + "!");
      System.out.println(name.toUpperCase());
      System.out.println(name.toLowerCase());
      System.out.println(name.length());
      System.out.println(name.charAt(2));
      System.out.println(name.indexOf("G"));
      System.out.println(name.indexOf("G", 6));
      System.out.println(name.lastIndexOf("G"));
      System.out.println(name.substring(5));
      System.out.println(name.substring(5, 12));
      System.out.println(name.replace("Gangster", "Gangsta"));
      System.out.println(name.startsWith("Ryan"));
      System.out.println(name.endsWith("Gangster"));
      System.out.println(name.contains("Gosling"));
      System.out.println(name.equals("Ryan Gosling Gangster"));
      System.out.println(name.equalsIgnoreCase("ryan gosling gangster  "));
      System.out.println(name.trim());
      System.out.println(name.isEmpty());
      System.out.println(name.concat("Gangster"));

      String[] arr1 = {"chicken", "bacon", "beef"};
      List<String> list =  Arrays.asList(arr1);

      int[] arr2 = new int[5];
      Arrays.fill(arr2, 5);

      for (int i : arr2) {
        System.out.println("Fill method: " + i);
      }

      int arr3[] = new int[5];
      int cloneArr[] = Arrays.copyOf(arr3, arr3.length);

      cloneArr[2] = 47;

      for (int i : cloneArr) {
        System.out.println("Cloned arr: " + i);
      }

      for (int i : arr3) {
        System.out.println("Arr3: " + i);
      }

      System.out.println(Arrays.equals(arr3, cloneArr));

      int[] numbers = {3, 1, 5, 6, 2};

      Arrays.sort(numbers);
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.binarySearch(numbers, 5));

      System.out.println("Filtering...");
      int[] filteredArr = Arrays.stream(numbers)
              .filter(n -> n >= 5)
              .map(n -> n * 2)
//              .reduce(0, (total, n) -> total + n)
              .toArray();

//      System.out.println(filteredArr);
      System.out.println(Arrays.toString(filteredArr));

    }
}