package cn.xu.dao;

import cn.xu.model.CustomerMessage;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMessageDao {

    CustomerMessage queryById(int id);

    void addMessage(String message);

    CustomerMessage findAll();
}
