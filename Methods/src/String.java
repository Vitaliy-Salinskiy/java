public class String {
    public static void main(java.lang.String[] args) {
      java.lang.String name = "Ryan Gosling Gangster  ";

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

    }
}