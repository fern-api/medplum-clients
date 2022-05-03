"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testreport_operationResult = void 0;
exports.Testreport_operationResult = {
    Pass: "pass",
    Skip: "skip",
    Fail: "fail",
    Warning: "warning",
    Error: "error",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testreport_operationResult.Pass:
                return visitor.pass();
            case exports.Testreport_operationResult.Skip:
                return visitor.skip();
            case exports.Testreport_operationResult.Fail:
                return visitor.fail();
            case exports.Testreport_operationResult.Warning:
                return visitor.warning();
            case exports.Testreport_operationResult.Error:
                return visitor.error();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testreport_operationResult.js.map