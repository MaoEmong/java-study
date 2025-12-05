package example01;

// 사원 데이터
public class Employee {
    private String name;        // 이름
    private String phone;       // 전화번호
    private String dept;        // 부서
    private int empNo;          // 사원번호
    private int salary;         // 월급 (정수, 단위: 원)
    private String account;     // 계좌번호
    private String position;    // 직급 (예: "사원", "대리", "과장", "부장")

    //region Get/Set 메서드
    // Get
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDept() {
        return dept;
    }

    public int getEmpNo() {
        return empNo;
    }

    public int getSalary() {
        return salary;
    }

    public String getAccount() {
        return account;
    }

    public String getPosition() {
        return position;
    }

    // Set
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //endregion

    //region Employee 생성자 오버로딩
    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
        dept = "미정";
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    public Employee(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee(String name, String phone, String dept, int empNo, int salary, String account, String position) {
        this.name = name;
        this.phone = phone;
        if (dept.isBlank())
            dept = "공백";
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        if (account.isBlank())
            account = "공백";
        this.account = account;
        if (position.isBlank())
            position = "공백";
        this.position = position;

    }
    //endregion

    // 세부정보 출력
    public void printInfo() {
        System.out.println(getName() + " / " + getPhone() + " / " + getDept() +
                " / 사원번호: " + getEmpNo() + " / " + "직급: " + getPosition() +
                " / 월급: " + getSalary() + " / 계좌: " + getAccount());
    }

    // 연봉값 확인
    public int calcYearSalary() {
        return getSalary() * 12;
    }

    // 연봉값 확인(보너스 포함)
    public int calcYearSalarywithBonus() {
        int salary = getSalary();
        double bonus = 0.0;

        String position = getPosition();
        if (position.equals("사원")) bonus = 1.1;
        else if (position.equals("대리")) bonus = 1.2;
        else if (position.equals("과장")) bonus = 1.3;
        else if (position.equals("부장")) bonus = 1.4;
        else bonus = 0.0;

        return (int) (salary * bonus);
    }

    // 승진시키기
    public void promote() {
        String position = getPosition();
        String nextPosition = " ";
        if (position.equals("부장")) {
            System.out.println("더이상 진급이 불가능 합니다.");
            return;
        } else {
            if (position.equals("사원")) nextPosition = "대리";
            else if (position.equals("대리")) nextPosition = "과장";
            else if (position.equals("과장")) nextPosition = "부장";
            else {
                System.out.println("직급이 잘못 설정되어있습니다.");
                return;
            }
            setSalary((int) (salary * 1.1));
        }
        System.out.println(getName() + position + "에서 " + nextPosition + "로 진급합니다.");
        setPosition(nextPosition);
    }

    public void paySalary() {
        double bonus = 0;
        System.out.println("[급여 이체 완료] " + getName() + getPosition() + "님께 " +
                calcYearSalarywithBonus() + "원이 " + account + " 계좌로 지급되었습니다.");
    }


}
