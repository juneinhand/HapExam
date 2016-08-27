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
@Table(name = "hap_inv_inventory_items")
public class Item extends BaseDTO {

	@Id
	@Column
	@GeneratedValue
	private Long inventoryItemId;

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Date getStartActiveDate() {
		return startActiveDate;
	}

	public void setStartActiveDate(Date startActiveDate) {
		this.startActiveDate = startActiveDate;
	}

	public String getEndActiveDate() {
		return endActiveDate;
	}

	public void setEndActiveDate(String endActiveDate) {
		this.endActiveDate = endActiveDate;
	}

	@Column
	@NotEmpty
	private String itemCode;

	@Column
	@NotEmpty
	private String itemUom;

	public String getAddition1() {
		return addition1;
	}

	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}

	public String getAddition2() {
		return addition2;
	}

	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}

	public String getAddition3() {
		return addition3;
	}

	public void setAddition3(String addition3) {
		this.addition3 = addition3;
	}

	public String getAddition4() {
		return addition4;
	}

	public void setAddition4(String addition4) {
		this.addition4 = addition4;
	}

	public String getAddition5() {
		return addition5;
	}

	public void setAddition5(String addition5) {
		this.addition5 = addition5;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Long getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(Long orderMoney) {
		this.orderMoney = orderMoney;
	}

	@Column
	@NotEmpty
	private String addition1;
	
	@Column
	@NotEmpty
	private String addition2;
	
	
	@Column
	@NotEmpty
	private String addition3;
	
	
	
	@Column
	@NotEmpty
	private String addition4;
	
	
	@Column
	@NotEmpty
	private String addition5;
	
	
	@Column
	@NotEmpty
	private String description;
	
	@Column
	@NotNull
	private Long unitSellingPrice;

	@Column
	@NotNull
	private Long orderQuantity;
	@Column
	@NotNull
	private Long lineId;
	@Column
	@NotNull
	private Long lineNumber;
	
	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Column
	@NotNull
	private Long headerId;
	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	@Column
	@NotNull
	private Long orderMoney;
	
	
	
	
	@Column
	@NotEmpty
	private String itemDescription;
	
	@Column
	@NotEmpty
	private Date startActiveDate;
	
	@Column
	@NotEmpty
	private String endActiveDate;
	
	
	

}
