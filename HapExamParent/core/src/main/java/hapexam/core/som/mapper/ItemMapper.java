package hapexam.core.som.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hapexam.core.som.dto.Item;
import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface ItemMapper extends Mapper<Item> {

	List<Item> selectByItem(Item item);
	List<Item> selectByItemDetail(Item item);	
}
