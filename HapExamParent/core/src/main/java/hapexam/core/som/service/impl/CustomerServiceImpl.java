package hapexam.core.som.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapexam.core.som.dto.Customer;
import hapexam.core.som.mapper.CustomerMapper;

import hapexam.core.som.service.ICustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer>implements ICustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> selectByCustomer(IRequest requestContext, Customer customer, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return customerMapper.selectByCustomer(customer);
	}

	
}
