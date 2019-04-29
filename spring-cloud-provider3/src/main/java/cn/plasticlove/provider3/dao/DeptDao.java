package cn.plasticlove.provider3.dao;

import cn.plasticlove.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/28-21:16
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
