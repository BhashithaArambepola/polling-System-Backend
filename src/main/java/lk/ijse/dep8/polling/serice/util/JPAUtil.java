package lk.ijse.dep8.polling.serice.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static EntityManagerFactory emf = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("poll");
    }

    private static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
