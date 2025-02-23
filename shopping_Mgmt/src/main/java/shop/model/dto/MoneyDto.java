package shop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class MoneyDto {

	// 판매번호 PK
	private int salenol;
	// 단가
	private int pcost;
	// 수량
	private int amount;
	// 가격
	private int price;
	// 상품코드
	private String pcode;
	// 판매일자
	private String sdate;
	// 회원번호 FK
	private int custno;
	
} // c end
