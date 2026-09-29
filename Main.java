package lab1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        LegacyBulb bulb=new LegacyBulb();
        LegacyThermostat thermostat=new LegacyThermostat();
        SmartDevice BulbAdapter =new BulbAdapter(bulb);
        SmartDevice ThermostatAdapter=new ThermostatAdapter(thermostat);

        List<SmartDevice> deviceList=List.of(BulbAdapter,ThermostatAdapter);
        ModernHub hub = new ModernHub(deviceList);
        System.out.println("Activate all!");
        hub.activateAll();
        System.out.println("Thermostat: on="+ThermostatAdapter.isOn()+", power="+ThermostatAdapter.getPowerPercent()+"%");
        System.out.println("Bulb: on="+BulbAdapter.isOn()+", power="+BulbAdapter.getPowerPercent()+"%");
        System.out.println("Average power usage:%"+hub.calculateAveragePowerUsage());
        System.out.println("Emergency Shutdown!");
        hub.emergencyShutdown();
        System.out.println("Bulb raw brighteness(0 expected):"+bulb.readBrightness());
        System.out.println("Thermostat dial(IDLE expected)"+thermostat.checkDial());

    }
}
