package 연락처;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfileMain {

	private static void printProfile(Profile p) {
		System.out.println("이름 : " + p.getName());
		System.out.println("번호 : " + p.getPhone());
		System.out.println("그룹 : " + p.getGroup());
		System.out.println("생년월일 : " + p.getBirth());
		System.out.println("==================");
	}
	
	// 에러의 종류
	// 1) 구문 오류(Syntax Error)
	// : 실행하기 전에, 구문(문법)에 문제가 있을 때 발생하는 에러
	// 2) 예외 상황(Exception)
	// : 실행을 하고 나서, JVM이 컴파일하는 과정에 발생하는 "예외 상황"

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 연락처 정보들을 저장할 수 있는 profileList 생성
		ArrayList<Profile> profileList = new ArrayList<Profile>();
		// 임의데이터 추가하기
		profileList.add(new Profile("김운비", "01012345678", "스마트인재개발원", "20250417"));
		profileList.add(new Profile("박수현", "01056781234", "풀스택과정", "20250416"));
		profileList.add(new Profile("김이수", "01011112222", "스마트인재개발원", "20220417"));
		profileList.add(new Profile("김미희", "01022223333", "풀스택과정", "20230417"));
		profileList.add(new Profile("김자영", "01033334444", "스마트인재개발원", "20240417"));

		while (true) {
			System.out.print("[1]연락처추가 [2]연락처조회 [3]연락처삭제 [4]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("=====연락처추가=====");
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("번호 입력");
				String phone = sc.next();
				System.out.print("그룹 입력");
				String group = sc.next();
				System.out.print("생년월일 입력");
				String birth = sc.next();

				// 입력받은 데이터를 하나로 묶어주기
//				Profile profile = new Profile(name, phone, group, birth);
				// 전화번호부 추가
				profileList.add(new Profile(name, phone, group, birth));
				System.out.println("연락처가 추가되었습니다.");
			} else if (input == 2) {
				System.out.println("=====연락처조회=====");
				while (true) {
					System.out.print("[1]전체조회 [2]이름검색 [3]그룹검색 >> ");
					int select = sc.nextInt();
					if (select == 1) {
						for (int i = 0; i < profileList.size(); i++) {
							printProfile(profileList.get(i));
						}
					} else if (select == 2) {
						System.out.print("검색할 이름을 입력하세요 >> ");
						String inputName = sc.next();
						boolean chk = false;
						for (Profile p : profileList) {
							if (p.getName().contains(inputName)) {
								chk = true;
								printProfile(p);
							}
						}
						// 조회된 결과가 없을 때, chk --> false --> true로 만들어줘야함
						if (!chk)
							System.out.println("조회된 결과가 없습니다.");

//						for (int i = 0; i < profileList.size(); i++) {
//							if (profileList.get(i).getName().contains(inputName)) {
//								System.out.println("이름 : " + profileList.get(i).getName());
//								System.out.println("번호 : " + profileList.get(i).getPhone());
//								System.out.println("그룹 : " + profileList.get(i).getGroup());
//								System.out.println("생년월일 : " + profileList.get(i).getBirth());
//								System.out.println("==================");
//							}
//						}
					} else if (select == 3) {
						System.out.println("=====그룹별 조회======");
						// 1. 그룹이름들을 저장하는 ArrayList 생성
						ArrayList<String> group = new ArrayList<String>();
						// 2. 저장되어있는 연락처 정보들에서 중복없이 그룹명만 추출해서 저장
						for (Profile p : profileList) {
							if (!group.contains(p.getGroup()))
								group.add(p.getGroup());
						}
						// 3. 그룹별로 연락처 정보들을 출력
						for (String g : group) {
							System.out.println("그룹명 : " + g);
							for (Profile p : profileList) {
								if (g.equals(p.getGroup())) {
									System.out.println("이름 : " + p.getName());
									System.out.println("번호 : " + p.getPhone());
									System.out.println("생년월일 : " + p.getBirth());
								}
							}
							System.out.println("===============");
						}
//						for (int i = 0; i < group.size(); i++) {
//							System.out.println("그룹명 : " + group.get(i));
//							for (Profile p : profileList) {
//								if (group.get(i).equals(p.getGroup())) {
//									System.out.println("이름 : " + p.getName());
//									System.out.println("번호 : " + p.getPhone());
//									System.out.println("생년월일 : " + p.getBirth());
//								}
//							}
//							System.out.println("===============");
//						}
					} else
						break;

				}
			} else if (input == 3) {
				System.out.println("=====연락처삭제=====");
				while (true) {
					System.out.print("[1]이름으로 삭제 [2]전체삭제 [3]종료 >> ");
					int del = sc.nextInt();
					boolean chk = false;
					if (del == 1) {
						System.out.print("삭제할 이름을 입력하세요 >> ");
						String name = sc.next();
						try {

							// for-each구문은 동작할때, 내부적으로 사용하는 도구가 있다.
							// Iterator 도구 >> 배열을 받아오면, 반복문이 끝나기전까지 이 배열을 고정 해놓으려고 함.
							// remove 도구 >> 배열을 수정하려고 함.
							// 2개의 도구가 충돌했을 때, 발생하는 ConcurrentModificationExceoption

							for (Profile p : profileList) {
								if (p.getName().equals(name)) {
									chk = true;
									printProfile(p);
									// Java에서 예외상황을 처리하는 방법
									// try - catch - finally
									// 1) try : 일단 코드를 실행해봐
									// 2) catch : try 구문 안쪽에서 코드를 실행하다가 발생하는
									// 예외가 있다면 예외상황 발생 시 어떤 코드를
									// 실행할 건지 잡아주는 구간
									// 3) finally : try가 제대로 끝나거나 or catch 로 들어가서 예외를
									// 잡아주거나 상관없이 무조건 1번은 실행해야하는 구문
									// >> Resource(Scanner 등)를 반납시키는 코드를 작성
									profileList.remove(p);
									System.out.println("======해당 데이터를 삭제합니다.======");
									break;
								}
							}
						} catch (Exception e) {
							// 개발자 확인용도
							// e.printStackTrace();
							System.out.println("서비스 점검중입니다.");
						} finally {
							// 사용하던 Resource 반납시키기
//							sc.close();
						}
//						for (int i = 0; i < profileList.size(); i++) {
//							if (profileList.get(i).getName().equals(name)) {
//								chk = true;
//								System.out.println("이름 : " + profileList.get(i).getName());
//								System.out.println("번호 : " + profileList.get(i).getPhone());
//								System.out.println("그룹 : " + profileList.get(i).getGroup());
//								System.out.println("생년월일 : " + profileList.get(i).getBirth());
//								System.out.println("==================");
//								try {
//									profileList.remove(i);
//									System.out.println("======해당 데이터를 삭제합니다.======");
//								} catch (Exception e) {
//									// 개발자 확인용도
//									// e.printStackTrace();
//									System.out.println("서비스 점검중입니다.");
//								} finally {
//									// 사용하던 Resource 반납시키기
//									sc.close();
//								}
//							}
//						}
						if (!chk)
							System.out.println("조회된 결과가 없습니다.");
					} else if (del == 2) {

					} else
						break;
				}

			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
