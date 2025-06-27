package outpolic.user.mypage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import outpolic.user.mypage.domain.UserMypage;
import outpolic.user.mypage.mapper.UserMypageEditMapper;

@Service
public interface UserMypageEditService {
	// 특정 회원 수정
	void editUserInfo(UserMypage user);
	// 특정 회원 정보 조회
	UserMypage getUserInfoById(String memberId);
	// 회원목록 조회
	List<UserMypage> getMemberList();
}
