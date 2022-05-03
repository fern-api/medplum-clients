"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MeasureStatus = void 0;
exports.MeasureStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.MeasureStatus.Draft:
                return visitor.draft();
            case exports.MeasureStatus.Active:
                return visitor.active();
            case exports.MeasureStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=MeasureStatus.js.map