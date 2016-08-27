package hapexam.core.som.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapexam.core.som.dto.Header;
import hapexam.core.som.mapper.HeaderMapper;

import hapexam.core.som.service.IHeaderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class HeaderServiceImpl extends BaseServiceImpl<Header>implements IHeaderService {

	@Autowired
	private HeaderMapper headerMapper;

	@Override
	public List<Header> selectByHeader(IRequest requestContext, Header header, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return headerMapper.selectByHeader(header);
	}

	@Override
	public List<Header> selectByHeaderId(IRequest requestContext, Header header, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		
		return headerMapper.selectHeaderById(header);
	}

	
}
