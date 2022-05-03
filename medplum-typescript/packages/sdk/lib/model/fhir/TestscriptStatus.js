"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TestscriptStatus = void 0;
exports.TestscriptStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TestscriptStatus.Draft:
                return visitor.draft();
            case exports.TestscriptStatus.Active:
                return visitor.active();
            case exports.TestscriptStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TestscriptStatus.js.map