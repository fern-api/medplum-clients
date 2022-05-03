"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TestreportResult = void 0;
exports.TestreportResult = {
    Pass: "pass",
    Fail: "fail",
    Pending: "pending",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TestreportResult.Pass:
                return visitor.pass();
            case exports.TestreportResult.Fail:
                return visitor.fail();
            case exports.TestreportResult.Pending:
                return visitor.pending();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TestreportResult.js.map