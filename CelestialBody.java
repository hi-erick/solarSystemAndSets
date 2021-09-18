import java.util.HashSet;
import java.util.Set;

public class CelestialBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<CelestialBody> satellites;
    private final BodyType bodyType;

    public enum BodyType {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public CelestialBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName(){
        return this.name;
    }

    public double getOrbitalPeriod(){
        return this.orbitalPeriod;
    }
    public void addMoon(CelestialBody moon){
        this.satellites.add(moon);
    }
    public Set<CelestialBody> getSatellites(){
        return new HashSet(this.satellites);
    }
    private String getBodyType(){
        return this.bodyType;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof CelestialBody) {
            CelestialBody theObject = (CelestialBody) obj;
            if(this.name.equals(theObject.getName())) {
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }
}