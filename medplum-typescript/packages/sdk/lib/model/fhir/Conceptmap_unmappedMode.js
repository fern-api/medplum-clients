"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Conceptmap_unmappedMode = void 0;
exports.Conceptmap_unmappedMode = {
    Provided: "provided",
    Fixed: "fixed",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Conceptmap_unmappedMode.Provided:
                return visitor.provided();
            case exports.Conceptmap_unmappedMode.Fixed:
                return visitor.fixed();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Conceptmap_unmappedMode.js.map