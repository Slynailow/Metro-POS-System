package metro.controller.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import metro.controller.schema.ProductData;

public class Product {
    ArrayList<ProductData> productData = new ArrayList<ProductData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("productData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(productData);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in productData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("productData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            productData = (ArrayList<ProductData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("ProductData class not found");
            c.printStackTrace();
            return;
        }
    }
}
