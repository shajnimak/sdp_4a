import java.util.ArrayList;
import java.util.List;

class VacancyPublisher implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private List<String> vacancies = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String vacancy) {
        for (Observer observer : subscribers) {
            observer.update(vacancy);
        }
    }

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers(vacancy);
    }
}
