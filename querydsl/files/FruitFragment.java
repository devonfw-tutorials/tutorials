package org.acme.spring.data.jpa.repo.fruit;

import java.util.List;

import org.acme.spring.data.jpa.model.Fruit;

public interface FruitFragment {

  public List<Fruit> findAllQueryDslName(String name);

  public List<Fruit> findAllQueryDslMaxPriceDesc(Float price);

  public List<Fruit> findAllQueryDslMinPriceAsc(Float price);

  public List<Fruit> findAllQueryDslPriceRange(Float min, Float max);

}
