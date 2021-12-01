package org.example.service;

import org.example.entity.Overview;

import java.util.List;

public interface OverviewService {

    public List<Overview> getAllOverview();

    public void saveOverview(Overview overview);

    public Overview getOverview(int id);

    public void deleteOverview(int id);
 }
