"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CompositionStatus = void 0;
exports.CompositionStatus = {
    Preliminary: "preliminary",
    Final: "final",
    Amended: "amended",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CompositionStatus.Preliminary:
                return visitor.preliminary();
            case exports.CompositionStatus.Final:
                return visitor.final();
            case exports.CompositionStatus.Amended:
                return visitor.amended();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CompositionStatus.js.map