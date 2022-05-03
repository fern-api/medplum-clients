"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DiagnosticreportStatus = void 0;
exports.DiagnosticreportStatus = {
    Registered: "registered",
    Partial: "partial",
    Preliminary: "preliminary",
    Final: "final",
    Amended: "amended",
    Corrected: "corrected",
    Appended: "appended",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DiagnosticreportStatus.Registered:
                return visitor.registered();
            case exports.DiagnosticreportStatus.Partial:
                return visitor.partial();
            case exports.DiagnosticreportStatus.Preliminary:
                return visitor.preliminary();
            case exports.DiagnosticreportStatus.Final:
                return visitor.final();
            case exports.DiagnosticreportStatus.Amended:
                return visitor.amended();
            case exports.DiagnosticreportStatus.Corrected:
                return visitor.corrected();
            case exports.DiagnosticreportStatus.Appended:
                return visitor.appended();
            case exports.DiagnosticreportStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DiagnosticreportStatus.js.map