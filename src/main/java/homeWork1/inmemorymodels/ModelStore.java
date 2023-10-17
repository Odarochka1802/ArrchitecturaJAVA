package homeWork1.inmemorymodels;

import homeWork1.modelelement.PoligonalModel;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {
    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    /**
     * Добавляет модель
     *
     * @param model добавляемая модель
     */
    public void addModel(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    /**
     * Удаляет модель
     *
     * @param model удаляемая модель
     */
    public void removeModel(PoligonalModel model) {
        models.remove(model);
        notifyChange();
    }

    /**
     * Возвращает коллекцию моделей
     *
     * @return коллекция моделей
     */
    public Collection<PoligonalModel> getModels() {
        return models;
    }

    /**
     * Нотифицирует о событии
     */
    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : changeObservers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }
}

