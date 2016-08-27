package hapexam.core.som.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hapexam.core.som.dto.Header;
import java.util.List;

/**
 * @author jun.guo@hand-china.com
 */
public interface HeaderMapper extends Mapper<Header> {

	List<Header> selectByHeader(Header header);
	List<Header> selectHeaderById(Header header);	
}
