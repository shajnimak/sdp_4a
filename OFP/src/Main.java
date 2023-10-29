public class Main {
    public static void main(String[] args) {
        VacancyFactory factory = new ConcreteVacancyFactory();

        VacancyPublisher publisher = factory.createVacancyPublisher();

        Observer subscriber1 = new Subscriber("Shadyman Mutigolla");
        Observer subscriber2 = new Subscriber("Nurbol Zhaksylyk");

        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);

        publisher.addVacancy("Back-end(Spring) dev");
        publisher.addVacancy("Angular dev");
    }
}
