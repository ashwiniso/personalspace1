package Serial;
import java.io.*;
public class Car implements Serializable{
    private static final long serialVersionUID = 1L;
    private int year;
    private String make;
    private transient String model;


    public Car(String make, int year, String model){
        this.make = make;
        this.year = year;
        this.model = model;
    }

    public String toString(){
        return "The car is made by " + make + ", in year = " + year + ",  of model = " + model;
    }



    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        Car mazda  = new Car("Mazda", 1999, "RX7");
        Car mitsu  = new Car("Mitsubishi", 1999, "Eclipse GX '99");

        FileOutputStream fileOutputStream = new FileOutputStream("cars.png");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


        objectOutputStream.writeObject(mazda);
        objectOutputStream.writeObject(mitsu);



        //desiarlization
        FileInputStream fileInputStream = new FileInputStream("cars.png");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car mazdaCopy = (Car) objectInputStream.readObject();
        Car mitsuCopy = (Car) objectInputStream.readObject();

        boolean isSameObject = mitsuCopy.equals(mitsu);

        System.out.println("Mitsubishi Copy: " + mitsuCopy);
        System.out.println("Mitsubishi Original: " + mitsu);
        System.out.println("is same object: " + isSameObject);
        //one can see that the transient fields are given the default values if serialized.










    }
    
}
