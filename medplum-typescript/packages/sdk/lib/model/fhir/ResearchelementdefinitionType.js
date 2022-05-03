"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResearchelementdefinitionType = void 0;
exports.ResearchelementdefinitionType = {
    Population: "population",
    Exposure: "exposure",
    Outcome: "outcome",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ResearchelementdefinitionType.Population:
                return visitor.population();
            case exports.ResearchelementdefinitionType.Exposure:
                return visitor.exposure();
            case exports.ResearchelementdefinitionType.Outcome:
                return visitor.outcome();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ResearchelementdefinitionType.js.map