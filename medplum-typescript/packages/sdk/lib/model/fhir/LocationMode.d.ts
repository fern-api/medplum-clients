export declare type LocationMode = LocationMode.Instance | LocationMode.Kind;
export declare const LocationMode: {
    Instance: LocationMode.Instance;
    Kind: LocationMode.Kind;
    _visit: <Result>(value: LocationMode, visitor: LocationMode._Visitor<Result>) => Result;
};
export declare namespace LocationMode {
    type Instance = "instance" & {
        __Instance: void;
    };
    type Kind = "kind" & {
        __Kind: void;
    };
    interface _Visitor<Result> {
        instance: () => Result;
        kind: () => Result;
        _unknown: () => Result;
    }
}
