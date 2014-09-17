/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerUtil {
    
    private static EntityManagerFactory emf;
    /*public static EntityManager getEntityManager() {
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("PetHotelPU");
        }
    return emf.createEntityManager();
    } */    
       
    static {
        emf = Persistence.createEntityManagerFactory(
                "PetHotelPU");
    }
    
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}
