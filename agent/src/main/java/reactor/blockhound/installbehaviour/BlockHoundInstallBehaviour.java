package reactor.blockhound.installbehaviour;

/**
 * An interface for all BlockHound InstallBehaviour classes.
 * {@link BlockHoundInstallBehaviour#install()} Installs the
 * agent and runs the instrumentation, but only if BlockHound wasn't installed yet (it is global).
  */
public interface BlockHoundInstallBehaviour {

    /**
     * Installs the agent and runs the instrumentation, but only if BlockHound wasn't installed
     * yet (it is global)
     */
    public void install();


}
