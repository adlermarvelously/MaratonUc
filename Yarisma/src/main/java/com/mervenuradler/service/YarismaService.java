
package com.mervenuradler.service;

import com.mervenuradler.repository.YarismaRepository;
import com.mervenuradler.repository.entity.Yarisma;
import com.mervenuradler.utilty.MyFactoryService;

public class YarismaService extends MyFactoryService<YarismaRepository, Yarisma, Long> {
    
    public YarismaService() {
        super(new YarismaRepository());
    }
    
}