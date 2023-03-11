import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class MainLogger implements Logirable{
    @Override
    public void doLog(DataLoger model) {
        try (FileWriter writer = new FileWriter("log.csv", true)){
            writer.write(LocalDate.now() + ": ");
            writer.write(model.getMessage() + "\n");

        } catch (IOException ex){

        }

    }
}