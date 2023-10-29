class ConcreteVacancyFactory implements VacancyFactory {
    @Override
    public VacancyPublisher createVacancyPublisher() {
        return new VacancyPublisher();
    }
}
