package net.sourceforge.plantuml;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void main() throws IOException, InterruptedException {
        Run.main(new String[]{"-headless","/Users/cygan/Downloads/xxx.puml","-tsvg"});
    }
}