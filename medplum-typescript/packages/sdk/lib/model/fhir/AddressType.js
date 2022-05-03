"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AddressType = void 0;
exports.AddressType = {
    Postal: "postal",
    Physical: "physical",
    Both: "both",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AddressType.Postal:
                return visitor.postal();
            case exports.AddressType.Physical:
                return visitor.physical();
            case exports.AddressType.Both:
                return visitor.both();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AddressType.js.map