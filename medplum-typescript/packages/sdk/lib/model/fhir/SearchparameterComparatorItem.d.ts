export declare type SearchparameterComparatorItem = SearchparameterComparatorItem.Eq | SearchparameterComparatorItem.Ne | SearchparameterComparatorItem.Gt | SearchparameterComparatorItem.Lt | SearchparameterComparatorItem.Ge | SearchparameterComparatorItem.Le | SearchparameterComparatorItem.Sa | SearchparameterComparatorItem.Eb | SearchparameterComparatorItem.Ap;
export declare const SearchparameterComparatorItem: {
    Eq: SearchparameterComparatorItem.Eq;
    Ne: SearchparameterComparatorItem.Ne;
    Gt: SearchparameterComparatorItem.Gt;
    Lt: SearchparameterComparatorItem.Lt;
    Ge: SearchparameterComparatorItem.Ge;
    Le: SearchparameterComparatorItem.Le;
    Sa: SearchparameterComparatorItem.Sa;
    Eb: SearchparameterComparatorItem.Eb;
    Ap: SearchparameterComparatorItem.Ap;
    _visit: <Result>(value: SearchparameterComparatorItem, visitor: SearchparameterComparatorItem._Visitor<Result>) => Result;
};
export declare namespace SearchparameterComparatorItem {
    type Eq = "eq" & {
        __Eq: void;
    };
    type Ne = "ne" & {
        __Ne: void;
    };
    type Gt = "gt" & {
        __Gt: void;
    };
    type Lt = "lt" & {
        __Lt: void;
    };
    type Ge = "ge" & {
        __Ge: void;
    };
    type Le = "le" & {
        __Le: void;
    };
    type Sa = "sa" & {
        __Sa: void;
    };
    type Eb = "eb" & {
        __Eb: void;
    };
    type Ap = "ap" & {
        __Ap: void;
    };
    interface _Visitor<Result> {
        eq: () => Result;
        ne: () => Result;
        gt: () => Result;
        lt: () => Result;
        ge: () => Result;
        le: () => Result;
        sa: () => Result;
        eb: () => Result;
        ap: () => Result;
        _unknown: () => Result;
    }
}
