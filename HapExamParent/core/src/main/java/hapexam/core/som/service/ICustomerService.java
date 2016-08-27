package hapexam.core.som.service;


import com.hand.hap.system.service.IBaseService;

import hapexam.core.som.dto.Customer;

import com.hand.hap.core.ProxySelf;


import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface ICustomerService extends IBaseService<Customer>, ProxySelf<ICustomerService> {

    List<Customer> selectByCustomer(IRequest requestContext,Customer customer, int page, int pagesize);
 
}
