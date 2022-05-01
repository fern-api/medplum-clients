export type SubstanceStatus = SubstanceStatus.Active | SubstanceStatus.Inactive;

export const SubstanceStatus = {
    Active: "active" as SubstanceStatus.Active,
    Inactive: "inactive" as SubstanceStatus.Inactive,

    _visit: <Result>(
        value: SubstanceStatus,
        visitor: SubstanceStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case SubstanceStatus.Active:
                return visitor.active();
            case SubstanceStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace SubstanceStatus {
    export type Active = "active" & {
        __Active: void;
    };
    export type Inactive = "inactive" & {
        __Inactive: void;
    };

    export interface _Visitor<Result> {
        active: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
