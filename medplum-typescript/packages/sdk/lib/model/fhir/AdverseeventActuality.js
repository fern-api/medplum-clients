"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AdverseeventActuality = void 0;
exports.AdverseeventActuality = {
    Actual: "actual",
    Potential: "potential",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AdverseeventActuality.Actual:
                return visitor.actual();
            case exports.AdverseeventActuality.Potential:
                return visitor.potential();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AdverseeventActuality.js.map