package org.example.service;

import org.example.dao.OverviewDAO;
import org.example.entity.Overview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OverviewServiceImpl implements OverviewService{
    @Autowired
    private OverviewDAO overviewDAO;

    @Override
    @Transactional
    public List<Overview> getAllOverview() {
        return overviewDAO.getAllOverview();
    }

    @Override
    @Transactional
    public void saveOverview(Overview overview) {
        overviewDAO.saveOverview(overview);
    }

    @Override
    @Transactional
    public Overview getOverview(int id) {
        return overviewDAO.getOverview(id);
    }

    @Override
    @Transactional
    public void deleteOverview(int id) {
        overviewDAO.deleteOverview(id);
    }
}
