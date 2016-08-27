package hapexam.core.som.dto;

import com.hand.hap.core.annotation.MultiLanguage;

import com.hand.hap.system.dto.BaseDTO;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by taotao.xu on 16/6/24.
 */
@MultiLanguage
@Table(name = "hap_om_order_headers")
public class Header extends BaseDTO {

	@Id
	@Column
	@GeneratedValue
	private Long headerId;

	@Column
	@NotEmpty
	private String orderNumber;

	@Column
	@NotNull
	private Long companyId;

	@Column
	@NotEmpty
	private Date orderDate;

	@Column
	@NotEmpty
	private String orderStatus;

	@Column
	@NotNull
	private Long customerId;

	@Column
	@NotEmpty
	private String customerName;
	@Column
	@NotEmpty
	private String companyName;

	@Column
	@NotNull
	private Long unitSellingPrice;

	@Column
	@NotNull
	private Long orderQuantity;

	@Column
	@NotNull
	private Long orderMoney;

	public Long getOrderMoney() {

		return orderMoney;
	}

	public void setOrderMoney(Long orderMoney) {
	
		this.orderMoney = orderMoney;

	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;

	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getUnitSellingPrice() {
		return unitSellingPrice;
	}

	public void setUnitSellingPrice(Long unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;

	}
}
