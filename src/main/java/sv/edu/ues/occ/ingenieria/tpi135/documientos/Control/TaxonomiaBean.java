/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ues.occ.ingenieria.tpi135.documientos.Control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.io.Serializable;
import sv.edu.ues.occ.ingenieria.tpi135.documientos.entity.Taxonomia;

/**
 *
 * @author alexo
 */
public class TaxonomiaBean extends AbstractDataAccess<Taxonomia> implements Serializable {

    @PersistenceContext(unitName = "Docu_PU")
    EntityManager em;

    public TaxonomiaBean() {
        super(Taxonomia.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

}
