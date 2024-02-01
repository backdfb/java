package BookVo;

public class BookVO {
		
		// VO - 한개 또는 그 이상의 속성을 묶어서 특정 값을 나타내는 객체
		// MVC Pattern - Model	
	
		// 필드 구성
		private String title;       // 책 제목 -> title
		private String author;      // 작가 이름 -> author
    private String company;     // 출판사 -> company
		private int page;           // 페이지 수 -> page
		
		// 생성자
		public BookVO(String title, String author, String company, int page) {	
			this.title = title;
			this.author = author;
      this.company = company;
			this.page = page;
		}
		
		// Getter(조회), Setter(수정) 메소드
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
  	public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}

		@Override
		public String toString() {
			String string = "제목: " + this.title + "\t"
					+ "가수 : " + this.author + "\t"
          + "출판사 : " + this.company + "\t"
					+ "페이지 수 : " + this.page + "\t";
			return string;
		}		
}
