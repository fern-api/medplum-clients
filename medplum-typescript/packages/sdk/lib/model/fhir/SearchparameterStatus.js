"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchparameterStatus = void 0;
exports.SearchparameterStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SearchparameterStatus.Draft:
                return visitor.draft();
            case exports.SearchparameterStatus.Active:
                return visitor.active();
            case exports.SearchparameterStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SearchparameterStatus.js.map