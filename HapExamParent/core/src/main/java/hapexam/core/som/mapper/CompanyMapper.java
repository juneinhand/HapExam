package hapexam.core.som.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hapexam.core.som.dto.Company;
import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface CompanyMapper extends Mapper<Company> {

	List<Company> selectByCompany(Company company);
	
}
