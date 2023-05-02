/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mervenuradler.service;

import com.mervenuradler.repository.KullaniciRepository;
import com.mervenuradler.repository.entity.Kullanici;
import com.mervenuradler.utilty.MyFactoryService;

public class KullaniciService extends MyFactoryService<KullaniciRepository, Kullanici, Long> {
    
    public KullaniciService() {
        super(new KullaniciRepository());
    }
    
}