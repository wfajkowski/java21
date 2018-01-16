class MarsApplication {
    public static void main(String[] arguments){
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "sen";
        opportunity.speed = 0;
        opportunity.temperature = 0;
        
        spirit.showAttributes();
        System.out.println("Zwiększenie predkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();
        
        opportunity.showAttributes();
    }
}