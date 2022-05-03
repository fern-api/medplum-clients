"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchparameterXpathusage = void 0;
exports.SearchparameterXpathusage = {
    Normal: "normal",
    Phonetic: "phonetic",
    Nearby: "nearby",
    Distance: "distance",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SearchparameterXpathusage.Normal:
                return visitor.normal();
            case exports.SearchparameterXpathusage.Phonetic:
                return visitor.phonetic();
            case exports.SearchparameterXpathusage.Nearby:
                return visitor.nearby();
            case exports.SearchparameterXpathusage.Distance:
                return visitor.distance();
            case exports.SearchparameterXpathusage.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SearchparameterXpathusage.js.map