"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CodesystemStatus = void 0;
exports.CodesystemStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CodesystemStatus.Draft:
                return visitor.draft();
            case exports.CodesystemStatus.Active:
                return visitor.active();
            case exports.CodesystemStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CodesystemStatus.js.map