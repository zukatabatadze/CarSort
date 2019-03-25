import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarSort {
    public static void reader(String filePath) throws FileNotFoundException {
        List<Car> cars=new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try{
            String  s;
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(",");
                String model=tokens[0];
                String manufacturer=tokens[1];
                String transmission=tokens[2];
                String fuelType=tokens[3];
                String wheel=tokens[4];

                Car car=new Car(model,manufacturer,transmission,wheel,fuelType);
                cars.add(car);


            }
            System.out.println(cars);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}