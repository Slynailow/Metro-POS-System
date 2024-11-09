package metro.controller.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import metro.controller.schema.VendorData;

public class Vendor {
    ArrayList<VendorData> vendorData = new ArrayList<VendorData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("vendorData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(vendorData);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in vendorData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("vendorData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            vendorData = (ArrayList<VendorData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("VendorData class not found");
            c.printStackTrace();
            return;
        }
    }
}
