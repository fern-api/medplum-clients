export type CompositionStatus =
    | CompositionStatus.Preliminary
    | CompositionStatus.Final
    | CompositionStatus.Amended;

export const CompositionStatus = {
    Preliminary: "preliminary" as CompositionStatus.Preliminary,
    Final: "final" as CompositionStatus.Final,
    Amended: "amended" as CompositionStatus.Amended,

    _visit: <Result>(
        value: CompositionStatus,
        visitor: CompositionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case CompositionStatus.Preliminary:
                return visitor.preliminary();
            case CompositionStatus.Final:
                return visitor.final();
            case CompositionStatus.Amended:
                return visitor.amended();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace CompositionStatus {
    export type Preliminary = "preliminary" & {
        __Preliminary: void;
    };
    export type Final = "final" & {
        __Final: void;
    };
    export type Amended = "amended" & {
        __Amended: void;
    };

    export interface _Visitor<Result> {
        preliminary: () => Result;
        final: () => Result;
        amended: () => Result;
        _unknown: () => Result;
    }
}
