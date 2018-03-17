package HomeWorks.HomeWork8;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by MARIA on 24.10.17.
 */
public class FlowersSaver {
    private static final String FILE = "bouquet_data.txt";
    private static final String PATH = "HomeWorks/HomeWork8/" + FILE;


    static  void saveBouquet(List saveBouquet) {
        try {
            FileWriter writer = new FileWriter(PATH);
            writer.write(saveBouquet.toString());

//            for(List bouqeuetSave : saveBouquet )

            //

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
