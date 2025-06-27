package outpolic.user.search.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import outpolic.user.search.domain.Contents;
import outpolic.user.search.mapper.SearchMapper;
import outpolic.user.search.service.SearchService;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class SearchServiceImpl implements SearchService{
	
	private final SearchMapper searchMapper;
	
	@Override
	public List<Contents> getContentsList(String keyword) {
		log.info("서비스 실행: 키워드 '{}'로 검색을 시작합니다.", keyword);
		
		List<Contents> contentsList = searchMapper.getContentsList(keyword);
		
		log.info("검색 완료: 총 {}개의 결과를 찾았습니다.", contentsList.size());
		return contentsList;
	}
}
