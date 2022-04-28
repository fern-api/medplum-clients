export type TriggerdefinitionType =
    | TriggerdefinitionType.Periodic;

export const TriggerdefinitionType = {
    Periodic: "periodic" as TriggerdefinitionType.Periodic,

    _visit: <Result>(value: TriggerdefinitionType, visitor: TriggerdefinitionType._Visitor<Result>): Result => {
        switch (value) {
            case TriggerdefinitionType.Periodic: return visitor.periodic();
            default: return visitor._unknown();
        }
    },
};

export declare namespace TriggerdefinitionType {
    export type Periodic = "periodic" & {
        __Periodic: void,
    };

    export interface _Visitor<Result> {
        periodic: () => Result;
        _unknown: () => Result;
    }
}
