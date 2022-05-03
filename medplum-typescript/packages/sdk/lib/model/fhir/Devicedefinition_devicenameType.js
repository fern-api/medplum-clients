"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Devicedefinition_devicenameType = void 0;
exports.Devicedefinition_devicenameType = {
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Devicedefinition_devicenameType.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Devicedefinition_devicenameType.js.map