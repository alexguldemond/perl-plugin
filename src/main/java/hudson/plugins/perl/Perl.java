package hudson.plugins.perl;

import hudson.Extension;
import hudson.FilePath;
import hudson.model.AbstractProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.tasks.CommandInterpreter;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Invokes the Perl interpreter and invokes the Perl script entered on the
 * hudson build configuration.
 * 
 * It is expected that the Perl interpreter is available on the system PATH.
 *
 */
public class Perl extends CommandInterpreter {
    @DataBoundConstructor
    public Perl(String command) {
        super(command);
    }

    @Override
    public String[] buildCommandLine(FilePath script) {
        return new String[]{"perl", script.getRemote()};
    }

    @Override
    protected String getContents() {
        return command;
    }

    @Override
    protected String getFileExtension() {
        return ".pl";
    }

    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {
        @Override
        public String getDisplayName() {
            return Messages.Perl_DisplayName();
        }

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> type) {
            return true;
        }
    }
}
