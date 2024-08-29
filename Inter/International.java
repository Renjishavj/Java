package Inter;
import java.util.Locale;
import java.util.ResourceBundle;

public class International {
    public static void main(String[] args) {
        // Set the default locale to US English
        Locale defaultLocale = Locale.US;
        // Create a Locale for French
        Locale frenchLocale = Locale.FRANCE;

        // Load resource bundles for both locales
        ResourceBundle bundleDefault = ResourceBundle.getBundle("Messages", defaultLocale);
        ResourceBundle bundleFrench = ResourceBundle.getBundle("Messages", frenchLocale);

        // Display messages in default locale (English)
        System.out.println("In English:");
        System.out.println(bundleDefault.getString("greeting"));
        System.out.println(bundleDefault.getString("inquiry"));
        System.out.println(bundleDefault.getString("farewell"));

        // Display messages in French locale
        System.out.println("\nIn French:");
        System.out.println(bundleFrench.getString("greeting"));
        System.out.println(bundleFrench.getString("inquiry"));
        System.out.println(bundleFrench.getString("farewell"));
    }
}
