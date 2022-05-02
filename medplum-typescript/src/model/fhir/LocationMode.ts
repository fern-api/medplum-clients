export type LocationMode = LocationMode.Instance | LocationMode.Kind;

export const LocationMode = {
    Instance: "instance" as LocationMode.Instance,
    Kind: "kind" as LocationMode.Kind,

    _visit: <Result>(
        value: LocationMode,
        visitor: LocationMode._Visitor<Result>
    ): Result => {
        switch (value) {
            case LocationMode.Instance:
                return visitor.instance();
            case LocationMode.Kind:
                return visitor.kind();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace LocationMode {
    export type Instance = "instance" & {
        __Instance: void;
    };
    export type Kind = "kind" & {
        __Kind: void;
    };

    export interface _Visitor<Result> {
        instance: () => Result;
        kind: () => Result;
        _unknown: () => Result;
    }
}
