public class TankTester {

    public static void main(String[] args) {
        Fish coral = new Fish("Coral", "Clownfish");
        Fish finn = new Fish("Finn", "Blue Tang");
        Fish pip = new Fish("Pip", "Clownfish");
        Tank tank = new Tank("Reef Room", new Fish[] {coral, null, finn, pip});

        // Uncomment each block as you finish that method.

        System.out.println("isSafeTemp(25.5): " + WaterUtils.isSafeTemp(25.5));

        System.out.println("isSafeTemp(\"25.5\"): " + WaterUtils.isSafeTemp("25.5"));

        System.out.println("isSafeTemp(24.0): " + WaterUtils.isSafeTemp(24.0));

        System.out.println("isSafeTemp(\"24.0\"): " + WaterUtils.isSafeTemp(24.0));

        System.out.println("isSafeTemp(27.0): " + WaterUtils.isSafeTemp(27.0));

        System.out.println("isSafeTemp(\"27.0\"): " + WaterUtils.isSafeTemp(27.0));

        System.out.println("isSafeTemp(23.9): " + WaterUtils.isSafeTemp(23.9));

        System.out.println("isSafeTemp(\"23.9\"): " + WaterUtils.isSafeTemp(23.9));

        System.out.println("isSafeTemp(27.1): " + WaterUtils.isSafeTemp(27.1));

        System.out.println("isSafeTemp(\"27.1\"): " + WaterUtils.isSafeTemp(27.1));

        
        Fish mystery = new Fish("Dot");
        System.out.println("mystery.getSpecies(): " + mystery.getSpecies());

        coral.feed(1, 15);
        coral.feed(3, 20);
        coral.feed(3, 5);
        System.out.println("coral.getFeedings()[4]: " + coral.getFeedings()[4]);

        System.out.println("coral.totalFed(): " + coral.totalFed());

        System.out.println("coral.busiestDay(): " + coral.busiestDay());

        int[] copy = coral.copyFeedings();
        copy[1] = 99;
        System.out.println("coral.getFeedings()[1] after changing the copy: "
                 + coral.getFeedings()[1]);

         System.out.println("coral.lastFeeding(): " + coral.lastFeeding());
         System.out.println("finn.lastFeeding(): " + finn.lastFeeding());

         System.out.println("coral: " + coral);

         System.out.println("coral.equals(pip): " + coral.equals(pip));

         RareFish sunny = new RareFish("Sunny", "Mandarin Dragonet", "Fiji");
         System.out.println("sunny.getOrigin(): " + sunny.getOrigin());

         System.out.println("sunny: " + sunny);

         System.out.println("tank.findByName(\"Pip\"): " + tank.findByName("Pip"));

         System.out.println("tank.countSpecies(\"Clownfish\"): "
                 + tank.countSpecies("Clownfish"));

        System.out.println("tank: " + tank);
    }
}
