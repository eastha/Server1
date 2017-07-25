package list.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="listDao")
public class ListDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	 
	@SuppressWarnings("rawtypes")
	public List selectList(){
		return sqlSession.selectList( "ha.boardList" );
	}
}
