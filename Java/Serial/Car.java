package Serial;
import java.io.*;
public class Car implements Serializable{
    private static final long serialVersionUID = 1L;
    private int year;
    private String make;


    public Car(String make, int year){
        this.make = make;
        this.year = year;
    }



    public static void main(String[] args) throws FileNotFoundException, IOException{
        Car carone  = new Car("Mazda RX7", 1999);
        Car cartwo  = new Car("Mitsubishi Eclipse GX '99", 1999);

        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


        objectOutputStream.writeObject(carone);
        objectOutputStream.writeObject(cartwo);


    }
    
}
