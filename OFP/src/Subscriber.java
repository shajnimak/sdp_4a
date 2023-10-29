class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String vacancy) {
        System.out.println(name + " received a new vacancy: " + vacancy);
    }
}
