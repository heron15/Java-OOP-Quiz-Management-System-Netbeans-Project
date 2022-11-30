package quizapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StoreUserDetails {

    public void fileSingUpUser(UserInfo aPaitent) {

        List<UserInfo> list = new ArrayList<UserInfo>();
        list.add(aPaitent);

        File dir = new File("User.txt");

        if (dir.exists()) {
            List<UserInfo> localList = new ArrayList<UserInfo>();

            try {
                FileInputStream fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);

                List<UserInfo> tempList = (ArrayList<UserInfo>) ois.readObject();
                localList = tempList;
                ois.close();
                fis.close();

                localList.add(aPaitent);

                FileOutputStream fos = new FileOutputStream(dir);
                try ( ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(localList);
                    oos.close();
                    fos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                FileOutputStream fos = new FileOutputStream(dir);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }

        }
    }

}
