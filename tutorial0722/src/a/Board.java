package a;

public class Board { //게시글
	private String subject; //주제
	private String content; //내용
	private String writer; //작성자

	void setSubject(String subject) {this.subject=subject;}
	String getSubject() {return this.subject;}
	
	void setContent(String content) {this.content=content;}
	String getContent() {return this.content;}
	
	void setWriter(String writer) {this.writer=writer;}
	String getWriter() {return this.writer;}
	
	Board(){}
	
	Board(String subject, String content, String writer){
		this.subject=subject;
		this.content=content;
		this.writer=writer;
	}
	
	
	

}
