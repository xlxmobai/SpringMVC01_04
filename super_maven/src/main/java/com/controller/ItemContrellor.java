package com.controller;

import com.domain.Item;
import com.services.ItemService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "item")
public class ItemContrellor {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "findAll")
    public String findAll(Model model){
        Item item = itemService.findById(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
