package sample;

import java.io.*;

public class Save {

    public static void sauvegarder(Data data) {
        try {
            FileOutputStream res = new FileOutputStream("sauvegarde");
            ObjectOutputStream ext = new ObjectOutputStream(res);
            ext.writeObject(data);
            ext.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Sauvegarde error");
        }
    }

    public static Data charger() {
        Data data = new Data();
        try {
            FileInputStream res = new FileInputStream("sauvegarde");
            ObjectInputStream ext = new ObjectInputStream(res);
            data = (Data) ext.readObject();
            ext.close();
        } catch (IOException | ClassNotFoundException e) {
            File f = new File("sauvegarde");
            try {
                f.createNewFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            data.init();
            sauvegarder(data);

        }
        return data;
    }
}