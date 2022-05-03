"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Visionprescription_prismBase = void 0;
exports.Visionprescription_prismBase = {
    Up: "up",
    Down: "down",
    In: "in",
    Out: "out",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Visionprescription_prismBase.Up:
                return visitor.up();
            case exports.Visionprescription_prismBase.Down:
                return visitor.down();
            case exports.Visionprescription_prismBase.In:
                return visitor.in();
            case exports.Visionprescription_prismBase.Out:
                return visitor.out();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Visionprescription_prismBase.js.map