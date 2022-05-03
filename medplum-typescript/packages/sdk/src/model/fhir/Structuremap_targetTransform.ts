export type Structuremap_targetTransform =
    | Structuremap_targetTransform.Create
    | Structuremap_targetTransform.Copy
    | Structuremap_targetTransform.Truncate
    | Structuremap_targetTransform.Escape
    | Structuremap_targetTransform.Cast
    | Structuremap_targetTransform.Append
    | Structuremap_targetTransform.Translate
    | Structuremap_targetTransform.Reference
    | Structuremap_targetTransform.DateOp
    | Structuremap_targetTransform.Uuid
    | Structuremap_targetTransform.Pointer
    | Structuremap_targetTransform.Evaluate
    | Structuremap_targetTransform.Cc
    | Structuremap_targetTransform.C
    | Structuremap_targetTransform.Qty
    | Structuremap_targetTransform.Id
    | Structuremap_targetTransform.Cp;

export const Structuremap_targetTransform = {
    Create: "create" as Structuremap_targetTransform.Create,
    Copy: "copy" as Structuremap_targetTransform.Copy,
    Truncate: "truncate" as Structuremap_targetTransform.Truncate,
    Escape: "escape" as Structuremap_targetTransform.Escape,
    Cast: "cast" as Structuremap_targetTransform.Cast,
    Append: "append" as Structuremap_targetTransform.Append,
    Translate: "translate" as Structuremap_targetTransform.Translate,
    Reference: "reference" as Structuremap_targetTransform.Reference,
    DateOp: "dateOp" as Structuremap_targetTransform.DateOp,
    Uuid: "uuid" as Structuremap_targetTransform.Uuid,
    Pointer: "pointer" as Structuremap_targetTransform.Pointer,
    Evaluate: "evaluate" as Structuremap_targetTransform.Evaluate,
    Cc: "cc" as Structuremap_targetTransform.Cc,
    C: "c" as Structuremap_targetTransform.C,
    Qty: "qty" as Structuremap_targetTransform.Qty,
    Id: "id" as Structuremap_targetTransform.Id,
    Cp: "cp" as Structuremap_targetTransform.Cp,

    _visit: <Result>(
        value: Structuremap_targetTransform,
        visitor: Structuremap_targetTransform._Visitor<Result>
    ): Result => {
        switch (value) {
            case Structuremap_targetTransform.Create:
                return visitor.create();
            case Structuremap_targetTransform.Copy:
                return visitor.copy();
            case Structuremap_targetTransform.Truncate:
                return visitor.truncate();
            case Structuremap_targetTransform.Escape:
                return visitor.escape();
            case Structuremap_targetTransform.Cast:
                return visitor.cast();
            case Structuremap_targetTransform.Append:
                return visitor.append();
            case Structuremap_targetTransform.Translate:
                return visitor.translate();
            case Structuremap_targetTransform.Reference:
                return visitor.reference();
            case Structuremap_targetTransform.DateOp:
                return visitor.dateOp();
            case Structuremap_targetTransform.Uuid:
                return visitor.uuid();
            case Structuremap_targetTransform.Pointer:
                return visitor.pointer();
            case Structuremap_targetTransform.Evaluate:
                return visitor.evaluate();
            case Structuremap_targetTransform.Cc:
                return visitor.cc();
            case Structuremap_targetTransform.C:
                return visitor.c();
            case Structuremap_targetTransform.Qty:
                return visitor.qty();
            case Structuremap_targetTransform.Id:
                return visitor.id();
            case Structuremap_targetTransform.Cp:
                return visitor.cp();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Structuremap_targetTransform {
    export type Create = "create" & {
        __Create: void;
    };
    export type Copy = "copy" & {
        __Copy: void;
    };
    export type Truncate = "truncate" & {
        __Truncate: void;
    };
    export type Escape = "escape" & {
        __Escape: void;
    };
    export type Cast = "cast" & {
        __Cast: void;
    };
    export type Append = "append" & {
        __Append: void;
    };
    export type Translate = "translate" & {
        __Translate: void;
    };
    export type Reference = "reference" & {
        __Reference: void;
    };
    export type DateOp = "dateOp" & {
        __DateOp: void;
    };
    export type Uuid = "uuid" & {
        __Uuid: void;
    };
    export type Pointer = "pointer" & {
        __Pointer: void;
    };
    export type Evaluate = "evaluate" & {
        __Evaluate: void;
    };
    export type Cc = "cc" & {
        __Cc: void;
    };
    export type C = "c" & {
        __C: void;
    };
    export type Qty = "qty" & {
        __Qty: void;
    };
    export type Id = "id" & {
        __Id: void;
    };
    export type Cp = "cp" & {
        __Cp: void;
    };

    export interface _Visitor<Result> {
        create: () => Result;
        copy: () => Result;
        truncate: () => Result;
        escape: () => Result;
        cast: () => Result;
        append: () => Result;
        translate: () => Result;
        reference: () => Result;
        dateOp: () => Result;
        uuid: () => Result;
        pointer: () => Result;
        evaluate: () => Result;
        cc: () => Result;
        c: () => Result;
        qty: () => Result;
        id: () => Result;
        cp: () => Result;
        _unknown: () => Result;
    }
}
