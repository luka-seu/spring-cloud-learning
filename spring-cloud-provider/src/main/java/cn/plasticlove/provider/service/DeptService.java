package cn.plasticlove.provider.service;

import cn.plasticlove.entity.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}
