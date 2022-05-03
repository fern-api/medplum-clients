export declare type Examplescenario_actorType = Examplescenario_actorType.Person | Examplescenario_actorType.Entity;
export declare const Examplescenario_actorType: {
    Person: Examplescenario_actorType.Person;
    Entity: Examplescenario_actorType.Entity;
    _visit: <Result>(value: Examplescenario_actorType, visitor: Examplescenario_actorType._Visitor<Result>) => Result;
};
export declare namespace Examplescenario_actorType {
    type Person = "person" & {
        __Person: void;
    };
    type Entity = "entity" & {
        __Entity: void;
    };
    interface _Visitor<Result> {
        person: () => Result;
        entity: () => Result;
        _unknown: () => Result;
    }
}
