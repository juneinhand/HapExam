package hapexam.core.som.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapexam.core.som.dto.Item;
import hapexam.core.som.mapper.ItemMapper;

import hapexam.core.som.service.IItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class ItemServiceImpl extends BaseServiceImpl<Item>implements IItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public List<Item> selectByItem(IRequest requestContext, Item item, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return itemMapper.selectByItem(item);
	}

	@Override
	public List<Item> selectByItemDetail(IRequest requestContext, Item item, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return itemMapper.selectByItemDetail(item);
	}

	
}
