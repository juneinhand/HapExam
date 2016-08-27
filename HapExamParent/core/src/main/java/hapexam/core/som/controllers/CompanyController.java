/*
 * #{copyright}#
 */

package hapexam.core.som.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hapexam.core.som.dto.Company;
import hapexam.core.som.dto.Customer;
import hapexam.core.som.dto.Header;
import hapexam.core.som.dto.Item;
import hapexam.core.som.dto.Line;
import hapexam.core.som.service.ICompanyService;
import hapexam.core.som.service.ICustomerService;
import hapexam.core.som.service.IHeaderService;
import hapexam.core.som.service.IItemService;
import hapexam.core.som.service.ILineService;

import com.hand.hap.core.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;

/**
 * 水果控制器.
 * 
 * @author taotao.xu@hand-china.com
 */
@Controller
public class CompanyController extends BaseController {

	@Autowired
	private ICompanyService companyService;
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private IHeaderService headerService;
	@Autowired
	private IItemService itemService;
	@Autowired
	private ILineService lineService;
	/**
	 * 任务分配查询.
	 * 
	 * @param fruit
	 *            分配对象
	 * @param page
	 *            起始页
	 * @param pagesize
	 *            分页大小
	 * @param request
	 *            HttpServletRequest
	 * @return ResponseData
	 */

	/**
	 * 保存水果.
	 * 
	 * @param fruits
	 *            fruits
	 * @param result
	 *            BindingResult
	 * @param request
	 *            HttpServletRequest
	 * @return ResponseData ResponseData
	 * @throws BaseException
	 *             BaseException
	 */

	@RequestMapping(value = "/ass/company/query")
	@ResponseBody
	public ResponseData getCompanys(Company company, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(companyService.selectByCompany(requestContext, company, page, pagesize));
	}

	@RequestMapping(value = "/ass/customer/query")
	@ResponseBody
	public ResponseData getCustomers(Customer customer, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(customerService.selectByCustomer(requestContext, customer, page, pagesize));
	}

	@RequestMapping(value = "/ass/header/query")
	@ResponseBody
	public ResponseData getHeaders(Header header, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(headerService.selectByHeader(requestContext, header, page, pagesize));
	}

	@RequestMapping(value = "/ass/headerById/query")
	@ResponseBody
	public ResponseData getHeaderById(Header header,Long headerId, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		header.setHeaderId(headerId);
		
		return new ResponseData(headerService.selectByHeaderId(requestContext, header, page, pagesize));
	}
	
	
	
	
	@RequestMapping(value = "/ass/item/query")
	@ResponseBody
	public ResponseData getItems(Item item, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(itemService.selectByItem(requestContext, item, page, pagesize));
	}

	@RequestMapping(value = "/ass/itemDetail/query")
	@ResponseBody
	public ResponseData getItemDetails(Item item,Long headerId, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		
		item.setHeaderId(headerId);
		
		
		return new ResponseData(itemService.selectByItemDetail(requestContext, item, page, pagesize));
	}

	
	
	
	
	
	@RequestMapping(value = "/ass/line/delete", method = RequestMethod.POST)
	@ResponseBody
	public ResponseData deleteLine(@RequestBody List<Line> lines, BindingResult result, HttpServletRequest request)
			throws BaseException {

		IRequest requestContext = createRequestContext(request);
		return new ResponseData(lineService.batchUpdate(requestContext, lines));
	}

	@RequestMapping(value = "/ass/line/submit", method = RequestMethod.POST)
	@ResponseBody
	public ResponseData saveLine(@RequestBody List<Line> lines,Long headerId, BindingResult result, HttpServletRequest request)
			throws BaseException {

		IRequest requestContext = createRequestContext(request);
		for (Line line : lines) {
			line.setHeaderId(headerId);
			line.setLineNumber((long) 1002);
		}
		
		return new ResponseData(lineService.batchUpdate(requestContext, lines));
	}
	
	
}
