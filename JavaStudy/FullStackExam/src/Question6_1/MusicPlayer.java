package Question6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectNum = 0;
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();

		while (true) {
			System.out.println("===== 뮤직 플레이어 =====");
			System.out.print("[1]등록 [2]목록 [3]삭제 [4]전체삭제 [5]종료 >> ");
			selectNum = sc.nextInt();
			if (selectNum == 1) {
				System.out.println("===== 등록 =====");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playTime = sc.nextInt();
				MusicVO music = new MusicVO(title, singer, playTime);
				list.add(music);
			} else if (selectNum == 2) {
				System.out.println("===== 노래 목록 =====");
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". 제목 : " + list.get(i).getTitle() + "\t가수 : "
							+ list.get(i).getSinger() + "\t시간 : " + list.get(i).getPlayTime());
				}
			} else if (selectNum == 3) {
				// 삭제
				System.out.println("===== 노래 목록 =====");
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". 제목 : " + list.get(i).getTitle() + "\t가수 : "
							+ list.get(i).getSinger() + "\t시간 : " + list.get(i).getPlayTime());
				}
				System.out.println("===== 노래 삭제 =====");
				System.out.print("삭제하고 싶은 노래 번호 입력 >> ");
				int delNum = sc.nextInt();
				System.out.println(list.get(delNum - 1).getTitle() + " 노래를 삭제합니다.");
				list.remove(delNum - 1);
			} else if (selectNum == 4) {
				System.out.println("===== 전체노래 삭제 =====");
				System.out.println("전체 노래가 삭제되었습니다.");
				list.clear();
			} else if (selectNum == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
	}

}
