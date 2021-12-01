package org.example.dao;

import org.example.entity.Overview;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class OverviewDAOImpl implements OverviewDAO{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Overview> getAllOverview() {

        Session session = sessionFactory.getCurrentSession();
        List<Overview> allOverviews = session.createQuery("from Overview", Overview.class)
                       .getResultList();
        return allOverviews;
    }

    @Override
    public void saveOverview(Overview overview) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(overview);
    }

    @Override
    public Overview getOverview(int id) {
        Session session = sessionFactory.getCurrentSession();

        Overview overview = session.get(Overview.class, id);
        return overview;
    }

    @Override
    public void deleteOverview(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Overview> query = session.createQuery("delete from Overview " +
                "where id =:overviewId");
        query.setParameter("overviewId", id);
        query.executeUpdate();
    }
}
