export type NamingsystemKind =
    | NamingsystemKind.Codesystem
    | NamingsystemKind.Identifier
    | NamingsystemKind.Root;

export const NamingsystemKind = {
    Codesystem: "codesystem" as NamingsystemKind.Codesystem,
    Identifier: "identifier" as NamingsystemKind.Identifier,
    Root: "root" as NamingsystemKind.Root,

    _visit: <Result>(
        value: NamingsystemKind,
        visitor: NamingsystemKind._Visitor<Result>
    ): Result => {
        switch (value) {
            case NamingsystemKind.Codesystem:
                return visitor.codesystem();
            case NamingsystemKind.Identifier:
                return visitor.identifier();
            case NamingsystemKind.Root:
                return visitor.root();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace NamingsystemKind {
    export type Codesystem = "codesystem" & {
        __Codesystem: void;
    };
    export type Identifier = "identifier" & {
        __Identifier: void;
    };
    export type Root = "root" & {
        __Root: void;
    };

    export interface _Visitor<Result> {
        codesystem: () => Result;
        identifier: () => Result;
        root: () => Result;
        _unknown: () => Result;
    }
}
