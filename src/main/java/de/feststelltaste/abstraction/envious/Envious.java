package de.feststelltaste.abstraction.envious;

public class Envious {

    private Target target = new Target();

    private void foobar() {}

    private void baz() {
        foobar();
    }

    private void qux() {
        target.foo();
    }

    private void quux() {
        target.bar();
    }
}
