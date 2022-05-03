"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Patient_linkType = void 0;
exports.Patient_linkType = {
    Replaces: "replaces",
    Refer: "refer",
    Seealso: "seealso",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Patient_linkType.Replaces:
                return visitor.replaces();
            case exports.Patient_linkType.Refer:
                return visitor.refer();
            case exports.Patient_linkType.Seealso:
                return visitor.seealso();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Patient_linkType.js.map