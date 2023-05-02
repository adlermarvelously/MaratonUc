
package com.mervenuradler.repository;

import com.mervenuradler.repository.entity.Kullanici;
import com.mervenuradler.utilty.MyFactoryRepository;


public class KullaniciRepository extends MyFactoryRepository{
    
    public KullaniciRepository() {
        super(new Kullanici());
    }
    
}