package com.github.biancode.jeeseven.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class BaseEJB<T>
{

  @PersistenceContext(unitName = "mysqlPU")
  private EntityManager entityManager;

  public EntityManager getEntityManager()
  {

    return entityManager;
  }

  public List<T> findAll(Class<T> clazz)
  {

    TypedQuery<T> query = entityManager.createNamedQuery(clazz.getSimpleName() + ".findAll", clazz);
    return query.getResultList();
  }

  public T addNew(T entity)
  {

    entityManager.persist(entity);
    return entity;
  }
}
