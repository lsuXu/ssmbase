package cn.xu.service;

import cn.xu.dao.CustomerMessageDao;
import cn.xu.model.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerMessageService {

    @Autowired
    CustomerMessageDao customerMessageDao;

    public void addMessage(String message){
        if(customerMessageDao != null)
            customerMessageDao.addMessage(message);
        else
            System.out.println("customerMessageDao = null");
    }

    public CustomerMessage findAll() {
        return customerMessageDao.findAll();
    }

    public CustomerMessage queryById(int id){
        return customerMessageDao.queryById(id);
    }
}
