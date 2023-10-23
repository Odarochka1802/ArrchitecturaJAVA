package Seminar3;

import java.awt.*;

public abstract class Car {

    private Refueling refueling;

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    private CarWash carWash;

    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }

    public void clean(Integer my_case) {
        switch (my_case) {
            case 1:
                carWash.wipHeadlights();
                break;
            case 2:
                carWash.wipMirrors();
                break;
            case 3:
                carWash.wipWindshield();
                break;
            default:
                System.out.println("Invalid case.");
                break;
        }
    }

        protected void setWheelsCount ( int wheelsCount){
            this.wheelsCount = wheelsCount;
        }

        public int getWheelsCount () {
            return wheelsCount;
        }

        // Движение
        public abstract void movement ();
        // Обслуживание
        public abstract void maintenance ();
        // Переключение передач
        public abstract boolean gearShifting ();
        // Включение фар
        public abstract boolean switchHeadlights ();
        // Включение дворников
        public abstract boolean switchWipers ();

        //region Конструкторы

    public Car(String make, String model, Color color) {
            this.make = make;
            this.model = model;
            this.color = color;
        }

        //endregion

        //region Поля

        // Марка автомобиля
        private String make;

        // Модель
        private String model;

        // Цвет
        private Color color;

        // Тип
        protected CarType type;

        // Число колес
        private int wheelsCount;

        // Тип топлива
        protected FuelType fuelType = FuelType.Diesel;

        // Тип коробки передач
        private GearboxType gearboxType;

        // Объем двигателя
        private double engineCapacity;

        // Состояние противотуманных фар
        private boolean fogLights = false;

        //endregion


    }
