package cloud.basis;

import cloud.basis.interfaces.MyObjectIF;

public class MyEvent implements MyObjectIF {
  
    public MyEvent(Object source) {
        
    }

    @Override
    public String getPayload() {
        return "PAYLOAD";
    }

    @Override
    public String getActionName() {
        return "ACTIONNAME";
    }
}
