export type Examplescenario_actorType =
    | Examplescenario_actorType.Person
    | Examplescenario_actorType.Entity;

export const Examplescenario_actorType = {
    Person: "person" as Examplescenario_actorType.Person,
    Entity: "entity" as Examplescenario_actorType.Entity,

    _visit: <Result>(value: Examplescenario_actorType, visitor: Examplescenario_actorType._Visitor<Result>): Result => {
        switch (value) {
            case Examplescenario_actorType.Person: return visitor.person();
            case Examplescenario_actorType.Entity: return visitor.entity();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Examplescenario_actorType {
    export type Person = "person" & {
        __Person: void,
    };
    export type Entity = "entity" & {
        __Entity: void,
    };

    export interface _Visitor<Result> {
        person: () => Result;
        entity: () => Result;
        _unknown: () => Result;
    }
}
