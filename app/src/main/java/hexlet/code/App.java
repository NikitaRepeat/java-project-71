package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

@CommandLine.Command(
        name = "gendiff",
        version = "2.0",
        mixinStandardHelpOptions = true,
        description = "Compares two configuration files and shows a difference.")

public final class App implements Callable {
    @Override
    public Integer call() throws Exception { // your business logic goes here...
        return null;
    }


    public static void main(String[] args) {
        new CommandLine(new App()).execute(args);
    }
}