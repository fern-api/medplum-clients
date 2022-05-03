"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EncounterStatus = void 0;
exports.EncounterStatus = {
    Planned: "planned",
    Arrived: "arrived",
    Triaged: "triaged",
    Onleave: "onleave",
    Finished: "finished",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EncounterStatus.Planned:
                return visitor.planned();
            case exports.EncounterStatus.Arrived:
                return visitor.arrived();
            case exports.EncounterStatus.Triaged:
                return visitor.triaged();
            case exports.EncounterStatus.Onleave:
                return visitor.onleave();
            case exports.EncounterStatus.Finished:
                return visitor.finished();
            case exports.EncounterStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EncounterStatus.js.map