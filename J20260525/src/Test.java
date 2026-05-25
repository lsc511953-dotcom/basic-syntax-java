/**
 * 实现笔记本电脑使⽤USB⿏标、USB键盘的例⼦
 * 1.USB接⼝：包含打开设备、关闭设备功能
 * 2.笔记本类：包含开机功能、关机功能、使⽤USB设备功能
 * 3.⿏标类：实现USB接⼝，并具备点击功能
 * 4.键盘类：实现USB接⼝，并具备输⼊功能
 */

interface USB{
    void openDevice();
    void closeDevice();
}

class Mouse implements USB{


    @Override
    public void openDevice() {
        System.out.println("打开鼠标服务");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标服务");
    }

    public void click() {
        System.out.println("开始用鼠标点击....");
    }
}

class KeyBoard implements USB{

    @Override
    public void openDevice() {
        System.out.println("打开键盘服务");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘服务");
    }

    public void input() {
        System.out.println("开始用键盘输入数据....");
    }
}

class Computer{
    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");

    }

    public void UseDevice(USB usb) {
        usb.openDevice();
        if(usb instanceof  KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.input();
        }else if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        usb.closeDevice();
    }

}

public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        Computer computer = new Computer();

        computer.powerOn();

        computer.UseDevice(keyBoard);

        computer.UseDevice(mouse);

        computer.powerOff();
    }
}
