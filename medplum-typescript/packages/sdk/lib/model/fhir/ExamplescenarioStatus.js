"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ExamplescenarioStatus = void 0;
exports.ExamplescenarioStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ExamplescenarioStatus.Draft:
                return visitor.draft();
            case exports.ExamplescenarioStatus.Active:
                return visitor.active();
            case exports.ExamplescenarioStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ExamplescenarioStatus.js.map