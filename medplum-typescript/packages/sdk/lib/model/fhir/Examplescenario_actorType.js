"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Examplescenario_actorType = void 0;
exports.Examplescenario_actorType = {
    Person: "person",
    Entity: "entity",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Examplescenario_actorType.Person:
                return visitor.person();
            case exports.Examplescenario_actorType.Entity:
                return visitor.entity();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Examplescenario_actorType.js.map