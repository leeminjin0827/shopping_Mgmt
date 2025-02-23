package shop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class MemberDto {
	
	// 회원번호 PK
	private int custno;
	// 회원성명
	private String custname;
	// 회원전화
	private String phone;
	// 주소
	private String address;
	// 가입일자
	private String joindate;
	// 고객등급
	private String grade;
	// 거주도시
	private String city;
	
} // c end
