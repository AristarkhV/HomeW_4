package App;

public class PlaneBuilder {
    private Plane newPlane;

    public PlaneBuilder() {
        newPlane = new Plane();
    }

    public PlaneBuilder addType(String type) {
        newPlane.setType(type);
        return this;
    }

    public PlaneBuilder addEngineNumber(int number) {
        newPlane.setEngineNumber(number);
        return this;
    }

    public PlaneBuilder addFuselage(String fuselage) {
        newPlane.setFuselage(fuselage);
        return this;
    }

    public PlaneBuilder addWing(String wing) {
        newPlane.setFuselage(wing);
        return this;
    }

    public Plane builder() {
        return newPlane;
    }
}
