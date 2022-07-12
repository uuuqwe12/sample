package co.edu.Board;

public class Board {
		private String title;
		private String writer;
		private String content;
	
		public Board(String title, String writer, String content) { 
			this.title = title;
			this.writer = writer;
			this.content = content;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		
		public String toString() {
			return "글제목: " + title + " 작성자: " + writer + " 글내용: " + content+"\n";
		}


}
