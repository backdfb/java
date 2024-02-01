package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Book.BookVO;

public class Main {
	//MVC Pattern - view
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BookController bc = new BookController();
		MP3Player mp3 = new MP3Player();
		int menu = 0;
		int i = 0;

		while (true) {
			System.out.println("=============뮤직 플레이어=================");
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
			menu = sc.nextInt();
			if (menu == 6) {
				System.out.println("종료되었습니다.");
				break;
			} else if (menu == 1) {
				System.out.println("=============등록=================");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playTime = sc.nextInt();
				mc.insertMusic(title, singer, playTime);
			} else if (menu == 2) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("목록이 비어있습니다. ");
				} else {
					mc.showMusic();
				}
			} else if (menu == 3) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("실행할 곡이 없습니다. ");
					break;
				} else {
					mc.play(i);
				}
			} else if (menu == 4) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("재생할 곡이 없습니다. ");
					break;
				} else if (list.size() == 1) {
					System.out.println("곡이 하나입니다. ");
					break;
				}
				if (i == 0) {
					i = list.size() - 1;
					mc.play(i);
				} else {
					i -= 1;
					mc.play(i);
				}
			} else if (menu == 5) {
				ArrayList<MusicVO> list = mc.getList();
				if (list.size() == 0) {
					System.out.println("재생할 곡이 없습니다. ");
					break;
				} else if (list.size() == 1) {
					System.out.println("곡이 하나입니다. ");
					break;
				}
				if (i == list.size() - 1) {
					i = 0;
					mc.play(i);
				} else {
					i += 1;
					mc.play(i);
				}
			}
		}
	}
}
