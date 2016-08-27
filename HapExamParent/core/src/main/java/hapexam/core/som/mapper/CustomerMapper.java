package hapexam.core.som.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hapexam.core.som.dto.Customer;
import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface CustomerMapper extends Mapper<Customer> {

	List<Customer> selectByCustomer(Customer customer);
		
}
