import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Devil extends Thread {
  public void run() {
    try {
    boolean flag = true;
    int numFlag =1;
    do {
        flag = !flag;
        numFlag++;
        Thread.sleep(60000);
        if(numFlag%2==0)
        	System.out.println("Numlock on");
        else
        	System.out.println("Numlock off");
        Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent. VK_NUM_LOCK, flag);
    }
    while(true);
    }
    catch(Exception e) {}
  }

  public static void main(String[] args) throws Exception {
    new Devil().start();
  }
}