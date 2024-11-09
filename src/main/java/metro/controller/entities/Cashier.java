package metro.controller.entities;

import metro.controller.schema.*;
import java.util.*;
import java.io.*;

public class Cashier {

    ArrayList<CashierData> cashierData = new ArrayList<CashierData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("cashierData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cashierData);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in cashierData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("cashierData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cashierData = (ArrayList<CashierData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("CashierData class not found");
            c.printStackTrace();
            return;
        }
    }

}
