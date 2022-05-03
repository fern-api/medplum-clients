"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImplementationguideStatus = void 0;
exports.ImplementationguideStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ImplementationguideStatus.Draft:
                return visitor.draft();
            case exports.ImplementationguideStatus.Active:
                return visitor.active();
            case exports.ImplementationguideStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ImplementationguideStatus.js.map