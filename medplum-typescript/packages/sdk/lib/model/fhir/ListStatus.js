"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ListStatus = void 0;
exports.ListStatus = {
    Current: "current",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ListStatus.Current:
                return visitor.current();
            case exports.ListStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ListStatus.js.map