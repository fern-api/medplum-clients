"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TerminologycapabilitiesCodesearch = void 0;
exports.TerminologycapabilitiesCodesearch = {
    Explicit: "explicit",
    All: "all",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TerminologycapabilitiesCodesearch.Explicit:
                return visitor.explicit();
            case exports.TerminologycapabilitiesCodesearch.All:
                return visitor.all();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TerminologycapabilitiesCodesearch.js.map