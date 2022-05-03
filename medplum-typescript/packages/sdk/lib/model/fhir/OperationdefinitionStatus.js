"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.OperationdefinitionStatus = void 0;
exports.OperationdefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.OperationdefinitionStatus.Draft:
                return visitor.draft();
            case exports.OperationdefinitionStatus.Active:
                return visitor.active();
            case exports.OperationdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=OperationdefinitionStatus.js.map