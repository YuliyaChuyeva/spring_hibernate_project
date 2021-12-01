package org.example.dao;

import org.example.entity.Overview;

import java.util.List;

public interface OverviewDAO {

    public List<Overview> getAllOverview();

    public void saveOverview(Overview overview);

     public Overview getOverview(int id);

     public void deleteOverview(int id);
}
