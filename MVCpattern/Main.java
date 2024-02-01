package Book;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		BookController controller = new BookController();
		
		// 책 등록
		controller.insertBook("자바의 정석", "남궁성", "도우출판", 780);
		controller.insertBook("이것이 자바다", "신용권", "한빛미디어", 890);
		
		// 책 목록 보기
		controller.showBook();
		
		// 리스트 가져오기
		ArrayList<BookVO> bookList = controller.getList();
		
		// 가져온 리스트 사용하기
		for(BookVO book : bookList) {
			System.out.println("제목: " + book.getTitle());
			System.out.println("작가: " + book.getAuthor());
			System.out.println("출판사: " + book.getCompany());
			System.out.println("페이지: " + book.getPage());
			System.out.println("=====================");
		}
	}
}

