package com.duytran.controller;

import com.duytran.model.ProviderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.duytran.service.ProviserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProviderController {

    @Autowired
    private ProviserService proviserService;

    @RequestMapping(value = "/Providers")
    public String getAllProvider(HttpServletRequest rq, Model model){
        List<ProviderDTO> listProviders = proviserService.getAllProviders();
        rq.setAttribute("providers", listProviders);
        return "ProvidersList";
    }
}