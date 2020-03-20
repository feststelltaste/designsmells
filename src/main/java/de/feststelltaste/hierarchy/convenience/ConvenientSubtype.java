package de.feststelltaste.hierarchy.convenience;

public class ConvenientSubtype extends ConcreteSupertype {

    public void convenientUse() {
        foo();
        bar();
        baz();
        qux();
    }

    @Override
    public void foo() {
//        MATCH
//                (subtype:Class)-[:EXTENDS]->(supertype:Class)-[:DECLARES]->(concreteMethod:Method)
//        WHERE
//        NOT concreteMethod:Constructor
//        OPTIONAL MATCH
//        (subtype)-[:DECLARES]->(member:Member)-[i:INVOKES]->(inheritedMember:Member)
//        WHERE
//        inheritedMember.signature = concreteMethod.signature
//        RETURN
//                *
    }
}
