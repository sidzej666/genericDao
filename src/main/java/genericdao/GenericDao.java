package genericdao;

import java.util.List;

public interface GenericDao {
	<T> T getById(Class<T> clazz, int id);
	<T> List<T> get(Class<T> clazz, DaoFilter daoFilter);
	<T> List<T> get(Class<T> clazz, String hqlQuery);
	<T> T saveOrUpdate(T entity);
}
