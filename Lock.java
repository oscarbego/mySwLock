package app;


public class Lock {
        
    private boolean state = true;
    private boolean isOn = false;
            
    private void _on() { state = true; }
    
    private void _off(){ state = false; }
    
    
    public void setLock(boolean l){
    
        if(!isOn)
            state = l;
    }
    
    
    public OnOff checkLock(){
    
    
        if(state)
            return new OnOff() {
                
                String msg = "El candado esta puesto ";
                @Override
                public void on() {

                    System.out.println(msg);
                }

                @Override
                public void off() {

                    System.out.println(msg);
                }
            };
        
        
        return new OnOff() {
            @Override
            public void on() {
                
                System.out.println(" . . . . . . On . . . . . . ");
                _on();
            }

            @Override
            public void off() {
                
                System.out.println(" . . . . . . Off . . . . . . ");
                _off();
            }
        };
        
    }
}


interface OnOff {

    public void on();
    
    public void off();
}

