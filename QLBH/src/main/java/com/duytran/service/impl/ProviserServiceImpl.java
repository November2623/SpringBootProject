package com.duytran.service.impl;

import com.duytran.dao.ProviderDao;
import com.duytran.model.ProviderDTO;
import com.duytran.entity.Provider;
import com.duytran.service.ProviserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProviserServiceImpl implements ProviserService {
    @Autowired
    private ProviderDao providerDao;

    @Override
    public List<ProviderDTO> getAllProviders() {
        List<Provider> providers = providerDao.getAllProviders();

        List<ProviderDTO> listProviders = new ArrayList<ProviderDTO>();
        for(Provider p : providers){
            ProviderDTO providerDTO = new ProviderDTO();
            providerDTO.setId(p.getId());
            providerDTO.setProvider_name(p.getProvider_name());
            providerDTO.setAddress(p.getAddress());
            providerDTO.setPhone(p.getPhone());
            providerDTO.setEmail(p.getEmail());
            providerDTO.setMore_info(p.getMore_info());
            providerDTO.setContract_date(p.getContract_date());

            listProviders.add(providerDTO);
        }
        return listProviders;
    }

    @Override
    public void addProvider(ProviderDTO provider) {
        Provider p = new Provider();
        p.setId(provider.getId());
        p.setProvider_name(provider.getProvider_name());
        p.setAddress(provider.getAddress());
        p.setPhone(provider.getPhone());
        p.setEmail(provider.getEmail());
        p.setMore_info(provider.getMore_info());
        p.setContract_date(provider.getContract_date());
        providerDao.addProvider(p);
    }

    @Override
    public void deleteProvider(int id) {

    }

    @Override
    public void updateProvider(ProviderDTO provider) {

    }
}