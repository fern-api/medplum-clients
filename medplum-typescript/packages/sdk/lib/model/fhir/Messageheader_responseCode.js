"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Messageheader_responseCode = void 0;
exports.Messageheader_responseCode = {
    Ok: "ok",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Messageheader_responseCode.Ok:
                return visitor.ok();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Messageheader_responseCode.js.map