"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SupplydeliveryStatus = void 0;
exports.SupplydeliveryStatus = {
    Completed: "completed",
    Abandoned: "abandoned",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SupplydeliveryStatus.Completed:
                return visitor.completed();
            case exports.SupplydeliveryStatus.Abandoned:
                return visitor.abandoned();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SupplydeliveryStatus.js.map