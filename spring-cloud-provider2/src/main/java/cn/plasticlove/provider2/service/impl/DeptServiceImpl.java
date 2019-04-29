package cn.plasticlove.provider2.service.impl;

import cn.plasticlove.entity.Dept;

import cn.plasticlove.provider2.dao.DeptDao;
import cn.plasticlove.provider2.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/28-21:20
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
