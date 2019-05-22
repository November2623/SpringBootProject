package com.duytran.service;


import com.duytran.model.ProviderDTO;

import java.util.List;

public interface ProviserService {
    public List<ProviderDTO> getAllProviders();
    public void addProvider(ProviderDTO provider);
    public void deleteProvider(int id);
    public void updateProvider(ProviderDTO provider);
}
