public void setup() {     
    Cow c = new Cow("cow", "moo");
    System.out.println(c.getType() + " goes " + c.getSound());
    Chick b = new Chick("chick", "moo");
    System.out.println(b.getType() + " goes " + b.getSound());    
    Pig p = new Pig("pig", "moo");
    System.out.println(p.getType() + " goes " + p.getSound());        
}
