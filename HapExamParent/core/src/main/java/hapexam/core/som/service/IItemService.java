package hapexam.core.som.service;


import com.hand.hap.system.service.IBaseService;

import hapexam.core.som.dto.Item;

import com.hand.hap.core.ProxySelf;


import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface IItemService extends IBaseService<Item>, ProxySelf<IItemService> {

    List<Item> selectByItem(IRequest requestContext,Item item, int page, int pagesize);
    List<Item> selectByItemDetail(IRequest requestContext,Item item, int page, int pagesize);
 
}
