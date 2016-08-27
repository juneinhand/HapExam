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

@Table(name = "hap_om_order_lines")
public class Line extends BaseDTO {
	@Id
	@Column
	@GeneratedValue
	private Long lineId;
	
	
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
	private Long inventoryItemId;
	
	@Column
	@NotNull
	private Long orderdQuantity;

	@Column
	@NotNull
	private Long headerId;
	
	@Column
	@NotNull
	private Long lineNumber;
	public Long getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
		
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}


	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

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

	public Long getOrderdQuantity() {
		return orderdQuantity;
	}

	public void setOrderdQuantity(Long orderdQuantity) {
		this.orderdQuantity = orderdQuantity;
	}

	
	

	
	

}
