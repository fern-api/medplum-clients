"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FamilymemberhistoryStatus = void 0;
exports.FamilymemberhistoryStatus = {
    Partial: "partial",
    Completed: "completed",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.FamilymemberhistoryStatus.Partial:
                return visitor.partial();
            case exports.FamilymemberhistoryStatus.Completed:
                return visitor.completed();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=FamilymemberhistoryStatus.js.map