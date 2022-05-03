export declare type NamingsystemKind = NamingsystemKind.Codesystem | NamingsystemKind.Identifier | NamingsystemKind.Root;
export declare const NamingsystemKind: {
    Codesystem: NamingsystemKind.Codesystem;
    Identifier: NamingsystemKind.Identifier;
    Root: NamingsystemKind.Root;
    _visit: <Result>(value: NamingsystemKind, visitor: NamingsystemKind._Visitor<Result>) => Result;
};
export declare namespace NamingsystemKind {
    type Codesystem = "codesystem" & {
        __Codesystem: void;
    };
    type Identifier = "identifier" & {
        __Identifier: void;
    };
    type Root = "root" & {
        __Root: void;
    };
    interface _Visitor<Result> {
        codesystem: () => Result;
        identifier: () => Result;
        root: () => Result;
        _unknown: () => Result;
    }
}
