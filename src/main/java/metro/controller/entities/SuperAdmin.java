package metro.controller.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import metro.controller.schema.SuperAdminData;

public class SuperAdmin {
    ArrayList<SuperAdminData> superAdminData = new ArrayList<SuperAdminData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("superAdminData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(superAdminData);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in superAdminData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("superAdminData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            superAdminData = (ArrayList<SuperAdminData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("SuperAdminData class not found");
            c.printStackTrace();
            return;
        }
    }
}
