public class main {
    public void randomRelationship(Person first,Person second){
        int randomChoice = (int)(Math.random()*5);
        switch (randomChoice){
            case 1:
                System.out.println(first+" is the brother of "+ second);
                break;
            case 2:
                System.out.println(first+" is the sister of "+ second);
                break;
            case 3:
                System.out.println(first+" is the mother of "+ second);
                break;
            case 4:
                System.out.println(first+" is the father of "+ second);
                break;
            case 5:
                System.out.println(first+" is the lover of "+ second);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person jake = new Person(25,"Jake");
        Person maindy = new Person(17,"Maindy");
        Person bob = new Person(999,"B̴̛͉̖̲̻̈́̒́́͑̎̓̉͘͝͝͠Ǫ̴̻̱̜̰̹̬̒̃̽̑̓͐́̀̍̆͜Ḇ̷̡̦͙̰̥͎̹̏̔̈́̊̓͒̓͊͂̎̀͝");
        Person jane = new Person(-3,"Jane");
        Person billy = new Person(78,"Billy");
        randomRelationship(billy,bob);
    }

}
