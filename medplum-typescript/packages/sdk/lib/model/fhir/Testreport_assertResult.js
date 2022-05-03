"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testreport_assertResult = void 0;
exports.Testreport_assertResult = {
    Pass: "pass",
    Skip: "skip",
    Fail: "fail",
    Warning: "warning",
    Error: "error",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testreport_assertResult.Pass:
                return visitor.pass();
            case exports.Testreport_assertResult.Skip:
                return visitor.skip();
            case exports.Testreport_assertResult.Fail:
                return visitor.fail();
            case exports.Testreport_assertResult.Warning:
                return visitor.warning();
            case exports.Testreport_assertResult.Error:
                return visitor.error();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testreport_assertResult.js.map