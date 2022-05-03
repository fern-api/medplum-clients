"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TerminologycapabilitiesStatus = void 0;
exports.TerminologycapabilitiesStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TerminologycapabilitiesStatus.Draft:
                return visitor.draft();
            case exports.TerminologycapabilitiesStatus.Active:
                return visitor.active();
            case exports.TerminologycapabilitiesStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TerminologycapabilitiesStatus.js.map