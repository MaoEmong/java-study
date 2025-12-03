package ex04;


public class TelevisionTest {
    // 제품 클래스
    static class Television {
        int channel;    // 채널 번호
        int volume;     // 볼륨
        boolean onoff;  // 전원 상태

        // Builder를 이용한 생성자 (외부에서 직접 호출 못 하게 private으로 막는 경우가 많음)
        private Television(Builder builder) {
            this.channel = builder.channel;
            this.volume = builder.volume;
            this.onoff = builder.onoff;
        }

        void print() {
            System.out.println("채널은 " + channel + "이고 " + " 볼륨은 " + volume + "입니다");
        }

        // ✅ Television에 소속된 Builder (static nested class)
        static class Builder {
            int channel;    // 채널 번호
            int volume;     // 볼륨
            boolean onoff;  // 전원 상태

            // 기본 생성자 (필수값이 있다면 여기서 받도록 설계해도 됨)
            public Builder() {
            }

            public Builder setChannel(int c) {
                this.channel = c;
                return this;
            }

            public Builder setVolume(int v) {
                this.volume = v;
                return this;
            }

            public Builder setOnOff(boolean o) {
                this.onoff = o;
                return this;
            }

            public Television build() {
                return new Television(this);
            }
        }
    }

    public static void main(String[] args) {
        Television myTv = new Television.Builder()
                .setChannel(7)
                .setVolume(10)
                .setOnOff(true)
                .build();
        myTv.print();

        Television yourTv = new Television.Builder()
                .setChannel(9)
                .setVolume(12)
                .setOnOff(true)
                .build();
        yourTv.print();
    }
}