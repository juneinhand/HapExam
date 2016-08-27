package hapexam.core.som.service;


import com.hand.hap.system.service.IBaseService;

import hapexam.core.som.dto.Company;

import com.hand.hap.core.ProxySelf;


import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface ICompanyService extends IBaseService<Company>, ProxySelf<ICompanyService> {

    List<Company> selectByCompany(IRequest requestContext,Company company, int page, int pagesize);
 
}
