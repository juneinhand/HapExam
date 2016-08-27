package hapexam.core.som.service;


import com.hand.hap.system.service.IBaseService;

import hapexam.core.som.dto.Line;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;

import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface ILineService extends IBaseService<Line>, ProxySelf<ILineService> {

   
    
    List<Line> batchUpdate(IRequest requestContext, @StdWho List<Line> line);
}
