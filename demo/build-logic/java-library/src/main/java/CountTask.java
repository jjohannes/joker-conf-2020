import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

@CacheableTask
abstract public class CountTask extends DefaultTask {

    @InputFiles
    @PathSensitive(PathSensitivity.NAME_ONLY)
    abstract ConfigurableFileCollection getFilesToCount();

    @OutputFile
    abstract RegularFileProperty getCountTxt();

    @TaskAction
    public void count() throws IOException {
        Set<File> files = getFilesToCount().getAsFileTree().getFiles();

        FileWriter writer = new FileWriter(getCountTxt().get().getAsFile());
        writer.write("We have " + files.size() + " files.\n\n");
        for (File f: files) {
            writer.write(f.getName() + "\n");
        }
        writer.close();
    }
}
