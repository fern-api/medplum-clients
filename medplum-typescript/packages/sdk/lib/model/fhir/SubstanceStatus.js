"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SubstanceStatus = void 0;
exports.SubstanceStatus = {
    Active: "active",
    Inactive: "inactive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SubstanceStatus.Active:
                return visitor.active();
            case exports.SubstanceStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SubstanceStatus.js.map