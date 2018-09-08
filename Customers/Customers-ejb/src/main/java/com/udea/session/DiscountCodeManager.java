/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.DiscountCode;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Jorg Diaz
 */
@Stateless
public class DiscountCodeManager implements DiscountCodeManagerLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext(unitName = "com.udea_Customers-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    @Override
    public List<DiscountCode> getDiscountCodes() {
        Query query= em.createNamedQuery("DiscountCode.findAll");
        return query.getResultList();
    }
}
