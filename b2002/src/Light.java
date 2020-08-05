public class Light {
        boolean lightSwitchPosition;
        static String time ="day";
        int x;

        public Light(){
            System.out.println("This is defult constractor");

        }

        //parameterized constructor
    public Light(int y){
        System.out.println("constructor with parameter: " + y);
    }
    public void turnOnLight(){
            lightSwitchPosition = true;
        System.out.println("Light is turned on");
    }
    public void turnOffLight(){
            lightSwitchPosition = false;
        System.out.println("Light is turned off");
    }
    public void createLightObjectByParameterizedOperaor(){
            Light tubeLight = new Light(2);
            if(time == "day"){
                tubeLight.turnOffLight();
            }
            else{
                tubeLight.turnOnLight();
            }
    }

    public static void main(String[] args){
            Light bedLight = new Light();
            bedLight.createLightObjectByParameterizedOperaor();
    }
}
