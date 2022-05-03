"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GuidanceresponseStatus = void 0;
exports.GuidanceresponseStatus = {
    Success: "success",
    Failure: "failure",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.GuidanceresponseStatus.Success:
                return visitor.success();
            case exports.GuidanceresponseStatus.Failure:
                return visitor.failure();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=GuidanceresponseStatus.js.map