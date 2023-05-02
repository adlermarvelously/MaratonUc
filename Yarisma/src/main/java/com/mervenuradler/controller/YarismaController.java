
package com.mervenuradler.controller;

import com.mervenuradler.repository.entity.Yarisma;
import com.mervenuradler.service.YarismaService;
import java.util.Scanner;

public class YarismaController {
    
    private YarismaService yarismaService;
    
    public YarismaController(){
      this.yarismaService=new YarismaService();
    }
    public void save(){
        Scanner scanner=new Scanner(System.in);
        String yarismaAdi=scanner.nextLine();
        String odul=scanner.nextLine();
        int kisiSayisi=scanner.nextInt();
        
        int yas =scanner.nextInt();
        Yarisma yarismaOlustur= new Yarisma();
        yarismaOlustur.setyAdi(yarismaAdi);
        yarismaOlustur.setOdul(odul);
        yarismaOlustur.setKatilimSayisi(kisiSayisi);
        yarismaService.save(yarismaOlustur);
       
    }
}