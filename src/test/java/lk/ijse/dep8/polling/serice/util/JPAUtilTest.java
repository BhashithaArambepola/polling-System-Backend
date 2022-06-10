package lk.ijse.dep8.polling.serice.util;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

class JPAUtilTest {

    @Test
    void getEntityManagerFactory(){
        //given
      EntityManagerFactory instance1 = JPAUtil.getEntityManagerFactory();
        //when
        EntityManagerFactory instance2 = JPAUtil.getEntityManagerFactory();
        //then
        assertEquals(instance2, instance1);
    }


    @Test
    void getEntityManager() {
        //given
        EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
        //when
        EntityManager em = emf.createEntityManager();
        //then
        assertNotNull(em);
    } }