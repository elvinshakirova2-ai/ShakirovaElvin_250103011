package lab1;

public class BulbAdapter implements SmartDevice{
    private final LegacyBulb bulb;
    public BulbAdapter(LegacyBulb bulb){
        this.bulb=bulb;

        if(bulb==null){
            throw new IllegalArgumentException();
        }

    }
    public void turnOn(){
        bulb.setBrightness(255);

    }
    public void turnOff(){
        bulb.setBrightness(0);

    }
    public boolean isOn(){
       if(bulb.hasPower()==true && bulb.readBrightness())
    }


}
