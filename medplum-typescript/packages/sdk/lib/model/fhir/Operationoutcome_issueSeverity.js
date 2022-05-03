"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Operationoutcome_issueSeverity = void 0;
exports.Operationoutcome_issueSeverity = {
    Fatal: "fatal",
    Error: "error",
    Warning: "warning",
    Information: "information",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Operationoutcome_issueSeverity.Fatal:
                return visitor.fatal();
            case exports.Operationoutcome_issueSeverity.Error:
                return visitor.error();
            case exports.Operationoutcome_issueSeverity.Warning:
                return visitor.warning();
            case exports.Operationoutcome_issueSeverity.Information:
                return visitor.information();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Operationoutcome_issueSeverity.js.map