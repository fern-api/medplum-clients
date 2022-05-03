"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ConsentStatus = void 0;
exports.ConsentStatus = {
    Draft: "draft",
    Proposed: "proposed",
    Active: "active",
    Rejected: "rejected",
    Inactive: "inactive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ConsentStatus.Draft:
                return visitor.draft();
            case exports.ConsentStatus.Proposed:
                return visitor.proposed();
            case exports.ConsentStatus.Active:
                return visitor.active();
            case exports.ConsentStatus.Rejected:
                return visitor.rejected();
            case exports.ConsentStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ConsentStatus.js.map