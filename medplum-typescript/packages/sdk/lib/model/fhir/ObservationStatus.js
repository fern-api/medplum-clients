"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ObservationStatus = void 0;
exports.ObservationStatus = {
    Registered: "registered",
    Preliminary: "preliminary",
    Final: "final",
    Amended: "amended",
    Corrected: "corrected",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ObservationStatus.Registered:
                return visitor.registered();
            case exports.ObservationStatus.Preliminary:
                return visitor.preliminary();
            case exports.ObservationStatus.Final:
                return visitor.final();
            case exports.ObservationStatus.Amended:
                return visitor.amended();
            case exports.ObservationStatus.Corrected:
                return visitor.corrected();
            case exports.ObservationStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ObservationStatus.js.map