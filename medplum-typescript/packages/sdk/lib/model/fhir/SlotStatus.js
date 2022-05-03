"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SlotStatus = void 0;
exports.SlotStatus = {
    Busy: "busy",
    Free: "free",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SlotStatus.Busy:
                return visitor.busy();
            case exports.SlotStatus.Free:
                return visitor.free();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SlotStatus.js.map