package homeWork1.inmemorymodels;

public interface ModelChanger {

    void notifyChange();
    void registerModelChanger(ModelChangedObserver o);
    void removeModelChanger(ModelChangedObserver o);

}
