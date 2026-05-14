package impact.cli;

import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
        name = "impact-cli",
        mixinStandardHelpOptions = true,
        version = "impact-cli 1.0",
        description = "Prints impact.com / SaaSquatch.")
public class App implements Callable<Integer> {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {
        System.out.println("impact.com / SaaSquatch");
        return CommandLine.ExitCode.OK;
    }
}
