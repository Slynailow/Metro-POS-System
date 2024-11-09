package metro.controller.entities;

import metro.controller.schema.BranchManagerData;
import java.util.*;
import java.io.*;

public class BranchManager {
    ArrayList<BranchManagerData> branchManagerData = new ArrayList<BranchManagerData>();

    public void saveData() {
        // serialize it
        try {
            FileOutputStream fileOut = new FileOutputStream("branchManagerData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(branchManagerData);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in branchManagerData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadData() {
        // deserialize it
        try {
            FileInputStream fileIn = new FileInputStream("branchManagerData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            branchManagerData = (ArrayList<BranchManagerData>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("BranchManagerData class not found");
            c.printStackTrace();
            return;
        }
    }

}
