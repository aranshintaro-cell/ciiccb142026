interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
       
        return timeToEat;
    }
    public void groom() {
        
    }
    public void pet() {
        
    }
}