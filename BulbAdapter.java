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
       return bulb.hasPower() &&bulb.readBrightness() > 0;
    }
    public int getPowerPercent(){
        final int K=1;
        int raw= bulb.readBrightness();
        if(raw==0){
            return 0;
        }
        int calibrated=(raw*100)/255+K;
        if(calibrated>100){
            return 100;
        }
        return calibrated;


    }


}
