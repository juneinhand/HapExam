package hapexam.core.som.mapper;

import com.hand.hap.mybatis.common.Mapper;


import hapexam.core.som.dto.Line;



/**
 * @author taotao.xu@hand-china.com
 */
public interface LineMapper extends Mapper<Line> {

	int deleteByLineId(Line line);
	int insertLine(Line line);	
}
