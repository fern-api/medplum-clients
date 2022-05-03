"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MessagedefinitionResponserequired = void 0;
exports.MessagedefinitionResponserequired = {
    Always: "always",
    Never: "never",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.MessagedefinitionResponserequired.Always:
                return visitor.always();
            case exports.MessagedefinitionResponserequired.Never:
                return visitor.never();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=MessagedefinitionResponserequired.js.map