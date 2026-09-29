package lab1;

public class ThermostatAdapter implements SmartDevice{
    private final LegacyThermostat thermostat;
    public ThermostatAdapter(LegacyThermostat thermostat){
        this.thermostat=thermostat;
        if(thermostat==null){
            throw new IllegalArgumentException();
        }
    }
    public void turnOn(){
        if("IDLE".equals(thermostat.checkDial())){
            thermostat.rotateDial("LOW");
        }
    }
    public void turnOff(){
        thermostat.rotateDial("IDLE");
    }
    public boolean isOn(){
        if("LOW".equals(thermostat.checkDial())||"MEDIUM".equals(thermostat.checkDial())||"MAX".equals(thermostat.checkDial())){
            return true;
        }
        return false;
    }
    public int getPowerPercent(){
        if("LOW".equals(thermostat.checkDial())){
            return 33;
        }
        if("MEDIUM".equals(thermostat.checkDial())){
            return 66;
        }
        if("MAX".equals(thermostat.checkDial())){
            return 100;
        }
        return 0;
    }

}
