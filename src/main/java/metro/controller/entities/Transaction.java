package metro.controller.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import metro.controller.schema.TransactionData;

public class Transaction {
    ArrayList<TransactionData> transactionData = new ArrayList<TransactionData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("transactionData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(transactionData);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in transactionData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("transactionData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            transactionData = (ArrayList<TransactionData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("TransactionData class not found");
            c.printStackTrace();
            return;
        }
    }
}
