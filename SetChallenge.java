public class SetChallenge {
    public static void main(String[] args) {

    }
}
/*
    for each of the types that you support, subclass the celestialbody class
    so that your program can create objects of the appropriate type

    although astronomers may shudder at this, our solar systems wil
    allow two bodies to have the same name as long as they are not the
    same type of body: so you could have a star called beta minor and
    an asteroid also called beta minor for example.

    hint: this is much easier to implement for the set thatn it is for the map, because
    the map will need a key that uses both fields.

    there is a restriction that the only satellites that planets can have must be
    moons. Even if you don't implement a star types, though, your program should not prevent
    one being added in the future (and a star's satellites
    can be almost every kind of celestialBody).

    test cases:
    1. the planets and moons that we added in the previous video should appear in
    the solarSystem2 collection and in the sets of moons for the appropriate planets.

    2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

    3. attempting to add a duplicate to a set must result in no change to the set (so
    the original value is not replaced by the new one).

    4. attempting to add a duplicate to a map results in the original being replcaed
    by the new object.

    5. two bodies with the same name but different designaations can be added to the same set.

    6. two bodies with the same name but differenct designations can be added to the same map,
    and can be retrieved from the map.
 */