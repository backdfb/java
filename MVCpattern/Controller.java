package MP3plyaer;

import java.util.ArrayList;

public class BookController {
	
	ArrayList<BookVO> list = new ArrayList<>();
	
	// 책 등록 해주는 메소드
	public void insertBook(String title, String author, String company, int page) {
		// 이 매개변수들을 전부 생성자 넣어주기
		BookVO mvo = new BookVO(title, author, company, page);
		// 생성자 담고난 뒤에 리스트에 추가
		list.add(mvo);
	}
	
	// 책 목록 보여주는 메소드
	public void showBook() {
		System.out.println("============책 목록==============");
		for(int i=0; i<list.size(); i++) {
			System.out.println((i+1)+", 제목 : " + list.get(i).getTitle()+"\t"
					+", 작가 : " + list.get(i).getAuthor()+"\t"
          +", 출판사 : " + list.get(i).getCompany()+"\t"               
					+", 시간 : "+list.get(i).getPage()+"초");
		}
	}

	// List 불러오는 메소드
	public ArrayList<BookVO> getList(){
		return list;
	}	
}
