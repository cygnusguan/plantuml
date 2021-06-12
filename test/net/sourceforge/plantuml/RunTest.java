package net.sourceforge.plantuml;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void main() throws IOException, InterruptedException {
        Run.main(new String[]{"-headless","/Users/cygan/Downloads/江阴POC准备-任务进度-2021-06-12.puml","-tsvg"});
    }
}