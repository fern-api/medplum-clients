"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Encounter_locationStatus = void 0;
exports.Encounter_locationStatus = {
    Planned: "planned",
    Active: "active",
    Reserved: "reserved",
    Completed: "completed",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Encounter_locationStatus.Planned:
                return visitor.planned();
            case exports.Encounter_locationStatus.Active:
                return visitor.active();
            case exports.Encounter_locationStatus.Reserved:
                return visitor.reserved();
            case exports.Encounter_locationStatus.Completed:
                return visitor.completed();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Encounter_locationStatus.js.map