"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Encounter_statushistoryStatus = void 0;
exports.Encounter_statushistoryStatus = {
    Planned: "planned",
    Arrived: "arrived",
    Triaged: "triaged",
    Onleave: "onleave",
    Finished: "finished",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Encounter_statushistoryStatus.Planned:
                return visitor.planned();
            case exports.Encounter_statushistoryStatus.Arrived:
                return visitor.arrived();
            case exports.Encounter_statushistoryStatus.Triaged:
                return visitor.triaged();
            case exports.Encounter_statushistoryStatus.Onleave:
                return visitor.onleave();
            case exports.Encounter_statushistoryStatus.Finished:
                return visitor.finished();
            case exports.Encounter_statushistoryStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Encounter_statushistoryStatus.js.map