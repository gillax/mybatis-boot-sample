package example.mybatis;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {
	@Select("SELECT * FROM people")
	List<Person> findAll();

	@MapKey("id")
	@Select("SELECT * FROM people")
	Map<Integer, Person> findAllMap();
}
