package list.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import list.dao.ListDao;

@Service(value="listService")
public class ListServiceImpl implements ListService {

	@Resource(name="listDao")
	private ListDao listDao;
	
	@Override
	public List<List> retrieveJsList() {
		// TODO Auto-generated method stub
		return listDao.selectList();
	}

}
