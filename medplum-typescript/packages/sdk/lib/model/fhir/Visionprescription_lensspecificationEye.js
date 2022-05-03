"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Visionprescription_lensspecificationEye = void 0;
exports.Visionprescription_lensspecificationEye = {
    Right: "right",
    Left: "left",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Visionprescription_lensspecificationEye.Right:
                return visitor.right();
            case exports.Visionprescription_lensspecificationEye.Left:
                return visitor.left();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Visionprescription_lensspecificationEye.js.map