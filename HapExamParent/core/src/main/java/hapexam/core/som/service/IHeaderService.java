package hapexam.core.som.service;


import com.hand.hap.system.service.IBaseService;

import hapexam.core.som.dto.Header;

import com.hand.hap.core.ProxySelf;


import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface IHeaderService extends IBaseService<Header>, ProxySelf<IHeaderService> {

    List<Header> selectByHeader(IRequest requestContext,Header header, int page, int pagesize);
    List<Header> selectByHeaderId(IRequest requestContext,Header header, int page, int pagesize);
}
