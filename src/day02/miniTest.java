package day02;

public class miniTest {
    public static void main(String[] args) {
        Phone sonPhone = new Samsung("삐비빅");
        Owner son = new Owner("야 내가 핸드폰 켜볼게", sonPhone);

        son.turnOnPhone();

        Phone beckhamPhone = new Apple("bbeep");
        Owner beckham = new Owner("turn on", beckhamPhone);

        beckham.turnOnPhone(); // 각자 구분했음
    }
}

class Owner {
    private String text;
    private Phone phone;

    Owner(String text, Phone phone) {
        this.text = text;
        this.phone = phone;
    }

    void turnOnPhone() {
        System.out.println(text);
        phone.turnOn();
    }
}

class Phone {
    String beepSound;


    void turnOn() {
        System.out.println(beepSound);
    }
}

class Samsung extends Phone {
    Samsung(String beepSound) {
        this.beepSound = beepSound;
    }
}

class Apple extends Phone {
    Apple(String beepSound) {
        this.beepSound = beepSound;
    }
}

// 리드미에는 markdown 적용!
