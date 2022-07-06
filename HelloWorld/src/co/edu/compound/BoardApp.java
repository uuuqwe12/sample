package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

/*
* 등록/ 조회/ 수정/ 삭제/ 리스트
*/
public class BoardApp {
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner sn = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.리스트 6.종료");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(sn.nextLine());

			if (selectNo == 1) {
				// 게시글 등록 (제목, 내용, 작성자, 작성일시, 조회수(0));
				System.out.println("글제목을 입력하세요.");
				String title = sn.nextLine();

				System.out.println("내용을 입력하세요.");
				String content = sn.nextLine();

				System.out.println("작성자를 입력하세요.");
				String writer = sn.nextLine();

				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);

				// 배열의 비어있는 위치에 저장.
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board;
						break;
					}
				}
				System.out.println("정상적으로 입력했습니다.");

			} else if (selectNo == 2) {
				// 게시글 조회:제목으로 조회.
				System.out.println("조회할 제목을 입력하세요.");
				String findTitle = sn.nextLine();
				for(int i=0; i<boards.length;i++) {
					if(boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n",
											boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(), 
											boards[i].getCreateDate(), boards[i].getHitCount());
						//카운트 증가.
					int cnt = boards[i].getHitCount();
					boards[i].setHitCount(++cnt);
					}

				}

			} else if (selectNo == 3) {
				System.out.println("수정할 글의 제목을 입력하세요.");
				String findTitle = sn.nextLine();
				for(int i=0;i<boards.length;i++) {
					if(boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("새로 입력할 내용을 작성하세요.");
						String newContent = sn.nextLine();
						boards[i].setContent(newContent);
						
//						System.out.println("새로 입력할 제목을 작성하세요.");
//						String newTitle = sn.nextLine();
//						boards[i].setTitle(newTitle);
					}
				}
				

			} else if (selectNo == 4) {
				System.out.println("삭제할 글의 제목을 입력하세요.");
				String deleteTitle = sn.nextLine();
				for(int i=0;i<boards.length;i++) {
					if(boards[i] != null && boards[i].getTitle().equals(deleteTitle)) {
						boards[i] = null;
					}
				}
				System.out.println("글이 삭제됐습니다.");

			} else if (selectNo == 5) {
				System.out.println("================== 글목록 ==================");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n",
								boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(), 
								boards[i].getCreateDate(), boards[i].getHitCount());
					}
				}

			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다...");
				run = false;
			}
		}
		System.out.println("프로그램 종료.");

	}

}
