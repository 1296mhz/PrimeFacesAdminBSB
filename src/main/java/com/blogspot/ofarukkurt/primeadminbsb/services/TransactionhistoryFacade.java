/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.primeadminbsb.services;

import com.blogspot.ofarukkurt.primeadminbsb.models.Transactionhistory;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:57:02 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Stateless
public class TransactionhistoryFacade extends AbstractFacade<Transactionhistory> {
    @PersistenceContext(unitName = "ADMINBSB_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransactionhistoryFacade() {
        super(Transactionhistory.class);
    }

}
