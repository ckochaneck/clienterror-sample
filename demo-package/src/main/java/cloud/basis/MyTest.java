package cloud.basis;

import javax.swing.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import cloud.basis.interfaces.MyObjectIF;
import cloud.basis.interfaces.MyListenerIF;

public class MyTest extends JComponent {
    protected final List<MyListenerIF> listeners = new CopyOnWriteArrayList<>();

    public MyTest() {
    }


    protected void fireEvent(MyObjectIF object) {
      for (MyListenerIF listener: listeners) {
        listener.onEventTriggered(object);
      }
    }

    public void addActionEventListener(MyListenerIF listener) {
        listeners.add(listener);
    }

    public void removeActionEventListener(MyListenerIF listener) {
      listeners.remove(listener);
    }
}
