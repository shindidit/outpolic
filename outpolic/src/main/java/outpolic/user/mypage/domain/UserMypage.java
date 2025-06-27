package outpolic.user.mypage.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserMypage {
	 public String memberId; 
	 public String memberName; 
	 public String memberNickName; 
	 public String memberTelNo; 
	 public String memberAddress; 
	 public String memberDAddress; 
	 public String memberZip; 
	 public String memberEmail; 
	 public LocalDate memberBirth;
	 public LocalDate memberJoinDate;
}    
