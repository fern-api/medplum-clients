"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.NamingsystemStatus = void 0;
exports.NamingsystemStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.NamingsystemStatus.Draft:
                return visitor.draft();
            case exports.NamingsystemStatus.Active:
                return visitor.active();
            case exports.NamingsystemStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=NamingsystemStatus.js.map