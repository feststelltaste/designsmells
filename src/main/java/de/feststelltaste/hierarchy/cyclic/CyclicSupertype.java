package de.feststelltaste.hierarchy.cyclic;

public class CyclicSupertype {

    private String data;
    private CyclicSubtype subtype = new CyclicSubtype();

    private void callSubtype() {
        this.data = subtype.getData();
    }

}
