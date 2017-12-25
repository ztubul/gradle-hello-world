package link.otomato.tutorials;

public class HelloGradle{

    public static void main( String[] args )
    {
        String name = "";
        if (args.length > 0)
        {
            name = capitalize(args[0]);
        }
        else
        {
            name = "Gradle";
        }
        System.out.println("Hello " + name +"!");
    }

    public static String capitalize( String name )
    {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }
}
