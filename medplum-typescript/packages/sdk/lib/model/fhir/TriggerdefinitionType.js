"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TriggerdefinitionType = void 0;
exports.TriggerdefinitionType = {
    Periodic: "periodic",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TriggerdefinitionType.Periodic:
                return visitor.periodic();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TriggerdefinitionType.js.map