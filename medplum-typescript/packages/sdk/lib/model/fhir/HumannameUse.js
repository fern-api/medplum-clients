"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.HumannameUse = void 0;
exports.HumannameUse = {
    Usual: "usual",
    Official: "official",
    Temp: "temp",
    Nickname: "nickname",
    Anonymous: "anonymous",
    Old: "old",
    Maiden: "maiden",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.HumannameUse.Usual:
                return visitor.usual();
            case exports.HumannameUse.Official:
                return visitor.official();
            case exports.HumannameUse.Temp:
                return visitor.temp();
            case exports.HumannameUse.Nickname:
                return visitor.nickname();
            case exports.HumannameUse.Anonymous:
                return visitor.anonymous();
            case exports.HumannameUse.Old:
                return visitor.old();
            case exports.HumannameUse.Maiden:
                return visitor.maiden();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=HumannameUse.js.map