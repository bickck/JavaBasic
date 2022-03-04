package Quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberManager {

	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Member> list;
	private File file;

	public MemberManager() {
		list = new ArrayList<>();
		File dir = new File("E:\\test");
		file = new File(dir, "memberData.txt");

		try {
			if (file.createNewFile()) {
				System.out.println(file.getPath() + " 파일 생성");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean findMember(String name) {
		for (Member m : list) {
			if (m.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	// 회원 추가 : list에 동일한 이름이 있으면 들어갈 수 없습니다
	public void insert() {

		String name = null;
		String tel = null;

		while (true) {
			System.out.println("이름과 전화번호를 입력해주세요.");
			name = scanner.nextLine();
			tel = scanner.nextLine();
			if (findMember(name) == true) {
				System.out.println("같은 이름으로는 저장할 수 없습니다.");
			} else {
				break;
			}
		}
		list.add(new Member(name, tel));
		System.out.println("성공적으로 저장하였습니다.");

	} // insert() end

	// 회원 삭제 : 이름을 사용해서 삭제 합니다
	public void delete() {
		String name = null;
		while (true) {
			System.out.println("삭제할 이름을 입력하세요.");
			name = scanner.nextLine();
			if (findMember(name) == false) {
				System.out.println("해당 사용자는 존재하지 않습니다.");
			} else {
				for (Member m : list) {
					list.remove(m);
					System.out.println("성공적으로 삭제 하였습니다.");
				}
				return;
			}
		}

	} // delete() end

	// 회원 목록
	public void view() {
		for (Member m : list) {
			System.out.println(m.toString());
		}
	} // view() end

	// 회원 정보 수정 : 이름을 사용해서 수정합니다
	public void edit() {
		while (true) {
			System.out.println("수정할 이름을 입력해주세요.");
			String name = scanner.nextLine();

			for (Member m : list) {
				if (m.getName().equals(name)) {
					System.out.println("현재 전화번호" + m.getTel());

					System.out.println("수정할 전화번호를 입력하세요.");
					String tel = scanner.next();
					m.setTel(tel);
					return;
				}
			}
			System.out.println("해당 사용자는 업습니다.");
		}
	}

	// 회원 정보 저장 : 지정된 파일에 저장
	public void save() throws IOException {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			for (Member m : list) {
				oos.writeObject(m);
			}
		} catch (Exception e) {
			System.out.println("객제 정보 저장 실패");
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// 회원 정보 파일에서 가져오기
	public void load() throws Exception {
		if(file.length() == 0) return;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			while (true) {
				Member m = (Member) ois.readObject();
				list.add(m);
			}

		} catch (Exception e) {
			System.out.println("Member 클래스가 없거나 변조되었습니다.");
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(file.getPath() + "로드 성공");
	}

	// 종료
	public void end() {
		System.out.println("- Program end -");
		System.exit(0);
	}

	public void start() throws Exception {
		load();
		if (list != null) {
			System.out.println("로드 성공");
		}
	}

}
