package co.edu.Board;

import java.util.List;
// 메뉴 선택 => 선택값 => 구현
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		BoardDAO board = BoardDAO.getInstance();

		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			int s1 = Integer.parseInt(sn.nextLine());
			if (s1 == 1) {
				System.out.println(board.boardList().toString());
				System.out.println("목록이 출력되었습니다.");

			} else if (s1 == 2) {
				System.out.println("글제목을 입력하세요.");
				String title = sn.nextLine();
				System.out.println("작성자를 입력하세요.");
				String name = sn.nextLine();
				System.out.println("글내용을 입력하세요.");
				String content = sn.nextLine();
				board.add(new Board(title, name, content));
				System.out.println("작성글이 등록되었습니다.");
				

			} else if (s1 == 3) {
				System.out.println("작성자를 입력하세요.");
				String name = sn.nextLine();
				System.out.println(board.search(name));

			} else if (s1 == 4) {
				System.out.println("삭제할 글의 제목을 입력하세요.");
				String s6 = sn.nextLine();
				board.remove(s6);
				System.out.println("글이 삭제됐습니다.");

			} else if (s1 == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
	}


}
