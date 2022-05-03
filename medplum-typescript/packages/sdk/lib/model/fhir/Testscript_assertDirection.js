"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testscript_assertDirection = void 0;
exports.Testscript_assertDirection = {
    Response: "response",
    Request: "request",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testscript_assertDirection.Response:
                return visitor.response();
            case exports.Testscript_assertDirection.Request:
                return visitor.request();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testscript_assertDirection.js.map