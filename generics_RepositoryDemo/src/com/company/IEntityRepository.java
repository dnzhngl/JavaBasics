package com.company;

// Generic constraints -> have to use extends keyword instead of implements even you use interface to constraint.
public interface IEntityRepository<T extends IEntity> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
