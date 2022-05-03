"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MeasurereportType = void 0;
exports.MeasurereportType = {
    Individual: "individual",
    Summary: "summary",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.MeasurereportType.Individual:
                return visitor.individual();
            case exports.MeasurereportType.Summary:
                return visitor.summary();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=MeasurereportType.js.map