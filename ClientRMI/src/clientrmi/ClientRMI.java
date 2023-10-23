/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
            IDao<Salle> dao2 = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/dao2");
             
            Salle salle1 = new Salle("salle B1");
            dao2.create(salle1);
            Salle salle2 = new Salle("salle B2");
            dao2.create(salle2);
            Salle salle3 = new Salle("salle B3");
            dao2.create(salle3);
            for (Salle s : dao2.findAll()) {
                System.out.println(s);
            }

            dao.create(new Machine("HP", 1000, "ER44", salle1));
            dao.create(new Machine("Lenovo", 3000, "ER45", salle2));
            dao.create(new Machine("Mac", 5000, "ER46", salle2));

            for (Machine m : dao.findAll()) {
                System.out.println(m);
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
