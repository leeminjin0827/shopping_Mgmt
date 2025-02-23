package shop.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.model.dto.MemberDto;

@NoArgsConstructor( access = lombok.AccessLevel.PRIVATE )
public class MemberDao extends Dao{
	
	@Getter
	private static MemberDao instance = new MemberDao();

	// 회원등록 SQL
	public boolean write( MemberDto memberDto ) {
		try {
			String sql = "insert into member_tbl_02( custno , custname , phone , address , joindate , grade , city) values( ? , ? , ? , ? , ? , ? , ? )";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, memberDto.getCustno() );
			ps.setString(2, memberDto.getCustname() );
			ps.setString(3, memberDto.getPhone() );
			ps.setString(4, memberDto.getAddress() );
			ps.setString(5, memberDto.getJoindate() );
			ps.setString(6, memberDto.getGrade() );
			ps.setString(7, memberDto.getCity() );
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch ( SQLException e ) { System.out.println( e ); }
		return false;
	} // f end
		
} // f end
