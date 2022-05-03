"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchparameterComparatorItem = void 0;
exports.SearchparameterComparatorItem = {
    Eq: "eq",
    Ne: "ne",
    Gt: "gt",
    Lt: "lt",
    Ge: "ge",
    Le: "le",
    Sa: "sa",
    Eb: "eb",
    Ap: "ap",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SearchparameterComparatorItem.Eq:
                return visitor.eq();
            case exports.SearchparameterComparatorItem.Ne:
                return visitor.ne();
            case exports.SearchparameterComparatorItem.Gt:
                return visitor.gt();
            case exports.SearchparameterComparatorItem.Lt:
                return visitor.lt();
            case exports.SearchparameterComparatorItem.Ge:
                return visitor.ge();
            case exports.SearchparameterComparatorItem.Le:
                return visitor.le();
            case exports.SearchparameterComparatorItem.Sa:
                return visitor.sa();
            case exports.SearchparameterComparatorItem.Eb:
                return visitor.eb();
            case exports.SearchparameterComparatorItem.Ap:
                return visitor.ap();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SearchparameterComparatorItem.js.map