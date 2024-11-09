package metro.controller.entities;

import java.util.ArrayList;
import metro.controller.schema.DataEntryOperatorData;
import java.io.*;

public class DataEntryOperator {
    ArrayList<DataEntryOperatorData> dataEntryOperatorData = new ArrayList<DataEntryOperatorData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("dataEntryOperatorData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(dataEntryOperatorData);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in dataEntryOperatorData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("dataEntryOperatorData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            dataEntryOperatorData = (ArrayList<DataEntryOperatorData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("DataEntryOperatorData class not found");
            c.printStackTrace();
            return;
        }
    }

}
