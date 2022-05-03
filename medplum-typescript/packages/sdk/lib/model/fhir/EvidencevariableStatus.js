"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EvidencevariableStatus = void 0;
exports.EvidencevariableStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EvidencevariableStatus.Draft:
                return visitor.draft();
            case exports.EvidencevariableStatus.Active:
                return visitor.active();
            case exports.EvidencevariableStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EvidencevariableStatus.js.map