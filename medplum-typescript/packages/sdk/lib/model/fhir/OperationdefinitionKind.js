"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.OperationdefinitionKind = void 0;
exports.OperationdefinitionKind = {
    Operation: "operation",
    Query: "query",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.OperationdefinitionKind.Operation:
                return visitor.operation();
            case exports.OperationdefinitionKind.Query:
                return visitor.query();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=OperationdefinitionKind.js.map