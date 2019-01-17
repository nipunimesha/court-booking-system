package lk.ijsc.dep.court.dao;

import lk.ijsc.dep.court.entity.SuperEntity;

import java.util.ArrayList;
import java.util.List;

public interface CrudDAO <T extends SuperEntity,ID> extends SuperDAO {
     boolean save(T entity)throws Exception;
    boolean update(T entity)throws Exception;
    boolean delete(ID key) throws Exception;
    T find(ID key) throws Exception;
    ArrayList<T> findAll()throws Exception;

}
