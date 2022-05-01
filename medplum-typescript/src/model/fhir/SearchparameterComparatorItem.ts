export type SearchparameterComparatorItem =
    | SearchparameterComparatorItem.Eq
    | SearchparameterComparatorItem.Ne
    | SearchparameterComparatorItem.Gt
    | SearchparameterComparatorItem.Lt
    | SearchparameterComparatorItem.Ge
    | SearchparameterComparatorItem.Le
    | SearchparameterComparatorItem.Sa
    | SearchparameterComparatorItem.Eb
    | SearchparameterComparatorItem.Ap;

export const SearchparameterComparatorItem = {
    Eq: "eq" as SearchparameterComparatorItem.Eq,
    Ne: "ne" as SearchparameterComparatorItem.Ne,
    Gt: "gt" as SearchparameterComparatorItem.Gt,
    Lt: "lt" as SearchparameterComparatorItem.Lt,
    Ge: "ge" as SearchparameterComparatorItem.Ge,
    Le: "le" as SearchparameterComparatorItem.Le,
    Sa: "sa" as SearchparameterComparatorItem.Sa,
    Eb: "eb" as SearchparameterComparatorItem.Eb,
    Ap: "ap" as SearchparameterComparatorItem.Ap,

    _visit: <Result>(
        value: SearchparameterComparatorItem,
        visitor: SearchparameterComparatorItem._Visitor<Result>
    ): Result => {
        switch (value) {
            case SearchparameterComparatorItem.Eq:
                return visitor.eq();
            case SearchparameterComparatorItem.Ne:
                return visitor.ne();
            case SearchparameterComparatorItem.Gt:
                return visitor.gt();
            case SearchparameterComparatorItem.Lt:
                return visitor.lt();
            case SearchparameterComparatorItem.Ge:
                return visitor.ge();
            case SearchparameterComparatorItem.Le:
                return visitor.le();
            case SearchparameterComparatorItem.Sa:
                return visitor.sa();
            case SearchparameterComparatorItem.Eb:
                return visitor.eb();
            case SearchparameterComparatorItem.Ap:
                return visitor.ap();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace SearchparameterComparatorItem {
    export type Eq = "eq" & {
        __Eq: void;
    };
    export type Ne = "ne" & {
        __Ne: void;
    };
    export type Gt = "gt" & {
        __Gt: void;
    };
    export type Lt = "lt" & {
        __Lt: void;
    };
    export type Ge = "ge" & {
        __Ge: void;
    };
    export type Le = "le" & {
        __Le: void;
    };
    export type Sa = "sa" & {
        __Sa: void;
    };
    export type Eb = "eb" & {
        __Eb: void;
    };
    export type Ap = "ap" & {
        __Ap: void;
    };

    export interface _Visitor<Result> {
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
