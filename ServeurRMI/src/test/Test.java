/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;
import util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class Test {
    public static void main(String[] args) {
        try {
            HibernateUtil.getSessionFactory();
           
            IDao<Salle> dao2= new SalleService();
             Salle salle1 = new Salle("salle B1");
            dao2.create(salle1);
            Salle salle2 = new Salle("salle B2");
            dao2.create(salle2);
            Salle salle3 = new Salle("salle B3");
            dao2.create(salle3); 
           for(Salle s : dao2.findAll())
               System.out.println(s);
           IDao<Machine> dao = new MachineService();
            dao.create(new Machine("HP", 1000, "ER44",salle1));
            dao.create(new Machine("Lenovo", 3000, "ER45",salle2));
            dao.create(new Machine("Mac", 5000, "ER46",salle2));
            
            for(Machine m : dao.findAll())
               System.out.println(m);
      } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
