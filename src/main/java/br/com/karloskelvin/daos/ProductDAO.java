package br.com.karloskelvin.daos;

import br.com.karloskelvin.models.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProductDAO {

  @PersistenceContext
  private EntityManager manager;

  public void save(Product product){
    manager.persist(product);
  }

  @SuppressWarnings("JpaQlInspection")
  public List<Product> list() {
    return manager.createQuery("select distinct p from Product p join fetch p.prices", Product.class)
            .getResultList();
  }
}
