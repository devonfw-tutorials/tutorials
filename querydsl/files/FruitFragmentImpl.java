package org.acme.spring.data.jpa.repo.fruit;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.acme.spring.data.jpa.model.Fruit;
import org.acme.spring.data.jpa.model.QFruit;

import com.querydsl.jpa.impl.JPAQuery;

public class FruitFragmentImpl implements FruitFragment {

  @Inject
  EntityManager em;

  @Override
  public List<Fruit> findAllQueryDslName(String name) {

    QFruit fruit = QFruit.fruit;
    JPAQuery<Fruit> query = new JPAQuery<Fruit>(this.em);
    query.from(fruit);
    if (name != null && !name.isEmpty()) {
      query.where(fruit.name.eq(name));
    }
    return query.orderBy(fruit.name.desc()).fetch();
  }

  @Override
  public List<Fruit> findAllQueryDslMaxPriceDesc(Float price) {

    QFruit fruit = QFruit.fruit;
    JPAQuery<Fruit> query = new JPAQuery<Fruit>(this.em);
    query.from(fruit);
    if (price != null && price != 0) {
      query.where(fruit.price.loe(price));
    }
    return query.orderBy(fruit.price.desc()).fetch();
  }

  @Override
  public List<Fruit> findAllQueryDslMinPriceAsc(Float price) {

    QFruit fruit = QFruit.fruit;
    JPAQuery<Fruit> query = new JPAQuery<Fruit>(this.em);
    query.from(fruit);
    if (price != null && price != 0) {
      query.where(fruit.price.goe(price));
    }
    return query.orderBy(fruit.price.asc()).fetch();
  }

  @Override
  public List<Fruit> findAllQueryDslPriceRange(Float min, Float max) {

    QFruit fruit = QFruit.fruit;
    JPAQuery<Fruit> query = new JPAQuery<Fruit>(this.em);
    query.from(fruit);
    if (min != null && min != 0 && max != null && max != 0) {
      query.where(fruit.price.between(min, max));
    }
    return query.orderBy(fruit.price.desc()).fetch();
  }

}
