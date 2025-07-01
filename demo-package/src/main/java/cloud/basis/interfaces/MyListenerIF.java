package cloud.basis.interfaces;

import java.util.EventListener;

public interface MyListenerIF extends EventListener {
  public void onEventTriggered(MyObjectIF object);
}
