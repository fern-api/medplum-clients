"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.NarrativeStatus = void 0;
exports.NarrativeStatus = {
    Generated: "generated",
    Extensions: "extensions",
    Additional: "additional",
    Empty: "empty",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.NarrativeStatus.Generated:
                return visitor.generated();
            case exports.NarrativeStatus.Extensions:
                return visitor.extensions();
            case exports.NarrativeStatus.Additional:
                return visitor.additional();
            case exports.NarrativeStatus.Empty:
                return visitor.empty();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=NarrativeStatus.js.map