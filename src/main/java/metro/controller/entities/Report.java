package metro.controller.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import metro.controller.schema.ReportData;

public class Report {
    ArrayList<ReportData> reports = new ArrayList<ReportData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("reportData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(reports);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in reportData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("reportData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            reports = (ArrayList<ReportData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("ReportData class not found");
            c.printStackTrace();
            return;
        }
    }
}
