package cn.plasticlove.provider2.service;

import cn.plasticlove.entity.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}
