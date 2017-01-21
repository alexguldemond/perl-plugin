// CHECKSTYLE:OFF

package hudson.plugins.perl;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;

@SuppressWarnings({
    "",
    "PMD"
})
public class Messages {

    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Execute Perl script
     * 
     */
    public static String Perl_DisplayName() {
        return holder.format("Perl.DisplayName");
    }

    /**
     * Execute Perl script
     * 
     */
    public static Localizable _Perl_DisplayName() {
        return new Localizable(holder, "Perl.DisplayName");
    }

}
