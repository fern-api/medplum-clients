"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MessagedefinitionStatus = void 0;
exports.MessagedefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.MessagedefinitionStatus.Draft:
                return visitor.draft();
            case exports.MessagedefinitionStatus.Active:
                return visitor.active();
            case exports.MessagedefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=MessagedefinitionStatus.js.map