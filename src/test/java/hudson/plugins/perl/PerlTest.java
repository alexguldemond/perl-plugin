package hudson.plugins.perl;

import hudson.model.FreeStyleProject;
import org.jvnet.hudson.test.HudsonTestCase;

/**
 * @author Kohsuke Kawaguchi
 */
public class PerlTest extends HudsonTestCase {
    public void testConfigRoundtrip() throws Exception {

        FreeStyleProject p = createFreeStyleProject();
        Perl before = new Perl("print 5");
        p.getBuildersList().add(before);

        configRoundtrip(p);

        Perl after = p.getBuildersList().get(Perl.class);

        assertNotSame(before,after);
        assertEqualDataBoundBeans(before,after);

        assertBuildStatusSuccess(p.scheduleBuild2(0));
    }
}
