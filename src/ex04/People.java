package ex04;

public class People implements Cloneable {

    private String name;    // 이름
    private int height; // 키
    private int weight; // 무게

    // 디폴트 생성자
    People() {
    }

    // 생성자 오버로딩
    People(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    People(People origin) {
        this.name = origin.name;
        this.weight = origin.weight;
        this.height = origin.height;
    }

    // 빌더 패턴
    People(Builder builder) {
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public People Clone() {
        return new People(this);
    }

    // 상태 변경
    public void 밥먹기() {
        weight = weight + 2;
    }

    // 상태 확인
    public int getWeight() {
        return weight;
    }

    static class Builder {
        String name;
        int height;
        int weight;

        public Builder() {
        }

        public Builder setname(String name) {
            this.name = name;
            return this;
        }

        public Builder setheight(int height) {
            this.height = height;
            return this;
        }

        public Builder setweight(int weight) {
            this.weight = weight;
            return this;
        }

        public People Build() {
            return new People(this);
        }

    }

}
