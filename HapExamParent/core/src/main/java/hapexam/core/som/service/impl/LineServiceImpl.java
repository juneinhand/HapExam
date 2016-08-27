package hapexam.core.som.service.impl;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapexam.core.som.dto.Line;
import hapexam.core.som.mapper.LineMapper;

import hapexam.core.som.service.ILineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class LineServiceImpl extends BaseServiceImpl<Line>implements ILineService {

	@Autowired
	private LineMapper lineMapper;


	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Line> batchUpdate(IRequest requestContext, List<Line> lines) {
		// TODO Auto-generated method stub
		for (Line line : lines) {
			if (line.get__status() != null) {
				switch (line.get__status()) {
				case DTOStatus.ADD:
					lineMapper.insertLine(line);
					break;
				/*case DTOStatus.UPDATE:
					lineMapper.updateFruit(line);
					break;*/
				case DTOStatus.DELETE:
					lineMapper. deleteByLineId(line);
					break;
				default:
					break;
				}
			}
		}
		return lines;
	}

	
}
