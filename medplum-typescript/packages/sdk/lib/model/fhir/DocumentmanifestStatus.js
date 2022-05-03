"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DocumentmanifestStatus = void 0;
exports.DocumentmanifestStatus = {
    Current: "current",
    Superseded: "superseded",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DocumentmanifestStatus.Current:
                return visitor.current();
            case exports.DocumentmanifestStatus.Superseded:
                return visitor.superseded();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DocumentmanifestStatus.js.map