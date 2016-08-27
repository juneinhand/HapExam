package hapexam.core.som.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapexam.core.som.dto.Company;
import hapexam.core.som.mapper.CompanyMapper;
import hapexam.core.som.service.ICompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company>implements ICompanyService {

	@Autowired
	private CompanyMapper companyMapper;

	@Override
	public List<Company> selectByCompany(IRequest requestContext, Company company, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return companyMapper.selectByCompany(company);
	}

	
}
