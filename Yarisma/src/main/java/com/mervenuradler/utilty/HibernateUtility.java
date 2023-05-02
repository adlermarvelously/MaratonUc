package com.mervenuradler.utilty;

import com.mervenuradler.repository.entity.Kullanici;
import com.mervenuradler.repository.entity.Yarisma;
import com.mervenuradler.repository.entity.YarismaKatilim;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
      private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();
    private static SessionFactory sessionFactoryHibernate() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Kullanici.class);
            configuration.addAnnotatedClass(Yarisma.class);
            configuration.addAnnotatedClass(YarismaKatilim.class);
            SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return factory;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
