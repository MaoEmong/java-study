package example01;

import java.util.Scanner;

public class Company {
    // region 상수값 설정
    private final int MAIN_MENU = 0;
    private final int EMPLOYEE_LIST = 1;
    private final int EMPLOYEE_DATA = 2;
    private final int REGISTER_EMPLOYEE = 3;
    private final int PAY_SALARY = 4;
    //endregion

    // 등록된 사원들의 정보
    private Employee[] employees = new Employee[10];
    // 입력값 받기
    private Scanner sc = new Scanner(System.in);
    // 현재 시스템 출력 상태값
    private int system = 0;
    // 입력받은 값
    private String input = "";
    // 선택중인 직원 인덱스
    private int selectEmp = -1;
    // 프로그램 동작 여부
    private boolean isRun = false;
    
    // 사원관리 프로그램 시작
    public void systemStart() {
        isRun = true;
        System.out.println("사원 관리 프로그램 동작 시작");

        while (isRun) {
            // 메세지 출력
            printMenu();

            // 입력값 받기
            inputMenu();

            // 입력값 처리
            actionMenu();
        }

        System.out.println("사원 관리 프로그램 시스템 종료");
    }

    // 더미 데이터 추가
    public void addDumy()
    {
        // 이름 + 전화번호만 알고있음
        employees[0] = new Employee("홍길동","010-1111-1111");
        employees[0].setEmpNo(1001);
        employees[0].setSalary(3000000);
        employees[0].setAccount("111-111-111111");
        employees[0].setPosition("사원");
        // 이름 + 전화번호 + 부서를 알고있음
        employees[1] = new Employee("김철수", "010-2222-2222", "인사팀");
        employees[1].setEmpNo(1002);
        employees[1].setSalary(2800000);
        employees[1].setAccount("222-222-222222");
        employees[1].setPosition("대리");

        // 모든 정보를 알고 있음
        employees[2] = new Employee(
                "이영희",
                "010-3333-3333",
                "영업팀",
                1003,
                3500000,
                "333-333-333333",
                "과장"
        );
    }

    // 메뉴 출력
    private void printMenu() {
        switch (system) {
            case MAIN_MENU:
                mainMenu();
                break;
            case EMPLOYEE_LIST:
                employeeListMenu();
                break;
            case EMPLOYEE_DATA:
                printSelectEmployeeMenu();
                break;
            case REGISTER_EMPLOYEE:
                printRegister();
                break;
            case PAY_SALARY:
                printPaySalary();
                break;
        }
    }

    // 입력값 받기
    private void inputMenu() {
        input = sc.next();
        System.out.println();
    }

    // 입력받은 값을 기반으로 각 메뉴에서 처리
    private void actionMenu() {
        switch (system) {
            case MAIN_MENU:
                mainMenuInputAction();
                break;
            case EMPLOYEE_LIST:
                printEmployeeData();
                break;
            case EMPLOYEE_DATA:
                selectEmployeeAction();
                break;
            case REGISTER_EMPLOYEE:
                registerEmployee();
                break;
            case PAY_SALARY:
                startPaySalary();
                break;
        }
    }

    // 메인 메뉴
    private void mainMenu() {
        System.out.println("메뉴를 선택해주세요.");
        System.out.println("1. 사원 리스트 / 2. 사원 추가 / 3. 급여 관리 / 4. 프로그램 종료");
        System.out.print(">> ");
    }

    // 메인메뉴 에서 다른 메뉴로 이동 처리
    private void mainMenuInputAction() {
        if (input.equals("1")) {
            system = EMPLOYEE_LIST;
        } else if (input.equals("2")) {
            system = REGISTER_EMPLOYEE;
        } else if (input.equals("3")) {
            system = PAY_SALARY;
        } else if (input.equals("4")) {
            isRun = false;
        }
    }


    // 사원 리스트 출력
    private void employeeListMenu() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) System.out.println((i + 1) + ". 데이터 없음");
            else
            {
                System.out.print((i+1)+". ");
                employees[i].printInfo();
            }
        }
        System.out.println();
        System.out.println("확인하려는 직원의 번호를 입력해주세요.");
        System.out.println("번호 외 입력 시 뒤로 돌아가기.");
        System.out.println(">> ");
    }

    // 사원 세부정보 출력
    private void printEmployeeData() {
        int select = Integer.parseInt(input);
        if (select <= 0 || select > employees.length) {
            system = MAIN_MENU;
            return;
        }
        if (employees[select - 1] == null) {
            System.out.println("해당 데이터가 존재하지 않습니다");
            System.out.println();
        } else {
            selectEmp = select;
            employees[selectEmp - 1].printInfo();
            system = EMPLOYEE_DATA;
        }
    }

    // 사원 세부정보 처리
    private void printSelectEmployeeMenu() {
        System.out.println("1. 연봉확인 / 2. 보너스포함 연봉확인 / 3. 직원 승진 / 기타. 메인메뉴 이동");
        System.out.println(">> ");
    }

    // 확인중인 사원 정보에서 기타 동작 실행
    private void selectEmployeeAction() {
        int select = Integer.parseInt(input);
        if (select == 1) {
            System.out.println(employees[selectEmp - 1].getName() + "의 연봉은 " +
                    employees[selectEmp - 1].calcYearSalary() + "입니다");
        } else if (select == 2) {
            System.out.println(employees[selectEmp - 1].getName() + "의 보너스 포함 연봉은 " +
                    employees[selectEmp - 1].calcYearSalarywithBonus() + "입니다");
        } else if (select == 3) {
            employees[selectEmp - 1].promote();
        } else {
            system = MAIN_MENU;
        }
    }

    // 사원등록 문구 출력
    private void printRegister() {
        System.out.println("사원 등록을 시작합니다.");
        System.out.println("1. 등록 시작 / 2. 돌아가기");
        System.out.println(">> ");
    }


    // 사원 등록
    private void registerEmployee() {
        if (Integer.parseInt(input) == 2) {
            System.out.println("메인메뉴로 돌아갑니다");
            system = MAIN_MENU;
            return;
        }


        boolean empty = false;
        int emptyIndex = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                empty = true;
                emptyIndex = i;
                break;
            }
            if (!empty) {
                System.out.println("현재 사원 목록이 가득 차있습니다");
                System.out.println("메인 메뉴로 돌아갑니다");
                system = MAIN_MENU;
                return;
            }
        }
        String name;
        String phone;
        String dept;
        int empNo;
        int salary;
        String account;
        String position;

        Scanner regiSc = new Scanner(System.in);
        System.out.println("사원 데이터를 추가합니다");
        System.out.println("이름을 입력해주세요");
        System.out.print(">> ");
        name = regiSc.next();
        System.out.println("전화번호를 입력해주세요");
        System.out.print(">> ");
        phone = regiSc.next();
        System.out.println("부서를 입력해주세요 \n부서가 없을 시 공백");
        System.out.print(">> ");
        regiSc.nextLine();
        dept = regiSc.nextLine();
        System.out.println("사원 번호를 입력해주세요 \n급여 미정 시 0");
        System.out.print(">> ");
        empNo = regiSc.nextInt();
        System.out.println("월 급여를 입력해주세요 \n급여 미정 시 0");
        System.out.print(">> ");
        salary = regiSc.nextInt();
        System.out.println("계좌번호를 입력해주세요 \n계좌번호 모를 시 공백");
        System.out.print(">> ");
        regiSc.nextLine();
        account = regiSc.nextLine();
        System.out.println("직급을 입력해주세요 \n직급 미정 시 공백");
        System.out.print(">> ");
        regiSc.nextLine();
        position = regiSc.nextLine();
        if (position.equals("") || position.equals(" "))
            position = "사원";
        employees[emptyIndex] = new Employee(name, phone, dept, empNo, salary, account, position);

        System.out.println("사원 데이터 생성이 완료되었습니다.\n메인 메뉴로 돌아갑니다");
        System.out.println();
        system = MAIN_MENU;
    }

    // 급여관리
    private void printPaySalary() {
        System.out.println("사원들에게 이 달의 급여를 지급하시겠습니까?");
        System.out.println("1. 전체 지급 /2. 돌아가기");
        System.out.print(">> ");
    }
    private void startPaySalary()
    {
        if(Integer.parseInt(input) == 2)
        {
            System.out.println("메인 메뉴로 돌아갑니다.");
        }
        else
        {
            for(int i = 0 ; i < employees.length;i++)
            {
                if(employees[i] == null)
                {
                    System.out.println((i+1)+". 데이터 없음");
                }
                else
                {
                    System.out.print((i+1)+" ");
                    employees[i].paySalary();
                }
            }
            System.out.println("지급이 완료되었습니다.");
            System.out.println();
        }
        system = MAIN_MENU;
    }
}
