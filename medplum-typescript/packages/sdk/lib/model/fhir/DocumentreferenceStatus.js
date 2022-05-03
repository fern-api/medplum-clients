"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DocumentreferenceStatus = void 0;
exports.DocumentreferenceStatus = {
    Current: "current",
    Superseded: "superseded",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DocumentreferenceStatus.Current:
                return visitor.current();
            case exports.DocumentreferenceStatus.Superseded:
                return visitor.superseded();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DocumentreferenceStatus.js.map