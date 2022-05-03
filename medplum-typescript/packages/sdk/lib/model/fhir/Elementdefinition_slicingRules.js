"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Elementdefinition_slicingRules = void 0;
exports.Elementdefinition_slicingRules = {
    Closed: "closed",
    Open: "open",
    OpenAtEnd: "openAtEnd",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Elementdefinition_slicingRules.Closed:
                return visitor.closed();
            case exports.Elementdefinition_slicingRules.Open:
                return visitor.open();
            case exports.Elementdefinition_slicingRules.OpenAtEnd:
                return visitor.openAtEnd();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Elementdefinition_slicingRules.js.map