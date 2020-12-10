package com.services.servicesImpl;

import com.dao.ItemDao;
import com.domain.Item;
import com.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public Item findById(Integer id) {
        return itemDao.findById(id);
    }
}
