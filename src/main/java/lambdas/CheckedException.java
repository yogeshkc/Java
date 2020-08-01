package lambdas;

import org.jooq.lambda.Unchecked;

import java.io.File;
import java.util.List;

public class CheckedException {
    private void checkedToUncheckedExample(List<File> files) {
//        files.forEach( f -> {
//            try {
//                f.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });

       files.forEach(Unchecked.consumer(File::createNewFile));
    }
}
