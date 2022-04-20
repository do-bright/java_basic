package j17_최상위클래스.controller;

import j17_최상위클래스.config.Context;
import j17_최상위클래스.repository.user.User;
import j17_최상위클래스.service.UserService;

@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    // // final 이라 아래에서 무조건 매개변수로 받아야함
    // public MainController(UserService userService) {
    // this.userService = userService;
    // } -> @RequiredArgsConstructor

    public void signup(){
        User user = userService.addUser(Context.getInstance().getScanner());
        System.out.println("[추가된 사용자 정보]");
        System.out.println(user);
    }

    public void signin() {
        // 아이디 비밀번호 입력받아서 해당 정보가 일치하면 로그인 성공. 출력 
        System.out.println("[로그인]");
    }

    public void showUserAll(){
        System.out.println("[전체 사용자 리스트]");
        for (User user:userService.getUserAll()){
            System.out.println(user);
        }
    }

    public void searchUser(){
        System.out.println("[사용자 조회]");
        User user = userService.getUserByUserName(Context.getInstance().getScanner());    
        System.out.println("[조회된 사용자 정보]");
        System.out.println(user);
    }


}
