package homeWork1.modelelement;

import java.util.Collection;

public class Scene {

    //TODO: Доработать в рамках домашней работы
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
    }
}

