package Fan;
    public class ElectricPowerSwitchTest {

        public static void main(String[] args){

                Switchable switchableBulb=new LightBulb();
                Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
                bulbPowerSwitch.press();
                bulbPowerSwitch.press();
                Switchable switchableFan=new Fan();
                Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
                fanPowerSwitch.press();
                fanPowerSwitch.press();
            }
    }
