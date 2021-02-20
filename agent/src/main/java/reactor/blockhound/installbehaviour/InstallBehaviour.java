package reactor.blockhound.installbehaviour;

public class InstallBehaviour implements BlockHoundInstallBehaviour {

    /**
     * Installs the agent and runs the instrumentation with help of an android strategy,
     * but only if BlockHound wasn't installed yet (it is global)
     */
    public void install() {

    }
}
