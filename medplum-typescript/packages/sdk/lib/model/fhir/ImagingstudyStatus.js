"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImagingstudyStatus = void 0;
exports.ImagingstudyStatus = {
    Registered: "registered",
    Available: "available",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ImagingstudyStatus.Registered:
                return visitor.registered();
            case exports.ImagingstudyStatus.Available:
                return visitor.available();
            case exports.ImagingstudyStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ImagingstudyStatus.js.map